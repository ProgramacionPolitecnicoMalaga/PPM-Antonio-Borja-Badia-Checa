import java.util.*;

public class Curso {

    private String id, nombre;
    Asignaturas asignaturasCurso;

    public Curso(String id, String nombre, Asignaturas asignaturasCurso) {
        this.id = id;
        this.nombre = nombre;
        this.asignaturasCurso=asignaturasCurso;
    }

    public Curso() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Asignaturas getAsignaturasCurso(){

        return asignaturasCurso;


    }



public void mostrarAsignaturas (){

    System.out.println("Curso: " +nombre);

}




    @Override
    public String toString() {
        return "Curso{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
