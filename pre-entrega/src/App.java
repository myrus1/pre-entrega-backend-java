import java.util.Scanner;

import service.ProductService;
import ui.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        
        ProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(sc, productService);
        menu.runMenu();

    }
}
