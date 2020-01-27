
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
import java.util.ArrayList;


public class Tareas {

    Categorias categoria;
    private boolean Pendiente;
    Fechas fecha;

    public Tareas(Categorias categoria, boolean pendiente, Fechas fecha) {
        this.categoria = categoria;
        Pendiente = pendiente;
        this.fecha = fecha; }

    public boolean isPendiente() {
        return Pendiente;
    }

    public void setPendiente(boolean pendiente) {
        Pendiente = pendiente;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Fechas getFecha() {
        return fecha;
    }

    public void setFecha(Fechas fecha) {
        this.fecha = fecha;
    }




    @Override
    public String toString() {
        return "Tareas{" +
                "Categoria='" + categoria + '\'' +
                ", Pendiente=" + Pendiente +
                ", fechaFormateada='" + fecha + '\'' +
                '}';
    }
}
