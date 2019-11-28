import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Map;

public class GestorProyectosYNominas {
    private JPanel panelMain;
    private JPanel jPanelRegistrarTrabajador;
    private JTextField textNombreTrabajador;
    private JTextField textApellidoTrabajador;
    private JComboBox comboCategoriaEmpleado;
    private JButton buttRegistraEmpleado;
    private JTextField textDNIEmpleado;


    public GestorProyectosYNominas() {
        buttRegistraEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Empleados empleados = new Empleados(textNombreTrabajador,textApellidoTrabajador,textDNIEmpleado,"");

                Iterator it = ;

             while (it.hasNext()){
Map.Entry entry=(Map.Entry)it.next();
                 System.out.println(entry.getKey()+", "+entry.getValue());
             }

            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Aeropuertos del Mundo");
        frame.setContentPane(new GestorProyectosYNominas().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //    frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//        System.out.println(archivo.getAbsolutePath());
        frame.setSize(500, 250);




    }



}
