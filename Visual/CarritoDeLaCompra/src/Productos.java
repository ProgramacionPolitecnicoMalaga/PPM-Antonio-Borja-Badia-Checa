public class Productos {

    String numProducto;
    String nomProducto;
    String cantidadProducto;
    double precio;

    public Productos(String numProducto, String nomProducto, String cantidadProducto, double precio) {
        this.numProducto = numProducto;
        this.nomProducto = nomProducto;
        this.cantidadProducto = cantidadProducto;
        this.precio = precio;
    }

    public String getNumProducto() {
        return numProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public double getPrecio() {
        return precio;
    }
}
