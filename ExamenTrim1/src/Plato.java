public class Plato {
	private String nombre;
	private String descripción;

	public Plato(String nombre, String descripción){
		this.nombre = nombre;
		this.descripción = descripción;
	}

	public String getNombre(){
		return nombre;
	}

	public String getDescripción(){
		return descripción;
	}

	@Override
	public String toString() {
		return nombre + ": " + descripción + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		Plato otroPlato = (Plato) obj;
		return nombre.equals(otroPlato.getNombre());
	}
}
