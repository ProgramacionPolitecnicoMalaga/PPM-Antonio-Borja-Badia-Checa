import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashSet;
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
    private JTextField textField1;
    static File listaDeProductos = new File("Productos.csv");
    BufferedReader objetoALeer=null;
    public final String SEPARADOR=";";
    String lineaActual="";



    public Carrito() {
        buttComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        comboListaProductos.addActionListener(new ActionListener() {
    
            @Override
            public void actionPerformed(ActionEvent e) {
String campoAmostrar;
                Set<String> campoAmostrarSet = new HashSet<>();
                try {
                    objetoALeer= new BufferedReader( new FileReader(listaDeProductos.getAbsolutePath()));
                    System.out.println("\n"+listaDeProductos.getAbsolutePath());
               lineaActual= (String.valueOf(new FileReader(listaDeProductos)));
              while ((lineaActual=objetoALeer.readLine()) !=null){
                  //usado ; como separador

                  String [] campos = lineaActual.split(String.valueOf(listaDeProductos));
                    campoAmostrar= campos[1];
ComboBoxModel model = comboListaProductos.getModel();
        int tamanno= model.getSize();
campoAmostrarSet.add(campoAmostrar);
comboListaProductos.addItem(campoAmostrar);

}
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Carrito de la Compra");
        frame.setContentPane(new Carrito().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
