package Clases;
public class DetallePedido {
    private Almuerzo almuerzo;
    private int cantidad;
    public DetallePedido(Almuerzo almuerzo, int cantidad) {
        this.almuerzo = almuerzo;
        this.cantidad = cantidad;
    }
    public Almuerzo getAlmuerzo() {
        return almuerzo;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double calcularSubtotal() {
        return almuerzo.getPrecio() * cantidad;
    }
    @Override
    public String toString() {
        return almuerzo.getNombre()
                + " x " + cantidad
                + " = S/ "
                + calcularSubtotal();
    }
}