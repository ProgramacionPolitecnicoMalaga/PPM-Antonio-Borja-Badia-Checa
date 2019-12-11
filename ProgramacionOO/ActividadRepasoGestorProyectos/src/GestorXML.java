import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.HashSet;
import java.util.*;


public class GestorXML {
    Document doc;
    private String nombreArchivo;
    private Actividad actividad;

    public GestorXML(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;


    }

    public GestorXML() {

    }

    public  void  CrearXMLAtividadesEmpleado(Empleados empleadoActividad){


    DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
    DocumentBuilder db= null;
    try {
        db = dbf.newDocumentBuilder();
    } catch (ParserConfigurationException e) {
        e.printStackTrace();
    }
    Document doc = db.newDocument();
    Element root = doc.createElement("Actividades");
    doc.appendChild(root);
Iterator <Actividad> it = empleadoActividad.getActividadesDelEmpleado().iterator();


while (it.hasNext()){
    Actividad actividad = it.next();
    Element NodoActividad = doc.createElement("Actividad");

    Attr NodoHorasActividad = doc.createAttribute("Horas");
     NodoHorasActividad.setValue(Double.toString(actividad.getNumHoras()));
    System.out.println(actividad.getNumHoras());

    Attr NodoNombreProyecto = doc.createAttribute("NombreProyecto");
NodoNombreProyecto.setValue(actividad.getProyecto().getNombre());
    System.out.println(actividad.getProyecto().getNombre());


    Attr NodoDescipcionActividad = doc.createAttribute("DescipcionActividad");
    NodoDescipcionActividad.setValue(actividad.getDescripcion());
    System.out.println(actividad.getDescripcion());

NodoActividad.setAttributeNode(NodoHorasActividad);
NodoActividad.setAttributeNode(NodoNombreProyecto);
NodoActividad.setAttributeNode(NodoDescipcionActividad);

root.appendChild(NodoActividad);


}
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    try {
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(empleadoActividad.getDNI()));
        transformer.setOutputProperty(OutputKeys.INDENT,"yes");
        transformer.transform(source,result);
    } catch (TransformerConfigurationException e) {
        e.printStackTrace();
    } catch (TransformerException e) {
        e.printStackTrace();
    }


}

    public void crearXMLActividadesDeProyecto(Proyecto ProyectoABuscar, ArrayList<Empleados> ListadeBusquedaDeActividades){
        ArrayList<Actividad> actividadesDelProyectoBuscado = new ArrayList<>();
        for (int i = 0; i < ListadeBusquedaDeActividades.size(); i++){
            Empleados empleadoqueItera = ListadeBusquedaDeActividades.get(i);
            for (int in = 0; in < empleadoqueItera.getActividadesDelEmpleado().size(); in++ ){
                if (empleadoqueItera.getActividadesDelEmpleado().get(in).getProyecto().getNombre().equals(ProyectoABuscar.getNombre())){
                    actividadesDelProyectoBuscado.add(empleadoqueItera.getActividadesDelEmpleado().get(in));
                }
            }
        }
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element root = doc.createElement ("ActividadesProyecto");
            doc.appendChild(root);


            Iterator<Actividad> it = actividadesDelProyectoBuscado.iterator();
            while (it.hasNext()){
                Actividad Actividad = it.next();
                Element NodoActividad = doc.createElement("Actividad");

                Attr NodoHorasDeLaActividad = doc.createAttribute("Horas");
                NodoHorasDeLaActividad.setValue(Double.toString(Actividad.getNumHoras()));


                Attr NodoNombreProyecto = doc.createAttribute("NombreProyecto");
                NodoNombreProyecto.setValue(Actividad.getProyecto().getNombre());


                Attr NodoDescripcionActividad = doc.createAttribute("DescripcionActividad");
                NodoDescripcionActividad.setValue(Actividad.getDescripcion());


                NodoActividad.setAttributeNode(NodoHorasDeLaActividad);
                NodoActividad.setAttributeNode(NodoNombreProyecto);
                NodoActividad.setAttributeNode(NodoDescripcionActividad);

                root.appendChild(NodoActividad);
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(ProyectoABuscar.getNombre()));
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.transform(source,result);
        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }

    public void crearXMLNominaEmpleado(ArrayList<Empleados> ListaParaCalcularNominas){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element root = doc.createElement ("Empleados");
            doc.appendChild(root);


            Iterator<Empleados> it = ListaParaCalcularNominas.iterator();
            while (it.hasNext()){
                Empleados empleado = it.next();
                Element NodoNominaEmpleado = doc.createElement("Empleado");

                Attr NodoNombre = doc.createAttribute("Nombre");
                NodoNombre.setValue(empleado.getNombre());


                Attr NodoApellido = doc.createAttribute("Apellidos");
                NodoApellido.setValue(empleado.getApellidos());


                Attr NodoDNI = doc.createAttribute("DNI");
                NodoDNI.setValue(empleado.getDNI());

                Attr NodoCategoria = doc.createAttribute("Categoria");
                NodoCategoria.setValue(empleado.getCategoria());

                Attr NodoSueldoBase = doc.createAttribute("SueldoBase");
                NodoSueldoBase.setValue(Integer.toString(empleado.getSueldo()));

                Attr NodoProductividad = doc.createAttribute("Productividad");
                NodoProductividad.setValue(Double.toString(empleado.getProductividad()));

                Attr NodoSueldotTotal = doc.createAttribute("SueldoTotal");
                NodoSueldotTotal.setValue(Double.toString(empleado.getSueldo() + empleado.getProductividad()));




                NodoNominaEmpleado.setAttributeNode(NodoNombre);
                NodoNominaEmpleado.setAttributeNode(NodoApellido);
                NodoNominaEmpleado.setAttributeNode(NodoCategoria);
                NodoNominaEmpleado.setAttributeNode(NodoSueldoBase);
                NodoNominaEmpleado.setAttributeNode(NodoProductividad);
                NodoNominaEmpleado.setAttributeNode(NodoSueldotTotal);

                root.appendChild(NodoNominaEmpleado);
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("NominasEmpleados"));
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.transform(source,result);
        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }




}
