import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;


public class Aditivos {

    JPanel panelMain;
    JTextField textAditivoAbuscar;
    JButton butBuscar;
     JTable tableAditivos;
 JLabel lblBusqueda;

     TablaAditivoEncontrado modelo;
    Marcador marcador;

    BufferedReader objetoALeer=null;
    public final String SEPARADOR=";";
    private static File archivo;
ArrayList aditivos = new ArrayList();
    String peligrosidad, name,comentario;

    public Aditivos(String peligrosidad, String name, String comentario) {
        this.peligrosidad = peligrosidad;
        this.name = name;
        this.comentario = comentario;
    }

    public Aditivos() {

        butBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                marcador.setTexto(textAditivoAbuscar.getText());
                modelo.busqueda(textAditivoAbuscar.getText());
            }
        });
    }

    public String getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(String peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }




    public static String rutaJson(String nombreJson){//metodo para extraer la ruta absoluta de la imagen. Sospecho que sólo funciona a nivel de "proyecto".
        archivo = new File(nombreJson);
        String rutaJson=archivo.getAbsolutePath();
        return rutaJson;

    }


    private void createUIComponents() {
        modelo = new TablaAditivoEncontrado();
        modelo.leerJson("aditivos.json");
        marcador=new Marcador("");
        tableAditivos = new JTable(modelo);
        tableAditivos.setDefaultRenderer(Object.class, marcador);
        tableAditivos.getColumnModel().getColumn(2).setPreferredWidth(800);
    }



    public static void main(String[] args)  {
        JFrame frame = new JFrame("Buscador instantáneo de Aditivos y sus caracteristicas a partir de un json");
        frame.setContentPane(new Aditivos().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400,300));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        System.out.println(rutaJson("aditivos.json"));
    }






}
