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

}
