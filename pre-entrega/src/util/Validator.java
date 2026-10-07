package util;
 
import java.util.Scanner;

public class Validator {
    
    
    public static void nameValidate(String name){
        if (name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }

    public static void priceValidate(double price){
        if (price < 0){
            throw new IllegalArgumentException("El valor debe ser positivo");
        }
    }

    public static void stockValidate(double stock){
        if (stock < 0){
            throw new IllegalArgumentException("El valor debe ser positivo");
        }
    } 

    public static void categoryValidator(String  category){
        if (category == null || category.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

    }

    public static int readInt(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
            }
        }
    }

    public static double readDouble(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número decimal válido.");
            }
        }
    }

    public static String readString(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Error: El texto no puede estar vacío.");
        }
    }
}
