import javax.swing.*;
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

        Empleados emp1 = new Empleados("Empleado1", "Apellido1", "268751P", "Tecnico", 900);
        Empleados emp2 = new Empleados("nombre2", "Apellidos2","dni2","Tecnico", 900);
        Proyecto pro1 = new Proyecto(2.2,"Emple1", "Informatica","Proyecto mediano");
        Actividad act1 = new Actividad(15, pro1,"esta es la descripcion de la actividad");
        Actividad act2 = new Actividad(12, pro1,"esta es la descripcion de la segunda actividad");
        GestorXML gen1 = new GestorXML();
        ArrayList<Empleados> listaempleadosEmpresa = new ArrayList<>();

        listaempleadosEmpresa.add(emp1);
        listaempleadosEmpresa.add(emp2);

        emp1.añadirActividadRealizada(act1);
        emp1.añadirActividadRealizada(act2);
        emp1.añadirActividadRealizada(act1);

        emp2.añadirActividadRealizada(act2);
        emp2.añadirActividadRealizada(act1);
        emp2.añadirActividadRealizada(act2);

        emp1.MostrarActividadesRealizadas();
        emp2.MostrarActividadesRealizadas();

        System.out.println(emp1.getProductividad());
        System.out.println(emp2.getProductividad());

        emp1.calcularProductividad();
        emp2.calcularProductividad();

        System.out.println(emp1.getProductividad());
        System.out.println(emp2.getProductividad());

        System.out.println("======================");

        gen1.CrearXMLAtividadesEmpleado(emp1);
        gen1.crearXMLActividadesDeProyecto(pro1,listaempleadosEmpresa);
        gen1.crearXMLNominaEmpleado(listaempleadosEmpresa);




    }



}
