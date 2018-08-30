package ventas.entidades;

/**
 * Esta clase va a representar la tabla de base de datos
 * @author Edwin Maravi
 */
public class Distrito {
    private String id;
    private String nombre;
    private String vendedor;
    
    public Distrito(){}
    
    public Distrito(String id, String nombre, String vendedor) {
        this.id = id;
        this.nombre = nombre;
        this.vendedor = vendedor;
    }

    public Distrito(String id) {
       this.id=id;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

   
    
    
}
