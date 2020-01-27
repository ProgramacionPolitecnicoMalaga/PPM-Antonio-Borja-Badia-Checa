import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;


public class AppTareas {

    public static void main(String[] args) throws ParseException {

        GestorTareas gestorTareas = null;

        Fechas NuevaFecha=new Fechas(new GregorianCalendar(2014,02,11).getTime());
        NuevaFecha.parseDate("13/02/2014");

        Tareas tarea2= new Tareas(new Categorias("Formación"), true, new Fechas(new Date(2020, 02, 27)));
        Tareas tarea1 = new Tareas(new Categorias("Ocio"), true, new Fechas(new Date(2020, 01, 20)));
        System.out.println(tarea2 +". "+ tarea1);

gestorTareas.annadirNuevaTarea(tarea1);
//gestorTareas.annadirNuevaTarea(tarea2);

/*for(int i=0; i<gestorTareas.tareasArrayList.size();i++){
    gestorTareas.tareasArrayList.get(i);

}*/
    }
}
