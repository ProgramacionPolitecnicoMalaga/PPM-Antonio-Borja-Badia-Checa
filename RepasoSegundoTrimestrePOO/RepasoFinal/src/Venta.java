public class Venta {
    private Persona comprador;
    private Vehiculo vehiculo;
    private int unidades;

    public Venta(Persona comprador, Vehiculo vehiculo, int unidades) {
        this.comprador = comprador;
        this.vehiculo = vehiculo;
        this.unidades = unidades;
    }

    public Persona getComprador() {
        return comprador;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getUnidades() {
        return unidades;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "Comprador=" + comprador +
                ", Vehiculo=" + vehiculo +
                ", Unidades=" + unidades +
                '}'+"\n";
    }
}
