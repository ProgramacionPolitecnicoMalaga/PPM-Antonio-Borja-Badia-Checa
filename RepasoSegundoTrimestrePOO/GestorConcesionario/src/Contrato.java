public class Contrato {

    Vehiculo vehiculo;
    Cliente cliente;
    private String tipoContrato;
    private double precioAcordado;

    public Contrato(Vehiculo vehiculo, Cliente cliente, String tipoContrato, double precioAcordado) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.tipoContrato = tipoContrato;
        this.precioAcordado = precioAcordado;
    }


    @Override
    public String toString() {
        return "Contrato{" +
                "Vehiculo=" + vehiculo +
                ", Cliente=" + cliente +
                ", Tipo Contrato='" + tipoContrato + '\'' +
                ", Precio Acordado=" + precioAcordado +
                '}'+"\n";
    }
}
