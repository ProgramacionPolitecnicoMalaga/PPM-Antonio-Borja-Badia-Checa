import java.util.ArrayList;
import java.util.Iterator;

public class Contratos {
    ArrayList<Contrato> contratoArrayList = new ArrayList<>();



    public void annadirContrato(Contrato nuevoContrato){
        System.out.println("El contrato se ha realizado\n");
        contratoArrayList.add(nuevoContrato);

    }

    public void listarContratos(){
        Contrato contrato;
        Iterator it=contratoArrayList.iterator();
        while(it.hasNext()){
            contrato = (Contrato) it.next();
            System.out.println(contrato);
        }
}

public double ContratoCompraVenta(Contrato contrato){
        double contratoTotal=0;
     if (contrato.getTipoContrato().equalsIgnoreCase("Compra")){
        cambiarSigno(contrato.getPrecioAcordado());
         System.out.println(contratoTotal-=(contrato.getPrecioAcordado()));
     } else if(contrato.getTipoContrato().equalsIgnoreCase("Venta")){
         System.out.println(contratoTotal=(contrato.getPrecioAcordado()));
     }
return contratoTotal;
}

    private void cambiarSigno(double precioAcordado) {


    }

    public double balanceTotal(String dni){

       Clientes clientes;
        double balanceTotal=0;

   for(int i=0; i<contratoArrayList.size();i++){
       if(contratoArrayList.get(i).clien){


       }


    }

}

}
