import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import org.w3c.dom.Element;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
public class GestorXML {

    Document doc;
    private String nombreArchivo;

    public GestorXML(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;

    }

    public void abrir() {
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        try {
            File inputFile = new File(dir + File.separator + nombreArchivo);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = null;
            try {
                dBuilder = dbFactory.newDocumentBuilder();
            } catch (ParserConfigurationException ex) {
                ex.printStackTrace();
            }
            try {
                doc = dBuilder.parse(inputFile);
            } catch (SAXException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            doc.getDocumentElement().normalize();
            System.out.println(inputFile.getAbsolutePath());
NodeList nodeList= doc.getElementsByTagName("establecimientos/establecimiento");
for(int i=0;i<nodeList.getLength();i++) {
    Node node = nodeList.item(i);

    if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element eElement = (Element) node;

        if (eElement.hasChildNodes()) {
            NodeList nl = node.getChildNodes();
            for (int j = 0; j < nl.getLength(); j++) {
                Node nd = nl.item(j);
                System.out.println(nd.getTextContent());
            }
        }
    }
}
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
    public NodeList evaluateXPath(String xpathExpr) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
        return nodeList;
    }

    public Establecimientos  leerEstablecimientos () {
Establecimientos establecimientos = new Establecimientos();

        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            String xpathExpr = "/establecimientos/establecimiento";
            NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element elementoEstablecimiento = (Element) nodeList.item(i);
                String nombreEstablecimiento= getNombreEstablecimientoDeElementoEstablecimiento(elementoEstablecimiento);

            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return establecimientos;

    }
    public String getNombreEstablecimientoDeElementoEstablecimiento(Element elementoEstablecimiento){
        NodeList listaNodosEstablecimientos = elementoEstablecimiento.getElementsByTagName("nombre");
        Element NombreEstablecimiento = (Element) listaNodosEstablecimientos.item(0);
        if (NombreEstablecimiento == null)
            return "Sin nombre";
        else
            return NombreEstablecimiento.getTextContent();
    }


}