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

    public double calcularDistancia(Ubicacion ubicacion, double lon1, double lon2, double lat1, double lat2){
        lat1=43.060017;
        lon1=-2.493796;

        double theta = lon1 - lon2;
        double dist = Math.sin(Math.toRadians(lat1)) *
                Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) *
                Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
        dist = Math.acos(dist);
        dist = Math.toDegrees(dist);
        dist = dist * 60 * 1.853159616;
        return dist;
    }

    @Override
    public String toString() {
        return "ubicacion{" +
                "latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}
