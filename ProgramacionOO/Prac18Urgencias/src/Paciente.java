public class Paciente {
    String DNI, nobre;
int edad, idEspecialidad, prioridad;
boolean incidenciaGravedad;

    public Paciente(String DNI, String nobre,  int edad, int idEspecialidad, boolean incidenciaGravedad) {
        this.nobre = nobre;
        this.edad = edad;
        this.idEspecialidad = idEspecialidad;
        this.incidenciaGravedad = incidenciaGravedad;
    this.DNI=DNI;
    this.prioridad=idEspecialidad;
    }

    public String getNobre() {
        return nobre;
    }

    public void setNobre(String nobre) {
        this.nobre = nobre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public boolean isIncidenciaGravedad() {
        return incidenciaGravedad;
    }

    public void setIncidenciaGravedad(boolean incidenciaGravedad) {
        this.incidenciaGravedad = incidenciaGravedad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nobre='" + nobre + '\'' +
                ", edad=" + edad +
                ", idEspecialidad=" + idEspecialidad +
                ", incidenciaGravedad=" + incidenciaGravedad +
                '}';
    }
}
