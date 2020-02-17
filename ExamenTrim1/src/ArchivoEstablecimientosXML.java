import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
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

public class ArchivoEstablecimientosXML {
	private String nombreDocumento;
	private Document doc;

	public ArchivoEstablecimientosXML(String nombreDocumento){
		this.nombreDocumento = nombreDocumento;
	}
	public void abrirDocumento(){
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		try {
			File inputFile = new File(dir + File.separator + nombreDocumento);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}

	public void cargarEstablecimientosEnCiudades(Ciudades ciudades){
		try {
			XPath xPath = XPathFactory.newInstance().newXPath();
			String xpathExpr = "/establecimientos/establecimiento";
			NodeList listaNodosEstablecimiento = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
			for (int i=0; i<listaNodosEstablecimiento.getLength();i++){
				Element elementoEstablecimiento = (Element) listaNodosEstablecimiento.item(i);
				String nombreEstablecimiento = elementoEstablecimiento.getAttribute("nombre");
				double latitud = Double.parseDouble(elementoEstablecimiento.getAttribute("latitud"));
				double longitud = Double.parseDouble(elementoEstablecimiento.getAttribute("longitud"));
				String nombreCiudad = elementoEstablecimiento.getAttribute("ciudad");
				Ciudad ciudad = ciudades.getCiudadPorNombre(nombreCiudad);
				Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento,latitud,longitud);
				NodeList listaNodosPlato = elementoEstablecimiento.getElementsByTagName("plato");
				añadirPlatosAEstablecimientoAPartirDeNodosPlato(listaNodosPlato,establecimiento,ciudad);
				ciudad.addEstablecimiento(establecimiento);
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
	}

	private Establecimiento añadirPlatosAEstablecimientoAPartirDeNodosPlato(NodeList listaNodosPlato,Establecimiento establecimiento, Ciudad ciudad){
		// En el documento XML sólo está el nombre del mismo.
		// Se utiliza el objeto ciudad para obtener el objeto de clase Plato a partir del nombre encontrado en el documento.
		for (int j=0; j<listaNodosPlato.getLength(); j++){
			Element elementoPlato = (Element) listaNodosPlato.item(j);
			String nombrePlato = elementoPlato.getAttribute("nombre");
			Plato plato = ciudad.getPlatoPorNombre(nombrePlato);
			establecimiento.addPlato(plato);
		}
		return establecimiento;
	}
}
