import java.util.Comparator;

public abstract class ComparadorAlfabetico implements Comparator {


    public int compare(ClaseDePrueba claseDePrueba, ClaseDePrueba t1) {
        return claseDePrueba.getCadena().compareTo(t1.getCadena());



    }
}
