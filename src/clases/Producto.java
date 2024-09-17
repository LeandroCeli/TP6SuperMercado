package clases;

public class Producto 
{
   private Long codNumerico;
   private String descripcion;
   private double precio;
   private int stock;
   private String rubro;

    public Producto() {
    }

    public Producto(Long codNumerico, String descripcion, double precio, int stock, String rubro) {
        this.codNumerico = codNumerico;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public Long getCodNumerico() {
        return codNumerico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setCodNumerico(Long codNumerico) {
        this.codNumerico = codNumerico;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
   
   
    
}
