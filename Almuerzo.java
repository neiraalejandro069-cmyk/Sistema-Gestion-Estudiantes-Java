package Clases;
public class Almuerzo {
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    public Almuerzo(int codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    @Override
    public String toString() {
        return "Codigo: " + codigo
             + "\nNombre: " + nombre
             + "\nDescripcion: " + descripcion
             + "\nPrecio: S/ " + precio;
    }
}