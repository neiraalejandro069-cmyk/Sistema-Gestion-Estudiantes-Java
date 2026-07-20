package Clases;
public class Administrador extends Usuario {
    private String contraseña;
    public Administrador(String nombre, String contraseña) {
        super(nombre);
        this.contraseña = contraseña;
    }
    public boolean validarContraseña(String clave) {
        if(contraseña.equals(clave)) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Administrador: " + getNombre();
    }
}