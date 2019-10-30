package ParseCSV;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;

public class ParseCSV {

    private JPanel panelMain;
    private JTextField textProductosABuscar;
    private JButton buttBuscar;
    private JTextArea textProductosEncontrados;
    private JScrollPane panelProductosEncontrados;
    private JButton buttLimpiar;
    static File listaDeProductos = new File("Productos.csv");
    BufferedReader  objetoALeer=null;
    public final String SEPARADOR=";";
    String lineaActual;

    public ParseCSV() {

       buttBuscar.setEnabled(false);
        buttLimpiar.setEnabled(false);

        textProductosABuscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(textProductosABuscar.getText().trim().equalsIgnoreCase("")){
                    buttBuscar.setEnabled(false);
                }else{
                    buttBuscar.setEnabled(true);
                }}
        });
        buttLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textProductosEncontrados.setText("");
                textProductosABuscar.setText("");
                buttLimpiar.setEnabled(false);
            }
        });

        buttBuscar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String [] campos ;
textProductosEncontrados.setText("");


                try {
                    objetoALeer= new BufferedReader(new FileReader(listaDeProductos.getAbsolutePath()));
                    while ((lineaActual=objetoALeer.readLine()) !=null){
                        campos=lineaActual.split(SEPARADOR);

                        if (lineaActual.toLowerCase().contains(textProductosABuscar.getText().toLowerCase())){
                textProductosEncontrados.append(campos[1]);
                textProductosEncontrados.append(System.getProperty("line.separator"));
                        }
                    }
                } catch (FileNotFoundException a) {
                    a.printStackTrace();
                } catch (IOException a) {
                    a.printStackTrace();
                }             if(objetoALeer!=null) {
                    try {
                        objetoALeer.close();
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                buttLimpiar.setEnabled(true);
            }

        });

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Buscador de productos a partir de un CSV");
        frame.setContentPane(new ParseCSV().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400,300));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

     System.out.println(listaDeProductos.getAbsolutePath());

    }


}
