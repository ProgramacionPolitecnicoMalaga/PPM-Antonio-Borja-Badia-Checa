import java.util.ArrayList;

public class GestorApp {

private InterfazApp interfazApp = new InterfazApp();
private ArrayList<Categoria> categoriaArrayList = new ArrayList<>();
private ArrayList<Tarea> tareaArrayList = new ArrayList<>();

public  void annadirCategoria(String nomCategoria){
    categoriaArrayList.add(new Categoria((nomCategoria)));
    interfazApp.realizadoCorrectamenteMenu();
}


}
