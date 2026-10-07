package ui;

import java.util.Arrays;
import java.util.Scanner;

import service.ProductService;

public class Menu {

    private final Scanner sc;
    private final ProductService service;
    
    public Menu(Scanner sc, ProductService service){
        this.sc=sc;
        this.service=service;
    }
    
    public static void printMenu() {
        System.out.println("0 Salir");
        System.out.println("1 Listar productos");
        System.out.println("2 Agregar producto");
        System.out.println("3 Buscar producto por ID");
        System.out.println("4 Actualizar producto");
        System.out.println("5 Eliminiar producto");
    }

    public static void runMenu(Scanner sc) {
        int option;
        do {
            printMenu();
            option = sc.nextInt();
        } while (option < 1 || option > 6);
        
        switch (option) {
            case 1:
                Arrays.stream(ProductService.listAll()).forEach(System.out::println);
                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

            default:
                break;
        }
    }
}
