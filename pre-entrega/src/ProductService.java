import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private static long nextId = 1;
   
   
   
   
   
   
    /* 
    public void addProduct(Product product) {
        if (product.getId() == 0) {
            product.setId(nextId++);
        }
        products.add(product);
    }

    public Product getProductById(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public boolean deleteProductById(long id) {
        return products.removeIf(product -> product.getId() == id);
    }

    public List<Product> getProducts() {
        return products;
    }
    */
}
