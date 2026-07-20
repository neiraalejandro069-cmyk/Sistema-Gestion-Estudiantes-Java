
package ejercicio2;

import java.io.FileWriter;
import java.io.IOException;

public class ReporteHTML {

    public static void main(String[] args) {

        Producto p1 = new Producto("P001", "Laptop Lenovo", 2999.90, 10, "Tecnología", "Lenovo");
        Producto p2 = new Producto("P002", "Mouse Inalámbrico", 59.90, 50, "Accesorios", "Logitech");
        Producto p3 = new Producto("P003", "Teclado Mecánico", 189.90, 25, "Accesorios", "HyperX");

                String html = "<!DOCTYPE html>\n"
            + "<html lang='es'>\n"
            + "<head>\n"
            + "  <meta charset='UTF-8'>\n"
            + "  <title>Reporte de Productos</title>\n"
            + "  <style>\n"
            + "    body { font-family: Arial, sans-serif; margin: 40px; background: #f5f5f5; }\n"
            + "    h1 { color: #333; }\n"
            + "    img { width: 120px; display: block; margin: 20px auto; }\n"
            + "    table { border-collapse: collapse; width: 100%; background: white; }\n"
            + "    th { background: #4a90d9; color: white; padding: 10px; }\n"
            + "    td { border: 1px solid #ddd; padding: 8px; text-align: center; }\n"
            + "    tr:nth-child(even) { background: #f2f2f2; }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <h1>Reporte de Productos</h1>\n"
            + "  <img src='https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png'"
            + "       alt='Logo tienda'>\n"
            + "  <table>\n"
            + "    <tr><th>Código</th><th>Nombre</th><th>Precio</th>"
            + "<th>Stock</th><th>Categoría</th><th>Marca</th></tr>\n"
            + "    <tr><td>" + p1.getCodigo() + "</td><td>" + p1.getNombre()
            + "</td><td>S/." + p1.getPrecio() + "</td><td>" + p1.getStock()
            + "</td><td>" + p1.getCategoria() + "</td><td>" + p1.getMarca() + "</td></tr>\n"
            + "    <tr><td>" + p2.getCodigo() + "</td><td>" + p2.getNombre()
            + "</td><td>S/." + p2.getPrecio() + "</td><td>" + p2.getStock()
            + "</td><td>" + p2.getCategoria() + "</td><td>" + p2.getMarca() + "</td></tr>\n"
            + "    <tr><td>" + p3.getCodigo() + "</td><td>" + p3.getNombre()
            + "</td><td>S/." + p3.getPrecio() + "</td><td>" + p3.getStock()
            + "</td><td>" + p3.getCategoria() + "</td><td>" + p3.getMarca() + "</td></tr>\n"
            + "  </table>\n"
            + "</body>\n"
            + "</html>";

        try (FileWriter fw = new FileWriter("reporte_productos.html")) {
            fw.write(html);
            System.out.println("Reporte generado: reporte_productos.html");
        } catch (IOException e) {
            System.out.println("Error al generar el reporte: " + e.getMessage());
        }
    }
}
