import javax.swing.*;
import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class Empleados {


    JTextField DNI;
    JTextField nombre;
    JTextField apellido;
    String categoria;

    public Empleados(JTextField DNI, JTextField nombre, JTextField apellido, String categoria) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;

        Map<String,String> empleados = new TreeMap<String, String>();
    }

    public JTextField getDNI() {
        return DNI;
    }

    public void setDNI(JTextField DNI) {
        this.DNI = DNI;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public JTextField getApellido() {
        return apellido;
    }

    public void setApellido(JTextField apellido) {
        this.apellido = apellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "DNI=" + DNI +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
