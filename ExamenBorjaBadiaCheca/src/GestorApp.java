
public class GestorApp {
    public static void main(String[] args) {

        GestorCSV gestorCSV = new GestorCSV();
        gestorCSV.lectorCSV();
GestorXML gestorXML = new GestorXML("establecimientos.xml");
gestorXML.abrir();
     //   XPathEvaluator eval = new XPathEvaluator("establecimientos.xml"); ******Idea desestimada

       Establecimientos establecimientos= gestorXML.leerEstablecimientos();
        System.out.println(establecimientos);

        // Consultar establecimientos en una ciudad
        System.out.println("=====================");
        System.out.println("ESTABLECIMIENTOS EN UNA CIUDAD");
        System.out.println("=====================");

        // Consultar la ubicación más cercana de un establecimiento respecto a la ubicación actual del usuario
        System.out.println("=====================");
        System.out.println("ESTACIÓN MÁS CERCANO");
        System.out.println("=====================");

        Ubicacion miUbicacion = new Ubicacion(43.060017, -2.493796);
        Establecimiento establecimientoMasCercano = establecimientos.getEstablecimientoMasCerca(miUbicacion);
        System.out.println(establecimientoMasCercano);



    }}

