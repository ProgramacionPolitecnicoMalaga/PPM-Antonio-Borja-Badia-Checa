public class Vehiculo {
    private String marca, modelo, combustible;
    private int kilometros;
    private double precio;


    public Vehiculo(String marca, String modelo, String combustible, int kilometros, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.kilometros = kilometros;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Combustión='" + combustible + '\'' +
                ", KM=" + kilometros +
                ", Precio=" + precio +
                '}'+"\n";
    }
}
