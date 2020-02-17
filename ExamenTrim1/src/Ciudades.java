import java.util.ArrayList;
import java.util.Iterator;

public class Ciudades {
	private ArrayList<Ciudad> ciudades;

	public Ciudades(){
		this.ciudades = new ArrayList<Ciudad>();
	}

	public Ciudad getCiudadPorNombre(String nombreCiudad){
		Ciudad patrónBúsqueda = new Ciudad(nombreCiudad);
		int posCiudad = ciudades.indexOf(patrónBúsqueda);
		if (posCiudad > -1)
			return ciudades.get(posCiudad);
		else
			throw new CiudadNoExistenteException("La ciudad " + nombreCiudad + " no existe");
	}

	public Ciudad getCiudadPorNombreDePlato(String nombrePlato){
		for (Ciudad ciudad: ciudades){
			if (ciudad.tienePlatoTípico(nombrePlato))
					return ciudad;
		}
		throw new CiudadNoExistenteException("No exite la ciudad que sirve " + nombrePlato);
	}

	public Ciudad getCiudadPorNombreDeEstablecimiento(String nombreEstablecimiento){
		for (Ciudad ciudad: ciudades){
			if (ciudad.tieneEstablecimiento(nombreEstablecimiento)){
				return ciudad;
			}
		}
		throw new EstablecimientoNoExistenteException("El etablecimiento " + nombreEstablecimiento + " no existe");
	}

	public void addCiudad(Ciudad ciudad){
		ciudades.add(ciudad);
	}

	public boolean contieneCiudad(String nombreCiudad){
		Ciudad patrónBúsqueda = new Ciudad(nombreCiudad);
		return (ciudades.indexOf(patrónBúsqueda) > -1);
	}

	@Override
	public String toString() {
		return ciudades.toString();
	}
}
