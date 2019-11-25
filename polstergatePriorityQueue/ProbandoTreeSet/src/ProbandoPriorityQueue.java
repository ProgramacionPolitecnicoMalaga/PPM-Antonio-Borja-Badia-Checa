import java.util.*;

public class ProbandoPriorityQueue {


        public static void main(String[] args) {


             PriorityQueue<Tarea> tareas= new PriorityQueue<Tarea>(Tarea.COMPARATOR_PRIORIDAD);
//           PriorityQueue<Tarea> tareas= new PriorityQueue<>(Tarea.DESCRIPCION_TAREA );

            tareas.add(new Tarea(88,"Raro"));
            tareas.add(new Tarea(3,"Balon"));
            tareas.add(new Tarea(1,"Abaco"));
            tareas.add(new Tarea(2,"Caza"));
            tareas.add(new Tarea(5,"Zarza"));
            tareas.add(new Tarea(1,"Yoyo"));
            tareas.add(new Tarea(1,"Abanico"));
            tareas.add(new Tarea(1,"Abanica"));
            tareas.add(new Tarea(1,"Abanicarse"));
            tareas.add(new Tarea(1,"Babas"));


       //     System.out.println(tareas);

        Iterator<Tarea> it = tareas.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

        }

}
