import java.util.ArrayList;
import java.util.Collection;

public class Paquete extends ArrayList implements Prestable  {
 static    String codigo, titulo, annoPublicacion, disponibilidad ;
   static boolean prestado=false;

    public Paquete(String codigo, String titulo, String annoPublicacion, String disponibilidad, boolean prestado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.annoPublicacion = annoPublicacion;
        this.disponibilidad=disponibilidad;
        this.prestado = prestado;
        ArrayList paquete = new ArrayList();

    }

    public Paquete (){}

    public String getDisponibilidad(ArrayList<Paquete> paquete2) {
        //return disponibilidad;
        if (prestado) return "No está disponible";
        else return "Está disponible";
    }

    public boolean setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
        System.out.println("this.disponibilidad = " + this.disponibilidad);
        return false;
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
    public void prestar() {
        if (prestado==false){
            prestado=true;
            setDisponibilidad("No está disponible");
        }

    }


@Override
    public  void devolver(Collection<Paquete> paquete) {
        System.out.println("DEVOLVER");
        paquete=(ArrayList)paquete;
    for (Paquete p: paquete)
    prestado=false;
    setDisponibilidad("Está disponible");
    }

    @Override
    public String estaPrestado() {

        return disponibilidad;
    }

    @Override
    public String toString() {
        return "{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", annoPublicacion='" + annoPublicacion + '\'' +
                ", disponibilidad='" + disponibilidad + '\'' +
                ", prestado=" + prestado +
                '}';
    }



}
