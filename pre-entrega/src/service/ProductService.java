package service;

import java.util.ArrayList;
import java.util.List;

import model.Product;

import util.Validator;

public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private static long countId = 1;

    public Product saveProduct(Product p) {

        // faltan validaciones
        Validator.nameValidate(p.getName());
        Validator.priceValidate(p.getPrice());
        Validator.stockValidate(p.getStock());
        Validator.categoryValidator(p.getCategory());

        p.setId(countId);
        countId += 1;

        products.add(p);

        return p;
    }

    public List<Product> listAll() {
        return products;
    }

    public Product getProductById(int id) {

        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("producto no encontrado"));
    }

    public Product updateProduct(int id, Product newProduct) {
        
        //faltan validaciones
        
        Product oldProduct = getProductById(id);

        Validator.nameValidate(newProduct.getName());
        Validator.priceValidate(newProduct.getPrice());
        Validator.stockValidate(newProduct.getStock());
        Validator.categoryValidator(newProduct.getCategory());
        
        oldProduct.setName(newProduct.getName());
        oldProduct.setPrice(newProduct.getPrice());
        oldProduct.setStock(newProduct.getStock());
        oldProduct.setCategory(newProduct.getCategory());
        
        return oldProduct;
    }

    public void deleteProduct(int id) {

        Product p = getProductById(id);
        products.remove(p);
    }
}
