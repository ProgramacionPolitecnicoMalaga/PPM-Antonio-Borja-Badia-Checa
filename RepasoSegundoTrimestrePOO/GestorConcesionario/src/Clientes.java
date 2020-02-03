import java.util.ArrayList;

public class Clientes {
Cliente cliente = new Cliente();

ArrayList <Cliente> clienteArrayList;

    public Clientes(Cliente cliente, ArrayList<Cliente> clienteArrayList) {
        this.cliente = cliente;
        this.clienteArrayList = clienteArrayList;
    }

    public ArrayList<Cliente> getClienteArrayList() {
        return clienteArrayList;
    }

    public void setClienteArrayList(ArrayList<Cliente> clienteArrayList) {
        this.clienteArrayList = clienteArrayList;
    }
}
