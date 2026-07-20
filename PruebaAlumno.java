
package ejercicio1;


public class PruebaAlumno {
    
     public static void main(String[] args) {

        Alumno a1 = new Alumno(
            "foto_juan.jpg",
            "Juan Pérez",
            20,
            15, 18, 14, 17
        );

        System.out.println("=== DATOS DEL ALUMNO ===");
        System.out.println("Foto        : " + a1.getFoto());
        System.out.println("Nombre      : " + a1.getNombre());
        System.out.println("Edad        : " + a1.getEdad());
        System.out.println("Práctica 1  : " + a1.getPractica1());
        System.out.println("Práctica 2  : " + a1.getPractica2());
        System.out.println("Práctica 3  : " + a1.getPractica3());
        System.out.println("Examen Final: " + a1.getExamenfinal());

        System.out.println("\n=== MODIFICANDO CON SETTERS ===");
        a1.setNombre("Juan Carlos Pérez");
        a1.setEdad(21);
        a1.setPractica1(19);
        a1.setExamenfinal(20);

        System.out.println("Nuevo nombre      : " + a1.getNombre());
        System.out.println("Nueva edad        : " + a1.getEdad());
        System.out.println("Nueva práctica 1  : " + a1.getPractica1());
        System.out.println("Nuevo examen final: " + a1.getExamenfinal());
    }
}

