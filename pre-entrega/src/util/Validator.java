package util;

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

    //public static int readInt(int value){   }

    //public static int readDouble(int value){   }

    //public static int readString(int value){   }
}
