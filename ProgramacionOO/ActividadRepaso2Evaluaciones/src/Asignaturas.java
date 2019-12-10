import java.util.*;


public class Asignaturas {
private String id, nombre;
private Curso curso;
public ArrayList <Asignaturas> nuevaAsignatura;
private ArrayList<Alumno> alumnoArrayList = new ArrayList<>();

    public Asignaturas(String id, String nombre,  ArrayList<Alumno> alumnoArrayList) {
        this.id = id;
        this.nombre = nombre;
        this.alumnoArrayList = alumnoArrayList;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void annadirAlumno(Alumno alumno){

        alumnoArrayList.add(alumno);
    }


    public Iterator mostrarAsignaturas (ArrayList<Asignaturas> nuevaAsignatura) {
        Iterator<Asignaturas> it = nuevaAsignatura.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        return (Iterator) nuevaAsignatura;
    }


}
