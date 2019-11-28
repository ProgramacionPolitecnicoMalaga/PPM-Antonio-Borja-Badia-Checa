import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;
import java.util.HashSet;
import java.util.Set;



public class GestorXML {


    public static String xmlRuta;
    public static File archivo;

   /* private void CargarDatos() {
       Set<String> hashSet = new HashSet<String>(paises);//quitamos los países repetidos del array, ya que se añaden una vez por cada aeropuerto
        paises.clear();
        paises.addAll(hashSet);

        for (Object o : paises) {
            comboPaises.addItem(o);

        }
    }*/

   /* public static String getValue(String etiqueta, Element element) {
        NodeList nodes = element.getElementsByTagName(etiqueta).item(0).getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    }

    public String getXmlRuta(String nombreArchivo) {

        archivo = new File("aeropuertos.xml");
        xmlRuta = archivo.getAbsolutePath();

        return xmlRuta;
    }    */
}
