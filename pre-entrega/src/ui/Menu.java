package ui;

import java.util.Arrays;
import java.util.Scanner;

import model.Product;
import service.ProductService;
import util.Validator;

public class Menu {

    private final Scanner sc;
    private final ProductService service;
    
    public Menu(Scanner sc, ProductService service){
        this.sc=sc;
        this.service=service;
    }
    
    public static void printMenu() {
        System.out.println("\n");
        System.out.println("0 Salir");
        System.out.println("1 Agregar producto");
        System.out.println("2 Listar productos");
        System.out.println("3 Buscar producto por ID");
        System.out.println("4 Actualizar producto");
        System.out.println("5 Eliminiar producto");
    }
    public void runMenu() {
        int opcion;
        do {
            printMenu();
            opcion = Validator.readInt(sc, "\nElija una opción: ");

            try {
                switch (opcion) {
                    case 0 -> System.out.println("¡Hasta luego!");
                    case 1 -> addProduct();
                    case 2 -> listProduct();
                    case 3 -> findProduct();
                    case 4 -> updateProduct();
                    case 5 -> deleteProduct();
                    default -> System.out.println("Opción inválida (0-5).");
                }
                // catch (ProductNotFoundException | InsufficientStockException | IllegalArgumentException e) {
            }catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 0);
    }
    
    public void addProduct(){
        System.out.println("-----Nuevo Producto-----");
        String name = Validator.readString(sc, "Nombre:");
        double price = Validator.readDouble(sc, "Precio:");
        int stock = Validator.readInt(sc, "Stock:");
        String category = Validator.readString(sc, "Categoría:");

        Product product = new Product(name,price,stock,category);
        Product saved= service.saveProduct(product);
        
        System.out.println("Producto guardado con id: "+ saved.getId());
        
    }

    public void listProduct(){
        service.listAll().forEach(System.out::println);
    }

    public void findProduct(){
        int id= Validator.readInt(sc, "Ingrese ID: ");
        try{
        System.out.print(service.getProductById(id));
        }catch (Exception e){
            System.err.println("Producto no encotrado");

        }
    }

    public void updateProduct(){
        int id = Validator.readInt(sc, "Ingrese ID del producto a actualizar: ");
        try {
            Product actualProduct = service.getProductById(id);
            System.out.println("Producto a modificar :\n" + actualProduct + "\n");
        } catch (Exception e) {
            System.out.println("No existe el producto con id: "+ id);
        }
        Product newProduct = new Product(
            Validator.readString(sc, "Nombre: "),
            Validator.readDouble(sc,"Precio: "),
            Validator.readInt(sc, "Stock :"),
            Validator.readString(sc, "Cateoría: ")
        ); 

        service.updateProduct(id, newProduct);
    }

    public void deleteProduct(){
        try {
            service.deleteProduct(Validator.readInt(sc,"Ingrese ID: "));
        } catch (Exception e) {
            System.err.println("Producto no encontrado");
        }
    }
}
