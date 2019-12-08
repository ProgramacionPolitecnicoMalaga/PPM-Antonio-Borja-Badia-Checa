import java.util.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
public class Inventario {

    public static String xmlRuta;
    public static File archivo;
    ArrayList <Componente> existencias;

    public Inventario(ArrayList<Componente> existencias) {
existencias= new ArrayList<>();

    }
    public Inventario(){}


    public void ContabilizarProductos(Producto producto){

        Iterator<Componente> itEspecificaciones= producto.getEspecificacionesArrayList().iterator();

        while (itEspecificaciones.hasNext()){

            Componente especificacion=itEspecificaciones.next();
            Iterator<Componente> itExistencias = existencias.iterator();
            boolean encontrado= false;

            while ((itEspecificaciones.hasNext())&&(!encontrado)){
                Componente existencia= itExistencias.next();
                if(existencia.equals(especificacion)){

                    existencia.setCantidad((existencia.getCantidad()-especificacion.getCantidad()));
                    encontrado=true;

                }


            }

        }
    }

    public ArrayList <Componente> minimasExistencias(Producto producto){

        ArrayList <Componente> escasos= new ArrayList<>();

        Iterator<Componente> itEspecificaciones= producto.getEspecificacionesArrayList().iterator();

        while (itEspecificaciones.hasNext()){

            Componente especificacion=itEspecificaciones.next();
            Iterator<Componente> itExistencias = existencias.iterator();
            boolean encontrado= false;

            while ((itEspecificaciones.hasNext())&&(!encontrado)){
                Componente existencia= itExistencias.next();
                if(existencia.equals(especificacion)){

                    existencia.setCantidad((existencia.getCantidad()-especificacion.getCantidad()));

                    if(existencia.getCantidad()-especificacion.getCantidad()*10<0)
    escasos.add(existencia);
                    encontrado=true;
                }

            }
    }
return escasos;
}

public void addExistencias(Componente existencia, int cantidadInicial){
        //TODO Comprobar que no exista ya
        existencia.setCantidad(cantidadInicial);
        existencias.add(existencia);


}
public void reponer(String id, int cantidad){
        Iterator <Componente> itExistencia =existencias.iterator();
        while (itExistencia.hasNext()){
            Componente existencia=itExistencia.next();
            if(existencia.getId())

        }


}

public void leerXML(String nombreArchivo){
    try {
        getXmlRuta(xmlRuta);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(archivo);
        doc.getDocumentElement().normalize();
        System.out.println(xmlRuta);
        System.out.println("Raíz del documento xml" + doc.getDocumentElement().getNodeName());
        NodeList nodes = doc.getElementsByTagName("aeropuerto");
        System.out.println("==========================");



}


    private void CargarDatos() {
        Set<String> hashSet = new HashSet<String>(minimasExistencias(""));//quitamos los países repetidos del array, ya que se añaden una vez por cada aeropuerto
        paises.clear();
        paises.addAll(hashSet);

        for (Object o : paises) {
            comboPaises.addItem(o);

        }
    }


    public static String getValue(String etiqueta, Element element) {
        NodeList nodes = element.getElementsByTagName(etiqueta).item(0).getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    }

    public String getXmlRuta(String nombreArchivo) {

        archivo = new File("aeropuertos.xml");
        xmlRuta = archivo.getAbsolutePath();

        return xmlRuta;
    }

}}
