public class Productos {

    String numProducto;
    String nomProducto;
    String cantidadProducto;
String categoria;
    double precio;

    public Productos(String numProducto, String nomProducto, String cantidadProducto, String categoria, double precio) {
        this.numProducto = numProducto;
        this.nomProducto = nomProducto;
        this.cantidadProducto = cantidadProducto;
        this.precio = precio;
        this.categoria=categoria;
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

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return nomProducto + '\'' +"----"+
                  cantidadProducto + '\'' +"----"+
                 precio +"€";
    }
}
