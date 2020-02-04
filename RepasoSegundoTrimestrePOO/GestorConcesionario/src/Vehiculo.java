import java.util.Objects;

public class Vehiculo {

    private String modelo;
    private String marca;
    private String color;
    private String annoFabricacion;
    private String estado;
    private double precio ;
    private String numBastidor;

    public Vehiculo(String modelo, String marca, String color, String annoFabricacion, String estado, double precio, String numBastidor) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.annoFabricacion = annoFabricacion;
        this.estado = estado;
        this.precio = precio;
        this.numBastidor=numBastidor;
    }

    public  String getNumBastidor(){
        return numBastidor;

    }
    public void setNumBastidor(String numBastidor){
        this.numBastidor=numBastidor;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnnoFabricacion() {
        return annoFabricacion;
    }

    public void setAnnoFabricacion(String annoFabricacion) {
        this.annoFabricacion = annoFabricacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Modelo='" + modelo + '\'' +
                ", Marca='" + marca + '\'' +
                ", Color='" + color + '\'' +
                ", Año Fabricacion='" + annoFabricacion + '\'' +
                ", Estado='" + estado + '\'' +
                ", Precio Venta=" + precio +
                ", Nº Bastidor='" + numBastidor + '\'' +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
       Vehiculo v=(Vehiculo)o;
       return v.getNumBastidor().equalsIgnoreCase(this.getNumBastidor());
    }


}
