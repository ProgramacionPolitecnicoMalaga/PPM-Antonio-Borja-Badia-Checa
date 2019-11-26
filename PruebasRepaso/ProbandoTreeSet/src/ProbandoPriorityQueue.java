import java.util.Iterator;
import java.util.PriorityQueue;

public class ProbandoPriorityQueue {
    public ProbandoPriorityQueue() {
    }

    public static void main(String[] args) {
        PriorityQueue<Tarea> tareas = new PriorityQueue(Tarea.COMPARATOR_PRIORIDAD);
        tareas.add(new Tarea(88, "Raro"));
        tareas.add(new Tarea(3, "Balon"));
        tareas.add(new Tarea(1, "Abaco"));
        tareas.add(new Tarea(2, "Caza"));
        tareas.add(new Tarea(5, "Zarza"));
        tareas.add(new Tarea(1, "Yoyo"));
        tareas.add(new Tarea(1, "Abanico"));
        tareas.add(new Tarea(1, "Abanica"));
        tareas.add(new Tarea(1, "Abanicarse"));
        tareas.add(new Tarea(1, "Babas"));
        Iterator it = tareas.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}