
package ejercicio2;

public class Producto {
    
    private String codigo;
    private String nombre;
    private double precio;
    private int    stock;
    private String categoria;
    private String marca;

    // Constructor vacío
    public Producto() {}

    // Constructor completo
    public Producto(String codigo, String nombre, double precio,
                    int stock, String categoria, String marca) {
        this.codigo    = codigo;
        this.nombre    = nombre;
        this.precio    = precio;
        this.stock     = stock;
        this.categoria = categoria;
        this.marca     = marca;
    }

    public String getCodigo()    { return codigo; }
    public String getNombre()    { return nombre; }
    public double getPrecio()    { return precio; }
    public int    getStock()     { return stock; }
    public String getCategoria() { return categoria; }
    public String getMarca()     { return marca; }

    public void setCodigo(String codigo)       { this.codigo    = codigo; }
    public void setNombre(String nombre)       { this.nombre    = nombre; }
    public void setPrecio(double precio)       { this.precio    = precio; }
    public void setStock(int stock)            { this.stock     = stock; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setMarca(String marca)         { this.marca     = marca; }

    @Override
    public String toString() {
        return codigo + " | " + nombre + " | S/." + precio +
               " | Stock: " + stock + " | " + categoria + " | " + marca;
    }
}

