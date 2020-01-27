import java.util.ArrayList;

public class Establecimientos {

    ArrayList<Establecimiento> establecimientoArrayList;

    public Establecimientos(){
        establecimientoArrayList = new ArrayList<>();
    }

    public void addEstablecimiento(Establecimiento establecimiento){
        establecimientoArrayList.add(establecimiento);
    }

    public ArrayList<Establecimiento> getEstablecimientoArrayList() {
        return establecimientoArrayList;
    }

    @Override
    public String toString() {
        return "Establecimientos{" +
                "establecimientoArrayList=" + establecimientoArrayList +
                '}';
    }

    public Establecimiento getEstablecimientoByNombreCiudad(String nombreCiudad) {
Establecimiento patronDeBusqueda = new Establecimiento(nombreCiudad);
        int posicionEstablecimiento = establecimientoArrayList.indexOf(patronDeBusqueda);
        if (posicionEstablecimiento > -1)
            return establecimientoArrayList.get(posicionEstablecimiento);
        else
            return null;
    }

    public Establecimiento getEstablecimientoMasCerca(Ubicacion ubicacion){
        Establecimiento establecimientoMasCercano=null;
        double minimaDistancia=Double.MAX_VALUE;
        for (Establecimiento establecimiento:establecimientoArrayList){

            ArrayList<Establecimiento> establecimientos = getEstablecimientoArrayList();
        for (Establecimiento estbl: establecimientos){
            double distanciaAEstablecimiento=establecimiento.getUbicacion().calcularDistancia(ubicacion, -2.493796,-2.83570138514671, 43.060017,43.2534790861035);
            if (distanciaAEstablecimiento < minimaDistancia) {
                minimaDistancia=distanciaAEstablecimiento;
                establecimientoMasCercano=establecimiento;
            }
        }
        }

return establecimientoMasCercano;
    }


}
