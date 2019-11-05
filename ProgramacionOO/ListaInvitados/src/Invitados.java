import java.util.Date;

public class Invitados {

    String nombre, apellido;
Date fechNacimiento;

    public Invitados(String nombre, String apellido, Date fechNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechNacimiento = fechNacimiento;
    }




    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechNacimiento() {
        return fechNacimiento;
    }

    @Override
    public String toString() {
        return "Invitados{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechNacimiento=" + fechNacimiento +
                '}';
    }
}
