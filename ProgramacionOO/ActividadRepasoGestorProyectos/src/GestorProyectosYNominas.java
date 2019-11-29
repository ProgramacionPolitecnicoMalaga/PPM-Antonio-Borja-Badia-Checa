import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class GestorProyectosYNominas {
    public JPanel panelMain;



    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestor de proyectos y Nóminas");
        frame.setContentPane(new GestorProyectosYNominas().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //    frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//        System.out.println(archivo.getAbsolutePath());
        frame.setSize(500, 250);

        TreeMap<String, Empleados> empleadosTreeMap = new TreeMap<String, Empleados>();
empleadosTreeMap.put("2486661S", new Empleados("2486661S","Empleadio1", "Apellido1", "Técnico"));
empleadosTreeMap.put("4685451T", new Empleados("4685451T","Empleadio2", "Apellido2", "Administrador"));
empleadosTreeMap.put("0854547Y", new Empleados("0854547Y","Empleadio3", "Apellido3", "Programador"));
empleadosTreeMap.put("248766K", new Empleados("248766K","Empleadio4", "Apellido4", "J.Proyecto"));
empleadosTreeMap.put("5488669O", new Empleados("5488669O","Empleadio5", "Apellido5", "J.Operaciones"));

        for (Empleados empl : empleadosTreeMap.values()   ) {
            System.out.println(empl.toString());

        }

    }



}
