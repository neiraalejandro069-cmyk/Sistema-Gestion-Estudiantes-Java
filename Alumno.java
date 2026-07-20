
package ejercicio1;

public class Alumno {
    
       private String foto;
    private String nombre;
    private int edad;
    private int practica1;
    private int practica2;
    private int practica3;
    private int examenfinal;

    public Alumno(String foto, String nombre, int edad,
                  int practica1, int practica2, int practica3,
                  int examenfinal) {
        this.foto        = foto;
        this.nombre      = nombre;
        this.edad        = edad;
        this.practica1   = practica1;
        this.practica2   = practica2;
        this.practica3   = practica3;
        this.examenfinal = examenfinal;
    }

    public String getFoto()        { return foto; }
    public String getNombre()      { return nombre; }
    public int    getEdad()        { return edad; }
    public int    getPractica1()   { return practica1; }
    public int    getPractica2()   { return practica2; }
    public int    getPractica3()   { return practica3; }
    public int    getExamenfinal() { return examenfinal; }

    public void setFoto(String foto)            { this.foto = foto; }
    public void setNombre(String nombre)        { this.nombre = nombre; }
    public void setEdad(int edad)               { this.edad = edad; }
    public void setPractica1(int practica1)     { this.practica1 = practica1; }
    public void setPractica2(int practica2)     { this.practica2 = practica2; }
    public void setPractica3(int practica3)     { this.practica3 = practica3; }
    public void setExamenfinal(int examenfinal) { this.examenfinal = examenfinal; }
}

