import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private static long countId = 1;

    public Product saveProduct(Product p) {

        // faltan validaciones

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

    public Product updateProduct(int id, Product p) {
        
        //faltan validaciones
        
        Product product = getProductById(id);

        product.setName(p.getName());
        product.setPrice(p.getPrice());
        product.setStock(p.getStock());

        return p;
    }

    public void deleteProduct(int id) {

        Product p = getProductById(id);
        products.remove(p);
    }
}
