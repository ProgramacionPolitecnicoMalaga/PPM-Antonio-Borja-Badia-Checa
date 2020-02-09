import java.util.Objects;

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

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getPrecioAcordado() {
        return precioAcordado;
    }

    public void setPrecioAcordado(double precioAcordado) {
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

    @Override
    public boolean equals(Object o) {
        Contrato c=(Contrato) o;
        return c.getTipoContrato().equalsIgnoreCase(this.getTipoContrato());
    }





}
