import java.util.*;

public class Producto {

    String nombreProducto;
    double precioProducto, indiceValoracionProducto;

    public Producto() {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.indiceValoracionProducto = indiceValoracionProducto;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getIndiceValoracionProducto() {
        return indiceValoracionProducto;
    }

    public void setIndiceValoracionProducto(double indiceValoracionProducto) {
        this.indiceValoracionProducto = indiceValoracionProducto;
    }

    @Override
    public String toString() {
        return "============PRODUCTOS============\n"+
                "Nombre del producto: " + nombreProducto + "\n" +
                "Precio del producto: "  + precioProducto + "\n" +
                "Valoración del producto: " + indiceValoracionProducto+
                "================FIN=================";
    }


}
