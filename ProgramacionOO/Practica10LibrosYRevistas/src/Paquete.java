import java.util.ArrayList;
import java.util.function.IntFunction;

public class Paquete extends ArrayList implements Prestable  {
    String codigo, titulo, annoPublicacion, disponibilidad ;
    boolean prestado=false;

    public Paquete(String codigo, String titulo, String annoPublicacion, String disponibilidad, boolean prestado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.annoPublicacion = annoPublicacion;
        this.disponibilidad=disponibilidad;
        this.prestado = prestado;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnnoPublicacion() {
        return annoPublicacion;
    }

    public void setAnnoPublicacion(String annoPublicacion) {
        this.annoPublicacion = annoPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }


    @Override
    public String toString() {
        return "Paquete{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", annoPublicacion='" + annoPublicacion + '\'' +
                ", disponibilidad='" + disponibilidad + '\'' +
                ", prestado=" + prestado +
                '}';
    }

    @Override
    public void prestar() {
if (prestado==false){
    prestado=true;
    disponibilidad="No está disponible";
}

    }

    @Override
    public void devolver() {

        prestado=false;

        disponibilidad="Está disponible";
    }

    @Override
    public String estaPrestado() {

return disponibilidad;
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return new Object[0];
    }
}
