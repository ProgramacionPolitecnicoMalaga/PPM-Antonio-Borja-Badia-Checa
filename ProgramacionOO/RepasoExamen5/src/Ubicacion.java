public class Ubicacion {

    double latitud;
    double longitud;

    public Ubicacion(double latitud, double longitud){
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public double calcularDistancia(Ubicacion ubicacion){
        double theta = longitud - ubicacion.getLongitud();
        double dist = Math.sin(Math.toRadians(latitud)) * Math.sin(Math.toRadians(ubicacion.getLatitud())) + Math.cos(Math.toRadians(latitud)) * Math.cos(Math.toRadians(ubicacion.getLatitud())) * Math.cos(Math.toRadians(theta));
        dist = Math.acos(dist);
        dist = Math.toDegrees(dist);
        return dist * 60 * 1.853159616;
    }

    @Override
    public String toString() {
        return "ubicacion{" +
                "latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}
