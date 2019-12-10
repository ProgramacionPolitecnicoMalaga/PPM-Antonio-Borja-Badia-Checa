public class Estacion {

    public final static int ESTACION_TREN = 1;
    public final static int ESTACION_AUTOBUS = 2;
    public final static int ESTACION_FUNICULAR = 3;
    public final static int ESTACION_MARITIMA = 4;

    String nombre;
    String direccion;
    String telefono;
    Ubicacion ubicacion;
    int tipo;

    public Estacion(String nombre, String direccion, String telefono, Ubicacion ubicacion, int tipo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTipo(){
        return tipo;
    }

    @Override
    public String toString() {
        return "Estación{" +
                "nombre='" + nombre + '\'' +
                ", dirección='" + direccion + '\'' +
                ", teléfono='" + telefono + '\'' +
                ", ubicacion=" + ubicacion +
                ", tipo=" + tipo +
                '}';
    }
}
