import javax.swing.*;
import java.util.*;


public class Empleados {


    String DNI;
    String nombre;
    String apellido;
    String categoria;

    public Empleados(String DNI, String nombre, String apellido, String categoria) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
    }

    public void annadirEmpleado(Empleados nuevoEmpleado){
    }

    public Empleados(){}

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   /*
    public String getCategoria() {
        return categoria;
    }*/

   /* public void setCategoria(String categoria) {
        this.categoria = categoria;
    }*/

    @Override
    public String toString() {
        return "Empleados{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }



}
