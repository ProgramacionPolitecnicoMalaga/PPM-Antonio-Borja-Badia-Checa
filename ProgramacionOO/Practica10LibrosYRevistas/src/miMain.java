import java.util.*;

public class miMain {


    public static void main(String[] args) {

        ArrayList<Paquete> paquete1 = new ArrayList<Paquete>();

        paquete1.add(new Libro("345345", "Juego de tronos", "1990", "",false));
        paquete1.add(new Libro("23345","Tormenta de Espadas", "1995", "", false ));
        paquete1.add(new Libro("2sdf244","Festín de Cuervos", "2000", "", false ));
        paquete1.add(new Libro("237635sef","Choque de Reyes", "2005", "", false ));
        paquete1.add(new Libro("2564564","Danza de Dragones", "2010", "",false ));
        paquete1.add(new Libro("2aaTT677","Vientos de Invierno", "2100", "", false ));
        paquete1.add(new Revistas("9897dfdf","National Geografic", "2019","", 4875, true ));

        for (ArrayList p1: paquete1) {

            System.out.println(p1);

        }
        


    }
}
