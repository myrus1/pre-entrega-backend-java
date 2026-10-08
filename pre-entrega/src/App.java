import java.util.Scanner;

import model.Product;
import service.ProductService;
import ui.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        
        ProductService service = new ProductService();
        Scanner sc = new Scanner(System.in);
        testData(service);
        Menu menu = new Menu(sc, service);
        menu.runMenu();

    }
    public static void testData(ProductService service){
        service.saveProduct(new Product("Café", 5000, 30, "Bebida"));
        service.saveProduct(new Product("Yerba mate 1kg", 3200, 50, "Bebida"));
        service.saveProduct(new Product("Galletitas de agua", 1200, 80, "Almacén"));
        service.saveProduct(new Product("Fideosar Fainá 500g", 1450, 60, "Almacén"));
        service.saveProduct(new Product("Detergente líquido 750ml", 2100, 40, "Limpieza"));
        service.saveProduct(new Product("Queso crema 300g", 3800, 25, "Lácteos"));
        service.saveProduct(new Product("Leche descremada 1L", 1500, 50, "Lácteos"));
        service.saveProduct(new Product("Chocolate con almendras", 2900, 35, "Golosinas"));
    }
}
