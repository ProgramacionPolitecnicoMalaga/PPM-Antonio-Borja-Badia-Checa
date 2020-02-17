import java.util.ArrayList;
import java.util.Iterator;

public class Establecimiento {
	private ArrayList<Plato> platos;
	private String nombre;
	Coordenadas coordenadas;

	public Establecimiento(String nombre, double latitud, double longitud){
		this.nombre = nombre;
		coordenadas = new Coordenadas(latitud,longitud);
		platos = new ArrayList<Plato>();
	}

	public Coordenadas getCoordenadas(){
		return coordenadas;
	}

	public String getNombre(){
		return nombre;
	}

	public ArrayList<Plato> getPlatos(){
		return platos;
	}

	public void addPlato(Plato plato){
		platos.add(plato);
	}

	public boolean ofrecePlato(String nombrePlato) {
		Plato patrónDeBúsqueda = new Plato(nombrePlato,null);
		return platos.contains(patrónDeBúsqueda);
	}

	@Override
	public String toString() {
		String cadenaSalida = "ESTABLECIMIENTO: " + nombre + " (" + coordenadas.getLatitud() + "N," + coordenadas.getLongitud() + "W)\n";
		cadenaSalida += "\n   Platos que sirve: \n";
		Iterator<Plato> itPlato = platos.iterator();
		while (itPlato.hasNext()){
			Plato plato = itPlato.next();
			String nombrePlato = plato.getNombre();
			cadenaSalida += "\n  - " + plato.getNombre() + ": " + plato.getDescripción() + "\n";
		}
		return cadenaSalida;
	}

	@Override
	public boolean equals(Object obj) {
		Establecimiento otroEstablecimiento = (Establecimiento) obj;
		return nombre.equals(otroEstablecimiento.getNombre());
	}
}
