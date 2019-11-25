import java.util.*;


public class Tarea {

 private    int prioridad;
   private String descripcion;

    public Tarea(int prioridad, String descripcion) {
        this.prioridad = prioridad;
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

public static final Comparator<Tarea>  COMPARATOR_PRIORIDAD = new Comparator<Tarea>(){


        public int compare(Tarea tarea, Tarea t1){

            return tarea.getPrioridad()-t1.getPrioridad();

        }
};


    @Override
    public String toString() {
        return "Tarea{" +
                "prioridad=" + prioridad +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

   public static final  Comparator<Tarea> DESCRIPCION_TAREA = new Comparator<Tarea>() {
       @Override
       public int compare(Tarea tarea, Tarea t1) {

return tarea.getdescripcion().compareTo(t1.getdescripcion());

       }
   };
}
