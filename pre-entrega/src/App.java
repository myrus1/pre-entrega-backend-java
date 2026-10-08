import java.util.Scanner;

import model.Product;
import service.ProductService;
import ui.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        
        ProductService service = new ProductService();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(sc, service);
        menu.runMenu();

        public static void testData(ProductService service){
            service.saveProduct(new Product("Café", 5000, 30, "Bebida"));
        }
    }
}
