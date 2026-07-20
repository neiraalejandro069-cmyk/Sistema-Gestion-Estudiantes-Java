
package ejercicio2;

public class Vehiculo {
    
     private String placa;
    private String marca;
    private String modelo;
    private int    anio;
    private String color;
    private double kilometraje;

    // Constructor vacío
    public Vehiculo() {}

    // Constructor completo
    public Vehiculo(String placa, String marca, String modelo,
                    int anio, String color, double kilometraje) {
        this.placa       = placa;
        this.marca       = marca;
        this.modelo      = modelo;
        this.anio        = anio;
        this.color       = color;
        this.kilometraje = kilometraje;
    }

    public String getPlaca()        { return placa; }
    public String getMarca()        { return marca; }
    public String getModelo()       { return modelo; }
    public int    getAnio()         { return anio; }
    public String getColor()        { return color; }
    public double getKilometraje()  { return kilometraje; }

    public void setPlaca(String placa)          { this.placa       = placa; }
    public void setMarca(String marca)          { this.marca       = marca; }
    public void setModelo(String modelo)        { this.modelo      = modelo; }
    public void setAnio(int anio)               { this.anio        = anio; }
    public void setColor(String color)          { this.color       = color; }
    public void setKilometraje(double km)       { this.kilometraje = km; }

    @Override
    public String toString() {
        return placa + " | " + marca + " " + modelo + " " + anio +
               " | " + color + " | " + kilometraje + " km";
    }
}

