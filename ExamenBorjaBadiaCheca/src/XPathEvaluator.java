import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;


public class XPathEvaluator {
    private Document doc;


    public XPathEvaluator(String nombreFichero){
        String dir = System.getProperty("user.dir");
        try {
            File inputFile = new File(dir + File.separator + "establecimientos.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            doc = docBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }



    public void getPrintNodesByTagName (NodeList nodeSet){
    try {
        nodeSet = evaluateXPath("/establecimiento/establecimiento");
        printNodeList(nodeSet, 0);

        getPrintNodesByTagName(nodeSet);
    } catch (XPathExpressionException e) {
        e.printStackTrace();
    }
}


    public NodeList evaluateXPath(String xpathExpr) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
        return nodeList;
    }




    public  void printNodeList(NodeList listaDeNodos, int nivelProfundidad) {

        if (listaDeNodos !=  null){
            for (int i = 0; i < listaDeNodos.getLength(); i++) {
                System.out.println("----------------------------");
                Node n = listaDeNodos.item(i);
                printNodeInfo(n, nivelProfundidad);
                printNodeAttributes(n,nivelProfundidad);
                printNodeList(n.getChildNodes(), nivelProfundidad + 1);
            }
        }
    }

    private  void printNodeInfo(Node n, int nivelProfundidad){
        System.out.println(getSeparador(nivelProfundidad) + getStringNodeType(n) + n.getNodeName());
    }

    private void printNodeAttributes(Node n, int nivelProfundidad){
        if ((n!=null) && (n.getNodeType() == Element.ELEMENT_NODE)){
            NamedNodeMap atributos = n.getAttributes();
            if (atributos != null)
                for (int i=0; i<atributos.getLength(); i++)
                    System.out.println(getSeparador(nivelProfundidad) + "ATRIBUTO:" + atributos.item(i).toString());
        }
    }

    private  String getStringNodeType(Node n){
        if (n.getNodeType() == Element.ELEMENT_NODE)
            return "NODO ELEMENTO: ";
        else if (n.getNodeType() == Element.TEXT_NODE)
            return "NODO TEXTO : ";
        else if (n.getNodeType() == Element.ATTRIBUTE_NODE)
            return "NODO ATRIBUTO: ";
        else
            return "NODO: ";
    }

    private  String getSeparador(int numeroEspacios){
        String espacios = "";
        for (int i=0; i<numeroEspacios; i++) espacios += "\t";
        return espacios;
    }

}
