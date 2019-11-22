import java.util.*;
public class Empleado {
    private String nombre;

    private double sueldo;

    public Empleado (String nombre){

this.nombre=nombre;
sueldo=2000;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }




    public static void main(String[] args) {

HashMap<String, Empleado> personal = new HashMap<String, Empleado>();

personal.put("145", new Empleado("Pepe"));//añade objetos al mapa
personal.put("146", new Empleado("Ana"));
personal.put("147", new Empleado("Sandra"));
personal.put("147", new Empleado("Si introduces otro objeto con la misma clave, sustituye al ya creado."));
personal.put("148", new Empleado("Borja"));
personal.remove("145");

//        System.out.println(personal);

        for (Map.Entry<String, Empleado> entrada: personal.entrySet()) {
        String clave = entrada.getKey();
        Empleado valor= entrada.getValue();

            System.out.println("Clave: "+ clave+" Valor: "+valor);

        }
    }

}
