import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ArchivoPlatosCSV {
	private final static int INDICE_NOMBRE_PLATO = 0;
	private final static int INDICE_DESCRIPCION_PLATO = 1;
	private final static int INDICE_NOMBRE_CIUDAD = 2;
	private String nombreArchivo;

	public ArchivoPlatosCSV(String nombreArchivo){
		this.nombreArchivo = nombreArchivo;
	}

	public void cargarCiudadesYPlatos(Ciudades ciudades) {
		File archivo = new File(nombreArchivo);
		try {
			Scanner lectorArchivo = new Scanner(archivo).useDelimiter("\n");
			while (lectorArchivo.hasNext()) {
				String linea = lectorArchivo.nextLine();
				String[] campos = linea.split(";");
				Plato platoEnArchivoCSV = new Plato(campos[INDICE_NOMBRE_PLATO],campos[INDICE_DESCRIPCION_PLATO]);
				if (ciudades.contieneCiudad(campos[INDICE_NOMBRE_CIUDAD])){
					Ciudad ciudad = ciudades.getCiudadPorNombre(campos[INDICE_NOMBRE_CIUDAD]);
					ciudad.addPlato(platoEnArchivoCSV);
				} else {
					Ciudad ciudadEnArchivoCSV = new Ciudad(campos[INDICE_NOMBRE_CIUDAD]);
					ciudadEnArchivoCSV.addPlato(platoEnArchivoCSV);
					ciudades.addCiudad(ciudadEnArchivoCSV);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
