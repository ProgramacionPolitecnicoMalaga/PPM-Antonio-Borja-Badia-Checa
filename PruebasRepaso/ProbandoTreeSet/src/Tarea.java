import java.util.Comparator;

public class Tarea {
    private int prioridad;
    private String descripcion;
    public static Comparator<Tarea> COMPARATOR_PRIORIDAD ;
    public static Comparator<Tarea> DESCRIPCION_TAREA;

    public Tarea(int prioridad, String descripcion) {
        this.prioridad = prioridad;
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getdescripcion() {
        return this.descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String toString() {
        return "Tarea{prioridad=" + this.prioridad + ", descripcion='" + this.descripcion + "'}";
    }
}