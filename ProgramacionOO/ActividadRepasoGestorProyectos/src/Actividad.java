public class Actividad {
    double numHoras;
    Proyecto proyecto;
    String descripcion;

    public Actividad(double numHoras, Proyecto proyecto, String descripcion) {
        this.numHoras = numHoras;
        this.proyecto = proyecto;
        this.descripcion = descripcion;
    }


    public double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "numHoras=" + numHoras +
                ", proyecto=" + proyecto +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
