import java.util.ArrayList;

public class Mesas {

    private ArrayList<Mesa> mesaArrayList = new ArrayList<>();

    public void annadirMesa (String codigoMesa, boolean mesaAbierta){
        mesaArrayList.add(new Mesa(codigoMesa,mesaAbierta));
        System.out.println("Mesa añadida");
    }

    public void listarMesas(){
        for (Mesa m:mesaArrayList) {
            System.out.println(m);
        }
    }

    public void mostrarMesasAbiertas() {

        System.out.print("Mesas abiertas: ");
        for (Mesa m: mesaArrayList) {

            if(m.isMesaAbierta()){
                System.out.print("["+m.getCodigoMesa()+"] ");
            }
        }
        System.out.println();
        System.out.println();

    }
    public void mostrarMesasCerradas(){
        System.out.print("Mesas cerradas: ");
        for (Mesa m: mesaArrayList){
            if(!m.isMesaAbierta()){
                System.out.print("["+m.getCodigoMesa()+"] ");
            }
        }
        System.out.println();
        System.out.println();

    }

}
