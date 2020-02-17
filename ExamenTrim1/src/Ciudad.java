import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ciudad {
	private String nombre;
	private ArrayList<Establecimiento> establecimientos;
	private ArrayList<Plato> platos;

	public Ciudad(String nombreCiudad){
		nombre = nombreCiudad;
		establecimientos = new ArrayList<Establecimiento>();
		platos = new ArrayList<Plato>();
	}

	public String getNombre(){
		return nombre;
	}

	public ArrayList<Establecimiento> getEstablecimientos(){
		return establecimientos;
	}

	public ArrayList<Plato> getPlatos(){
		return platos;
	}

	public Plato getPlatoPorNombre(String nombrePlato){
		Plato patrónDeBúsqueda = new Plato(nombrePlato,"");
		int posPlato = platos.indexOf(patrónDeBúsqueda);
		if (posPlato > -1)
			return platos.get(posPlato);
		else
			throw new PlatoNoExistenteException("No existe el plato " + nombrePlato + " en la ciudad " + nombre);
	}

	public Establecimiento getEstablecimientoPorNombre(String nombreEstablecimiento){
		Establecimiento patrónDeBúsqueda = new Establecimiento(nombreEstablecimiento,0,0);
		int posEstablecimiento = establecimientos.indexOf(patrónDeBúsqueda);
		if (posEstablecimiento > -1)
			return establecimientos.get(posEstablecimiento);
		else
			throw new EstablecimientoNoExistenteException("No existe el establecimiento " + nombreEstablecimiento + " en la ciudad " + nombre);
	}

	public ArrayList<Establecimiento> getEstablecimientosPorNombreDePlato(String nombrePlatoElegido) {
		ArrayList<Establecimiento> establecimientosPorNombreDePlato = new ArrayList<>();
		for (Establecimiento establecimiento: establecimientos){
			if (establecimiento.ofrecePlato(nombrePlatoElegido))
				establecimientosPorNombreDePlato.add(establecimiento);
		}
		return establecimientosPorNombreDePlato;
	}

	public void addPlato(Plato plato){
		platos.add(plato);
	}

	public void addEstablecimiento(Establecimiento establecimiento){
		establecimientos.add(establecimiento);
	}

	public boolean tienePlatoTípico(String nombrePlato){
		Plato patrónDeBúsqueda = new Plato(nombrePlato,"");
		return platos.indexOf(patrónDeBúsqueda) > -1;
	}

	public boolean tieneEstablecimiento(String nombreEstablecimiento){
		Establecimiento patrónDeBúsqueda = new Establecimiento(nombreEstablecimiento,0,0);
		return establecimientos.indexOf(patrónDeBúsqueda) > -1;
	}

	@Override
	public boolean equals(Object obj) {
		Ciudad otraCiudad = (Ciudad) obj;
		return nombre.equals(otraCiudad.getNombre());
	}

	@Override
	public String toString() {
		String cadenaSalida = "=========================================\n"
				+ "CIUDAD:" + nombre + "\n" +
				"----------------Platos típicos------------------ \n";
		Iterator<Plato> itPlato = platos.iterator();
		while (itPlato.hasNext())
			cadenaSalida += "\n - " + itPlato.next() + "\n";
		cadenaSalida += "----------------- Establecimientos ---------------------\n";
		Iterator<Establecimiento> itEstablecimiento = establecimientos.iterator();
		while (itEstablecimiento.hasNext())
			cadenaSalida += "\n - " + itEstablecimiento.next() + "\n";
		cadenaSalida += "============================================";
		return cadenaSalida;
	}
}
