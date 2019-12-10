import java.util.ArrayList;

public class Ciudad {
    String nombre;
    ArrayList<Estacion> estaciones;

    public Ciudad(String nombre){
        this.nombre = nombre;
        estaciones = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public ArrayList<Estacion> getEstaciones(){
        return estaciones;
    }

    public void addEstación(Estacion estacion){
        estaciones.add(estacion);
    }

    public ArrayList<Estacion> getEstacionesByTipo(int tipo){
        ArrayList<Estacion> estacionesPorTipo = new ArrayList<>();
        for (Estacion estación: estaciones){
            System.out.println(estación);
            if (estación.getTipo() ==  tipo)
                estacionesPorTipo.add(estación);
        }
        return estacionesPorTipo;
    }

    @Override
    public boolean equals(Object obj) {
        Ciudad otraCiudad = (Ciudad) obj;
        return nombre.equals(otraCiudad.getNombre());
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", estaciones=" + estaciones +
                '}';
    }
}
