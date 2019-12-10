import java.util.Map;
import java.util.*;

public class Nota {

    float nota;
    String observaciones;
    private Alumno alumno;
    private Indicadores indicadores;
    private Asignaturas asignaturas;

    public TreeMap<Indicadores, Nota> indicadoresNotaDeAlumnoTreeMap = new TreeMap<Indicadores,Nota>();

    public Nota(float nota, String observaciones, Alumno alumno, Indicadores indicadores, Asignaturas asignaturas) {
        this.nota = nota;
        this.observaciones = observaciones;
        this.alumno = alumno;
        this.indicadores = indicadores;
        this.asignaturas = asignaturas;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public void setAsignatura(Asignaturas asignatura) {
        this.asignaturas=asignatura;
    }
    public TreeMap<Indicadores,Nota> getIndicadoresNotaDeAlumnoTreeMap(){

        return indicadoresNotaDeAlumnoTreeMap;
    }

    public void setIndicadores(Indicadores indicadores) {
        this.indicadores = indicadores;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nota=" + nota +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }

    public void listarNotas() {
        System.out.println("Alumno: " + alumno.getNombre());
        Iterator it = indicadoresNotaDeAlumnoTreeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Indicadores key = (Indicadores) entry.getKey();
            Nota value = (Nota) entry.getValue();
            if (value != null) {
                System.out.println(key + "\n" + value);
            }
        }
    }
    public void ponerNota(Indicadores indicador, Nota nota){
        indicadoresNotaDeAlumnoTreeMap.replace(indicador,nota);
    }


}
