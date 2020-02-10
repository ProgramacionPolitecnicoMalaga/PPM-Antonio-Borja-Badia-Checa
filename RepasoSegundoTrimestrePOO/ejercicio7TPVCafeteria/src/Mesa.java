import java.util.Objects;

public class Mesa {
    private String codigoMesa;
    private boolean mesaAbierta;
    private Productos listaProductos;

    public Mesa(String codigoMesa, boolean mesaAbierta, Productos listaProductos) {
        this.codigoMesa = codigoMesa;
        this.mesaAbierta = mesaAbierta;
        this.listaProductos = listaProductos;
    }

    public Mesa(String codigoMesa, boolean mesaAbierta) {
        this.codigoMesa = codigoMesa;
        this.mesaAbierta = mesaAbierta;
    }

    public Mesa() {
    }

    public String getCodigoMesa() {
        return codigoMesa;
    }

    public void setCodigoMesa(String codigoMesa) {
        this.codigoMesa = codigoMesa;
    }

    public boolean isMesaAbierta() {
        return mesaAbierta;
    }

    public void setMesaAbierta(boolean mesaAbierta) {
        this.mesaAbierta = mesaAbierta;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "Código de Mesa='" + codigoMesa + '\'' +
                ", Mesa abierta=" + mesaAbierta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Mesa mesa= (Mesa) o;
    return mesa.getCodigoMesa().equalsIgnoreCase(getCodigoMesa());
    }


}
