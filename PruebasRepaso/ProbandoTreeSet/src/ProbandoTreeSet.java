import java.util.TreeSet;

public class ProbandoTreeSet {
    public ProbandoTreeSet() {
    }

    public static void main(String[] args) {
        TreeSet<Tarea> tareas = new TreeSet(Tarea.DESCRIPCION_TAREA);
        tareas.add(new Tarea(3, "B"));
        tareas.add(new Tarea(1, "A"));
        tareas.add(new Tarea(2, "C"));
        tareas.add(new Tarea(5, "Z"));
        tareas.add(new Tarea(1, "Y"));
        System.out.println(tareas);
    }
}