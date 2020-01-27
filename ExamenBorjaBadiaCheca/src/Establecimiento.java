import java.util.ArrayList;

public class Establecimiento {
    String nombre, ciudad;
    Ubicacion ubicacion;
    ArrayList<Plato> platosArrayList;

    public Establecimiento(String nombre) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.ubicacion = ubicacion;
        this.platosArrayList = platosArrayList;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Plato> getPlatosArrayList() {
        return platosArrayList;
    }

    public void setPlatosArrayList(ArrayList<Plato> platosArrayList) {
        this.platosArrayList = platosArrayList;
    }

    @Override
    public boolean equals(Object obj) {
        Establecimiento otroEstablecimiento=(Establecimiento) obj;
        return nombre.equalsIgnoreCase(otroEstablecimiento.getNombre());

    }

    @Override
    public String toString() {
        return "Establecimiento{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", ubicacion=" + ubicacion +
                '}';
    }



}
