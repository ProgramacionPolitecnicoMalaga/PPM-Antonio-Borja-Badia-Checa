import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import  java.util.ArrayList;
import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import  java.util.*;
public class ApMundo {
    private JPanel panelMain;
    private JPanel panelPaises;
    private JComboBox comboPaises;
    private JButton mostrarButton;
    private JPanel panelAeropuertos;
    private JTextArea listAeropuertos;
    public File xmlAeropuertos;
    public static String xmlRuta;
    public static File archivo;
    public ArrayList<String> paises = new ArrayList<>();


 /*  public listModel = new DefaultListModel<>();

 public    list = new JList<>(listModel);

        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list.setVisibleRowCount(-1);*/



    public  ApMundo() {

        try {
            archivo = new File("aeropuertos.xml");
            xmlRuta = archivo.getAbsolutePath();
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(archivo);
            doc.getDocumentElement().normalize();

            System.out.println("Raíz del documento xml" + doc.getDocumentElement().getNodeName());
            NodeList nodes = doc.getElementsByTagName("aeropuerto");
            System.out.println("==========================");
//            System.out.println("Nº Aeropuertos: " + nodes.getLength());
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("País: " +element.getAttribute("pais"));
                    System.out.println("Nombre del Aeropuerto: " + element.getAttribute("nombreLargo"));
                    paises.add(element.getAttribute("pais"));
                }
            }
            CargarDatos();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
      //  System.out.println(archivo);
        comboPaises.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String paisSeleccionado= (String) comboPaises.getSelectedItem();
listAeropuertos.setText(paisSeleccionado);

            }


        });
    }




    private  void CargarDatos(){
                Set <String>hashSet = new HashSet<String>(paises);//quitamos los países repetidos del array, ya que se añaden una vez por cada aeropuerto
                paises.clear();
                paises.addAll(hashSet);

        for ( Object o: paises ){
            comboPaises.addItem(o);

        }
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApMundo apMundo = (ApMundo) o;
        return Objects.equals(paises, apMundo.paises);
    }*/



    public static String getValue(String etiqueta, Element element) {
        NodeList nodes = element.getElementsByTagName(etiqueta).item(0).getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    }

    public String getXmlRuta(String nombreArchivo) {

        archivo = new File(nombreArchivo);
        String xmlRuta = archivo.getAbsolutePath();
        return xmlRuta;
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Aeropuertos del Mundo");
        frame.setContentPane(new ApMundo().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//        System.out.println(archivo.getAbsolutePath());

    }
}



