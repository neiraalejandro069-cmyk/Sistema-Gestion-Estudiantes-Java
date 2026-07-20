package Clases;
import java.util.ArrayList;
public class Pedido {
    private String codigoPedido;
    private Usuario usuario;
    private ArrayList<DetallePedido> detalles;
    private String estado;
    public Pedido(String codigoPedido, Usuario usuario, ArrayList<DetallePedido> detalles) {
        this.codigoPedido = codigoPedido;
        this.usuario = usuario;
        this.detalles = detalles;
        this.estado = "Pendiente";
    }
    public String getCodigoPedido() {
        return codigoPedido;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public ArrayList<DetallePedido> getDetalles() {
        return detalles;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public double calcularTotal() {
        double total = 0;
        for(int i = 0; i < detalles.size(); i++) {
            total += detalles.get(i).calcularSubtotal();
        }
        return total;
    }
    @Override
    public String toString() {
        String texto = "";
        texto += "Codigo del pedido: " + codigoPedido;
        texto += "\nCliente: " + usuario.getNombre();
        texto += "\n\nDetalle del pedido:\n";
        for(int i = 0; i < detalles.size(); i++) {
            texto += detalles.get(i) + "\n";
        }
        texto += "\nEstado: " + estado;
        texto += "\nTotal: S/ " + calcularTotal();
        return texto;
    }
}