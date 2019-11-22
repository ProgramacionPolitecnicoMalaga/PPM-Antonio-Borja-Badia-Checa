import java.util.*;

public class miMain {

    public static void visualizarPrestados(ArrayList<Paquete> paquete1) {
        for (int i=0; i<paquete1.size();i++){

            if (paquete1.get(i).prestado){
                System.out.println("[Publicación Prestada] "+paquete1.get(i).toString());

            }
        }
    }

    public  static  void visualizarNoprestados(ArrayList<Paquete> paquete){
        for (int i=0; i<paquete.size();i++){

            if (!paquete.get(i).prestado){
                System.out.println("[Publicación Disponible] "+paquete.get(i).toString());

            }
        }


    }


    public static void imprimirPublicacionesPorPaquetes(ArrayList<Paquete> paqueteALeer) {
        for (ArrayList p: paqueteALeer) {

            System.out.println(p);

        }
    }

    public static void main(String[] args) {

        ArrayList<Paquete> paquete1 = new ArrayList<Paquete>();

        paquete1.add(new Libro("345345", "Juego de tronos", "1990", "",false));
        paquete1.add(new Libro("23345","Tormenta de Espadas", "1995", "", false ));
        paquete1.add(new Libro("2sdf244","Festín de Cuervos", "2000", "", false ));
        paquete1.add(new Libro("237635sef","Choque de Reyes", "2005", "", false ));
        paquete1.add(new Libro("2564564","Danza de Dragones", "2010", "",false ));
        paquete1.add(new Libro("2aaTT677","Vientos de Invierno", "2100", "", false ));
        paquete1.add(new Revistas("9897dfdf","National Geografic", "2019","", 4875, true ));

        imprimirPublicacionesPorPaquetes(paquete1);

        visualizarPrestados(paquete1);
        visualizarNoprestados(paquete1);


        ArrayList<Paquete> paquete2 = new ArrayList<Paquete>();

    paquete2.add(new Revistas("85gkh", "El jueves", "2019", "", 78454, true));
    paquete2.add(new Revistas("58zab", "El jueves", "2018", "", 6626, true));
    paquete2.add(new Revistas("5796b", "El jueves", "2017", "", 9820, false));

    imprimirPublicacionesPorPaquetes(paquete2);
    visualizarNoprestados(paquete2);
    visualizarPrestados(paquete2);
    }




}
