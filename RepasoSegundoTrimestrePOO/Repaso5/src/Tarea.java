import java.time.LocalDate;

public class Tarea {
    private String nomTarea;
    private Categoria categoria;
    private LocalDate fechaLimite;
    private  boolean terminado;

    public Tarea(String nomTarea, Categoria categoria, LocalDate fechaLimite, boolean terminado) {
        this.nomTarea = nomTarea;
        this.categoria = categoria;
        this.fechaLimite = fechaLimite;
        this.terminado = terminado;
    }

    public String getnomTarea() {
        return nomTarea;
    }

    public void setnomTarea(String nomTarea) {
        this.nomTarea = nomTarea;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "Nombre de la tarea='" + nomTarea + '\'' +
                ", Categoria=" + categoria +
                ", Fecha Límite=" + fechaLimite +
                ", terminado=" + terminado +
                '}';
    }
}
