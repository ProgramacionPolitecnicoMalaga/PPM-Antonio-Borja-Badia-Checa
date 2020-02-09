import java.util.ArrayList;
import java.util.Iterator;

public class Clientes {
ArrayList <Cliente> clienteArrayList=new ArrayList<>();



    public ArrayList<Cliente> getClienteArrayList() {
        return clienteArrayList;
    }

   public Cliente annadirCliente (Cliente nuevoCliente){
       Cliente nombreCliente;

        System.out.println("El cliente se ha añadido\n");
        clienteArrayList.add(nuevoCliente);
nombreCliente=nuevoCliente;
return nombreCliente;
   }
   public void listarClientesNombres(){
       for (Cliente c: clienteArrayList) {
           System.out.println(c.getNombre());
       }
   }

   public void listarClientesByDNI(){
        for (Cliente c:clienteArrayList){
            System.out.println(c.getDni());
        }
   }


   public void listarClientesInformacionCompleta(){
        Cliente cliente;
       Iterator it=clienteArrayList.iterator();
       while(it.hasNext()){
           cliente = (Cliente)it.next();
           System.out.println(cliente);
       }


   }


}
