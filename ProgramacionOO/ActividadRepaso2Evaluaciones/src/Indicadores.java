public class Indicadores {

    private String tipo;
    private String nombre;
private Nota nota;
private Asignaturas asignatura;

    public Indicadores(String tipo, String nombre, Nota nota) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.nota = nota;
    }




    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public  void  annadirIndicador(Indicadores indicador){

        nota.indicadoresNotaDeAlumnoTreeMap.put(indicador,null);
    }

    @Override
    public String toString() {
        return "Tipo de indicador: " + tipo +
                "\nNombre: " + nombre +
                "\nAsignatura: " + asignatura.getNombre();
    }



}
