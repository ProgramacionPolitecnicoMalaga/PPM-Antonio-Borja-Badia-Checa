public class Aeropuertos {


    private String nomAeropuerto;
    private String area;
    private String matricula;
    private double longitud;
    private double latitud;

    public Aeropuertos(String nombreLargo, String attribute, String nomAeropuerto, String area, String matricula) {
        this.nomAeropuerto = nomAeropuerto;
        this.area = area;
        this.matricula = matricula;
        this.longitud=longitud;
        this.latitud=latitud;
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

    public double getLongitud() {
        return longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    @Override
    public String toString() {
        return "Aaeropuerto=  '" + nomAeropuerto + '\'' +
                ",      [Area]=  '" + area + '\'' +
                ",      [Matrícula]=  '" + matricula+'\''+
                ",      [Latitud]= '"+longitud+'\''+
                ",       [Longitud]=  '"+latitud+'\'';
    }
}
