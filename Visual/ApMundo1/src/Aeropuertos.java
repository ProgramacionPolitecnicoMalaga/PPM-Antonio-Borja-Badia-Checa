public class Aeropuertos {

    private String pais;
    private String nomAeropuerto;

    public Aeropuertos(String pais, String nomAeropuerto) {
        this.pais = pais;
        this.nomAeropuerto = nomAeropuerto;
    }

    public String getPais() {
        return pais;
    }

    public String getNomAeropuerto() {
        return nomAeropuerto;
    }

    @Override
    public String toString() {
        return "Aeropuertos{" +
                "pais='" + pais + '\'' +
                ", nomAeropuerto='" + nomAeropuerto + '\'' +
                '}';
    }
}
