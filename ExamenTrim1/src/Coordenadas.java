import java.util.ArrayList;

public class Coordenadas {
	private double latitud;
	private double longitud;
	private ArrayList<Establecimiento> establecimientos;

	public Coordenadas(double latitud, double longitud){
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public double calcularDistancia(Coordenadas otraUbicación){
		double distanciaMínima = Double.MAX_VALUE;
		double theta = otraUbicación.getLongitud() - longitud;
		double distanciaActual = Math.sin(Math.toRadians(otraUbicación.getLatitud())) * Math.sin(Math.toRadians(latitud)) + Math.cos(Math.toRadians(otraUbicación.getLatitud())) * 	Math.cos(Math.toRadians(latitud)) * Math.cos(Math.toRadians(theta));
		distanciaActual = Math.acos(distanciaActual);
		distanciaActual = Math.toDegrees(distanciaActual);
		return Math.abs(distanciaActual * 60 * 1.853159616);
	}

	public Establecimiento getEstablecimientoAMínimaDistancia(ArrayList<Establecimiento> establecimientos){
		double distanciaMínima = Double.MAX_VALUE;
		Establecimiento establecimientoMásCercano = null;
		for (Establecimiento establecimiento: establecimientos){
			double distanciaActual = calcularDistancia(establecimiento.getCoordenadas());
			if (distanciaActual < distanciaMínima){
				distanciaMínima = distanciaActual;
				establecimientoMásCercano = establecimiento;
			}
		}
		return establecimientoMásCercano;
	}
}
