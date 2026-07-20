
package ejercicio2;

public class Estudiante {
    
      private String codigo;
    private String nombre;
    private String carrera;
    private int    ciclo;
    private double promedio;
    private String email;

       public Estudiante() {}

    public Estudiante(String codigo, String nombre, String carrera,
                      int ciclo, double promedio, String email) {
        this.codigo   = codigo;
        this.nombre   = nombre;
        this.carrera  = carrera;
        this.ciclo    = ciclo;
        this.promedio = promedio;
        this.email    = email;
    }

    public String getCodigo()   { return codigo; }
    public String getNombre()   { return nombre; }
    public String getCarrera()  { return carrera; }
    public int    getCiclo()    { return ciclo; }
    public double getPromedio() { return promedio; }
    public String getEmail()    { return email; }

    public void setCodigo(String codigo)    { this.codigo   = codigo; }
    public void setNombre(String nombre)    { this.nombre   = nombre; }
    public void setCarrera(String carrera)  { this.carrera  = carrera; }
    public void setCiclo(int ciclo)         { this.ciclo    = ciclo; }
    public void setPromedio(double promedio){ this.promedio  = promedio; }
    public void setEmail(String email)      { this.email    = email; }

    @Override
    public String toString() {
        return codigo + " | " + nombre + " | " + carrera +
               " | Ciclo: " + ciclo + " | Promedio: " + promedio +
               " | " + email;
    }
}

