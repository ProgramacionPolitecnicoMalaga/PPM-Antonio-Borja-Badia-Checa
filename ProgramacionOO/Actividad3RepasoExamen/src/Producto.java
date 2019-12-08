import java.util.*;

public class Producto {

    String id;

ArrayList <Componente>   especificacionesArrayList;

    public Producto(String id) {
        this.id = id;
    especificacionesArrayList= new ArrayList<>();
    }

    public ArrayList<Componente> getEspecificacionesArrayList() {
        return especificacionesArrayList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEspecificacionesArrayList(Componente especificacionesArrayList) {
        this.especificacionesArrayList = especificacionesArrayList;
    }
}
