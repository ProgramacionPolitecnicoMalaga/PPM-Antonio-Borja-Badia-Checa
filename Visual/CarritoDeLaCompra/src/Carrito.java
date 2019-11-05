import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Carrito {
    private JPanel panelMain;
    private JPanel panelProductos;
    private JLabel jLabelNumProductos;
    private JLabel jLabelNombreProductos;
    private JComboBox comboListaProductos;
    private JPanel panelFactura;
    private JLabel jLabelListNumProductos;
    private JButton buttComprar;
    private JLabel jLabelListNomProductos;
    private JLabel jLabelListPrecioProductos;
    private JLabel jLabelPrecioSumado;
    private JScrollBar scrollBar1;
    private JTextArea textFacturaNumProductos;
    private JScrollBar scrollBar2;
    private JTextArea textFacturaNomProductos;
    private JScrollBar scrollBar3;
    private JTextArea textFacturaPrecioUnitario;
    private JScrollBar scrollBar4;
    private JTextArea textFacturaPrecioSumado;
    private JLabel jLabelSumaTotal;
    private JTextField textSumaTotal;
    private JTextField textNumProducto;
    static File listaDeProductos = new File("Productos.csv");
    BufferedReader objetoALeer=null;
    public final String SEPARADOR=";";
    String lineaActual="";
    ArrayList<Productos> arrayProductos = new ArrayList<>();

    public Carrito() {
        buttComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String [] campos;
                comboListaProductos.addItem(new Productos("","","","", 00));
                try {
                    objetoALeer= new BufferedReader( new FileReader(listaDeProductos.getAbsolutePath()));
                    lineaActual= (String.valueOf(new FileReader(listaDeProductos)));
                    while ((lineaActual=objetoALeer.readLine()) !=null){
                        campos=lineaActual.split(SEPARADOR);
                        double precio= Double.parseDouble(campos[4].replaceAll(",", "."));
                        Productos productos = new Productos(campos [0], campos[1],campos[2],campos[3],precio);
                        System.out.println(productos.toString());
                        arrayProductos.add(productos);
                        System.out.println(arrayProductos);

                        //usado ; como separador

                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });


        comboListaProductos.addActionListener(new ActionListener() {
    
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });
    }


    public void  CargarCsv{

        for( Productos c :arrayProductos){
            comboListaProductos.addItem(c);

        }


    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Carrito de la Compra");
        frame.setContentPane(new Carrito().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        System.out.println(listaDeProductos.getAbsolutePath());

    }

}
