import java.util.*;

public class MiMain {

    public static void main(String[] args) {


        //TODO - Cargar Datos, Consultar Ciudades  en las que hay una estación -Consultar estaciones en ciudades - Consultar estación más cercana - Consultar Estación cierto tipo

        // Cargar datos

        GestorXML gestorXML = new GestorXML("estaciones.xml");
        gestorXML.abrir();
        Ciudades ciudades = gestorXML.leerCiudades();
        System.out.println(ciudades);

        // Consultar las ciudades en las que hay alguna estación
        System.out.println("=====================");
        System.out.println("CIUDADES EN LAS QUE HAY ALGUNA ESTACIÓN");
        System.out.println("=====================");
        ArrayList<Ciudad> listaCiudades = ciudades.getCiudades();
        for (Ciudad ciudad: listaCiudades)
            System.out.println(ciudad.getNombre());

        // Consultar las estaciones en una ciudad
        System.out.println("=====================");
        System.out.println("ESTACIONES EN UNA CIUDAD");
        System.out.println("=====================");
        Ciudad ciudad = ciudades.getCiudadByNombre("Bilbao");
        ArrayList<Estacion> estaciones = ciudad.getEstaciones();
        for (Estacion estacion: estaciones){
            System.out.println(estacion);
        }

        // Consultar las estaciones de un cierto tipo
        System.out.println("=====================");
        System.out.println("ESTACIONES DE CIERTO TIPO");
        System.out.println("=====================");

        ArrayList<Estacion> estacionesTren = ciudades.getEstacionesByTipo(Estacion.ESTACION_TREN);
        System.out.println(estacionesTren);

        // Consultar las estación más cercana a mi ubicación actual
        System.out.println("=====================");
        System.out.println("ESTACIÓN MÁS CERCANA");
        System.out.println("=====================");

        Ubicacion miUbicacion = new Ubicacion(43.060017, -2.493796);
        Estacion estacionMasCercana = ciudades.getEstacionMasCercanaA(miUbicacion);
        System.out.println(estacionMasCercana);
    }
}
