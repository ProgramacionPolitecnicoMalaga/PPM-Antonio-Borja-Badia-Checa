public class Aeropuertos {


    private String nomAeropuerto;
private String area;
private  String matricula;

    public Aeropuertos( String nomAeropuerto, String area, String matricula) {
        this.nomAeropuerto = nomAeropuerto;
        this.area = area;
        this.matricula = matricula;
    }

    public String getNomAeropuerto() {
        return nomAeropuerto;
    }

    public String getArea() {
        return area;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Nombre del Aaeropuerto: '" + nomAeropuerto + '\'' +
                ", Area='" + area + '\'' +
                ", Matrícula='" + matricula;
    }
}
