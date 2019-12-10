import java.util.*;
public class Ciudades {

    ArrayList<Ciudad> ciudades;

    public Ciudades(){
        ciudades = new ArrayList<>();
    }

    public void addCiudad(Ciudad ciudad){
        ciudades.add(ciudad);
    }

    public ArrayList<Ciudad> getCiudades(){
        return ciudades;
    }

    public ArrayList<Estacion> getEstacionesByTipo(int tipo){
        ArrayList<Estacion> estaciones = new ArrayList<>();
        for (Ciudad ciudad: ciudades){
            ArrayList<Estacion> estacionesCiudad = ciudad.getEstacionesByTipo(tipo);
            if (estacionesCiudad.size() > 0)
                estaciones.addAll(estacionesCiudad);
        }
        return estaciones;
    }

    @Override
    public String toString() {
        return "Ciudades{" +
                "ciudades=" + ciudades +
                '}';
    }

    public Estacion getEstacionMasCercanaA(Ubicacion ubicacion){
        Estacion estacionMasCercana = null;
        double mínimaDistancia = Double.MAX_VALUE;
        for (Ciudad ciudad: ciudades){
            ArrayList<Estacion> estaciones = ciudad.getEstaciones();
            for (Estacion estación: estaciones){
                double distanciaAEstación = estación.getUbicacion().calcularDistancia(ubicacion);
                if (distanciaAEstación<mínimaDistancia){
                    mínimaDistancia = distanciaAEstación;
                    estacionMasCercana = estación;
                }
            }
        }
        return estacionMasCercana;
    }

    public Ciudad getCiudadByNombre(String nombreCiudad) {
        Ciudad patrónDeBúsqueda = new Ciudad(nombreCiudad);
        int posiciónCiudad = ciudades.indexOf(patrónDeBúsqueda);
        if (posiciónCiudad > -1)
            return ciudades.get(posiciónCiudad);
        else
            return null;
    }

}
