import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.*;

//public HashMap<String, ArrayList> infoAeropuertos = new HashMap<String, ArrayList>();


public class XMLCancionesReader {
    public static String xmlRuta;
    public static File archivo;
    public ArrayList<String> listaReproduccion = new ArrayList<>();

    public XMLCancionesReader() {

        try {
            getXmlRuta(xmlRuta);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(archivo);
            doc.getDocumentElement().normalize();
            System.out.println(xmlRuta);
            System.out.println("Raíz del documento xml" + doc.getDocumentElement().getNodeName());
            NodeList nodes = doc.getElementsByTagName("ListaCanciones");
            System.out.println("==========================");

            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String cancion = element.getAttribute("cancion");
                    System.out.println("Nombre de la Cancion: " + cancion);
                    System.out.println("Nombre del archivo: " + element.getAttribute("file"));
                    listaReproduccion = (element.getAttribute("titulo"), element.getAttribute("file"));
                    listaReproduccion.add(cancion);

                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        CargarDatos();
    }

    public static String getValue(String etiqueta, Element element) {
        NodeList nodes = element.getElementsByTagName(etiqueta).item(0).getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    }

        private void CargarDatos() {
            /*Set<String> hashSet = new HashSet<String>(canciones);//quitamos los países repetidos del array, ya que se añaden una vez por cada aeropuerto
            canciones.clear();
            canciones.addAll(hashSet);*/

            for (Object o : listaReproduccion) {
                listaReproduccion.addAll((Collection<? extends String>) o);

            }
        }


        public String getXmlRuta(String nombreArchivo) {

            archivo = new File("canciones.xml");
            xmlRuta = archivo.getAbsolutePath();

            return xmlRuta;
        }






}}
