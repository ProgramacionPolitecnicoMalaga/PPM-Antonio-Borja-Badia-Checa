import java.util.Objects;

public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private double cuentaBancaria;

    public Cliente(String nombre, String apellido, String dni, double cuentaBancaria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentaBancaria = cuentaBancaria;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", DNI='" + dni + '\'' +
                ", Cuenta Bancaria='" + cuentaBancaria + '\'' +
                '}'+"\n";
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(double cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public boolean equals(Object o) {
Cliente cliente=(Cliente)o;
return cliente.getDni().equalsIgnoreCase(this.getDni());

    }


}
