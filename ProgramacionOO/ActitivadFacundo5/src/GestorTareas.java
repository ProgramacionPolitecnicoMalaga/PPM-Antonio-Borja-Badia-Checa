import java.util.ArrayList;
import java.util.Collection;

public class GestorTareas {

    ArrayList<Tareas> tareasArrayList= new ArrayList<>();

    public GestorTareas(ArrayList<Tareas> tareasArrayList) {
        this.tareasArrayList = tareasArrayList;
    }

public void annadirNuevaTarea(Tareas nuevaTarea){
        tareasArrayList.addAll((Collection<? extends Tareas>) nuevaTarea);


}

}
