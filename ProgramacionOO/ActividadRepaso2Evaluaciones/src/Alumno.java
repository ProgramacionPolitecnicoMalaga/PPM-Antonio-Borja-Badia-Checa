import java.util.TreeMap;

public class Alumno {

    private String nombre, DNI;
    private Curso curso;
    private Asignaturas asignatura;


    public Alumno(String nombre, String DNI, Curso curso, Asignaturas asignatura) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.curso = curso;
        this.asignatura = asignatura;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setAsignatura(Asignaturas asignatura) {
        this.asignatura = asignatura;
    }




}
