import java.util.*;

public class Cursos {
public Curso curso;
public Asignaturas asignaturas;

ArrayList <Curso> nuevoCurso = new ArrayList<>();
ArrayList<Asignaturas> asignaturasArrayList = new ArrayList<>();
    public Cursos( ) {
        this.nuevoCurso = new ArrayList<>();
    }

    public  void annadirCurso(Curso curso){

    nuevoCurso.add(curso);
}
    public void annadirAsignatura(Curso asignatura){

        add(asignatura);

    }


}
