import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public final static double LATITUD_ACTUAL = 43.060017;
	public final static double LONGITUD_ACTUAL =  -2.493796;

	public static Scanner lectorTeclado;
	public static void main(String[] args) {
		lectorTeclado = new Scanner(System.in).useDelimiter("\n");
		// Cargar los datos

		Ciudades ciudades = new Ciudades();

		ArchivoPlatosCSV archivoPlatosCSV = new ArchivoPlatosCSV("platos.csv");
		archivoPlatosCSV.cargarCiudadesYPlatos(ciudades);

		ArchivoEstablecimientosXML archivoEstablecimientosXML = new ArchivoEstablecimientosXML("establecimientos.xml");
		archivoEstablecimientosXML.abrirDocumento();
		archivoEstablecimientosXML.cargarEstablecimientosEnCiudades(ciudades);

		//System.out.println(ciudades);

		// Obtener una lista de establecimientos de una ciudad

		System.out.println("==========================================================================");
		System.out.println("                  ESTABLECIMIENTOS DE UNA CIUDAD: SAN SEBASTIÁN");
		System.out.println("==========================================================================");

		Ciudad sanSebastián = ciudades.getCiudadPorNombre("San Sebastián");
		ArrayList<Establecimiento> establecimientosDeSanSebastián = sanSebastián.getEstablecimientos();
		for (Establecimiento establecimiento: establecimientosDeSanSebastián)
			System.out.println("\n - " + establecimiento);


		// Obtener una lista de platos típicos de una ciudad

		System.out.println("==========================================================================");
		System.out.println("				PLATOS TÍPICOS DE UNA CIUDAD: BILBAO");
		System.out.println("==========================================================================");

		Ciudad bilbao = ciudades.getCiudadPorNombre("Bilbao");
		ArrayList<Plato> platosDeBilbao = bilbao.getPlatos();
		for (Plato plato: platosDeBilbao)
			System.out.println("\n - " + plato);


		// Obtener una lista de restaurantes de una ciudad donde se sirve un cierto plato típico

		System.out.println("==========================================================================");
		System.out.println(" 			LISTA DE RESTAURANTES DE TOLOSA QUE SIRVEN ANGULAS");
		System.out.println("==========================================================================");

		Ciudad tolosa = ciudades.getCiudadPorNombre("Tolosa");
		ArrayList<Establecimiento> establecimientosConAngulas = tolosa.getEstablecimientosPorNombreDePlato("Angulas al estilo tradicional");
		for (Establecimiento establecimiento: establecimientosConAngulas)
			System.out.println("\n - " + establecimiento);


		// Obtener el restaurante más cercano donde se sirve un cierto plato típico

		System.out.println("==========================================================================");
		System.out.println("	RESTAURANTE MÁS CERCANO A latitud 43.060017, longitud -2.493796 CON CHULETILLAS AL SARMIENTO");
		System.out.println("==========================================================================");

		Coordenadas ubicaciónActual = new Coordenadas(LATITUD_ACTUAL,LONGITUD_ACTUAL);

		Ciudad ciudadConChuletillas = ciudades.getCiudadPorNombreDePlato("Chuletillas al sarmiento");
		ArrayList<Establecimiento> establecimientosConChuletillas = ciudadConChuletillas.getEstablecimientosPorNombreDePlato("Chuletillas al sarmiento");

		Establecimiento establecimientoMásCercano = ubicaciónActual.getEstablecimientoAMínimaDistancia(establecimientosConChuletillas);

		System.out.println("El restaurante más cerca que ofrece chuletillas al sarmiento es:");
		System.out.println(establecimientoMásCercano);

		// Obtener la lista de platos de un cierto establecimiento

		System.out.println("==========================================================================");
		System.out.println("			PLATOS OFRECIDOS EN UN ESTABLECIMIENTO: DONE PEDRO");
		System.out.println("==========================================================================");

		Ciudad ciudadConEstablecimientoDonePedro = ciudades.getCiudadPorNombreDeEstablecimiento("Done Pedro");
		Establecimiento establecimientoDonePedro = ciudadConEstablecimientoDonePedro.getEstablecimientoPorNombre("Done Pedro");
		ArrayList<Plato> platosOfrecidosEnDonePedro = establecimientoDonePedro.getPlatos();

		System.out.println("Los platos ofrecidos por " + establecimientoDonePedro.getNombre() + " son:");
		for (Plato plato: platosOfrecidosEnDonePedro){
			System.out.println("\n - " + plato.getNombre() + " : " + plato.getDescripción() + "\n");
		}

		// Introducir un nuevo plato típico
		// NUEVO PLATO DE EJEMPLO: Gazpacho (Sopa fría de tomate). Plato típico de Tolosa.

		Plato nuevoPlato = new Plato("Gazpacho","Sopa fría de tomate");
		ciudades.getCiudadPorNombre("Tolosa").addPlato(nuevoPlato);

		// Introducir un nuevo establecimiento en la lista de establecimientos, con sus platos típicos.
		// NUEVO ESTABLECIMIENTO DE EJEMPLO: "El Andaluz". Ubicado en "Tolosa". Sólo sirve como plato típico "Gazpacho"

		Ciudad ciudadConAlubiasConSacramentos = ciudades.getCiudadPorNombreDePlato("Alubias con sacramentos");
		Plato alubiasConSacramentos = ciudadConAlubiasConSacramentos.getPlatoPorNombre("Alubias con sacramentos");
		Establecimiento nuevoEstablecimiento = new Establecimiento("El Andaluz",43.134872,-2.077739);
		nuevoEstablecimiento.addPlato(nuevoPlato);
		nuevoEstablecimiento.addPlato(alubiasConSacramentos);
		ciudades.getCiudadPorNombre("Tolosa").addEstablecimiento(nuevoEstablecimiento);

		System.out.println("==========================================================================");
		System.out.println(" 	NUEVO PLATO Y ESTABLECIMIENTO AÑADIDOS");
		System.out.println(" 	Establecimiento: El Andaluz");
		System.out.println(" 	Platos añadidos: Gazpacho; Alubias con sacramentos");
		System.out.println("	Ciudad: Tolosa");
		System.out.println("==========================================================================");

		System.out.println(ciudades.getCiudadPorNombre("Tolosa"));
	}
}
