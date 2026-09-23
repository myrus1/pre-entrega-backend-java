import java.util.ArrayList;

public class Pedido {

    private long id;
    private ArrayList <Producto> productos = new ArrayList<Producto>();
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public Producto getProductoById(int id) {
       return productos.stream()
                .filter(p->p.getId()==id)
                .findFirst()
                .orElse(null);
    }

    public boolean borrarProductoById(int id){
        return productos.removeIf(p->p.getId()==id);
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }
    
}
