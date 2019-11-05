import java.util.Date;

public class Invitados {

    String indice, nombre, apellido;
Date fechNacimiento;

    public Invitados(String indice, String nombre, String apellido, Date fechNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechNacimiento = fechNacimiento;

    this.indice=indice;

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

    public String getIndice() {
        return indice;
    }

    @Override
    public String toString() {
        return "Invitados{" +
                "indice='" + indice + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechNacimiento=" + fechNacimiento +
                '}';
    }
}
