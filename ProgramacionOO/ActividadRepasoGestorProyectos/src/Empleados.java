import javax.swing.*;
import java.util.*;


public class Empleados {

    String nombre;
    String apellidos;
    String DNI;
    String categoria;
    int sueldo;
    double productividad = 0;
    ArrayList<Actividad> actividadesDelEmpleado = new ArrayList<>();

    public Empleados(String nombre, String apellidos, String DNI, String categoria, int sueldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.categoria = categoria;
        this.sueldo = sueldo;
    }

    public double calcularProductividad(){
        double prodCalculada = 0;
        for (int i = 0; i < actividadesDelEmpleado.size(); i++){
            prodCalculada += actividadesDelEmpleado.get(i).getProyecto().getFactorProductividad() * actividadesDelEmpleado.get(i).getNumHoras();

        }
        return this.productividad = prodCalculada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Actividad> getActividadesDelEmpleado() {
        return actividadesDelEmpleado;
    }

    public void setActividadesDelEmpleado(ArrayList<Actividad> actividadesDelEmpleado) {
        this.actividadesDelEmpleado = actividadesDelEmpleado;
    }

    public double getProductividad() {
        return productividad;
    }

    public void setProductividad(double productividad) {
        this.productividad = productividad;
    }

    public void añadirActividadRealizada(Actividad ActividadRealizada){
        actividadesDelEmpleado.add(ActividadRealizada);
    }
    public void MostrarActividadesRealizadas(){
        Iterator<Actividad> it = actividadesDelEmpleado.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }


}
