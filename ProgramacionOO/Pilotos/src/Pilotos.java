public class Pilotos {
    String nombre, escuderia, posicionDeSalida;

    boolean descalificado;


    public Pilotos(String nombre, String escuderia, String posicionDeSalida, boolean descalificado) {
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.posicionDeSalida = posicionDeSalida;
        this.descalificado = descalificado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public String getPosicionDeSalida() {
        return posicionDeSalida;
    }

    public boolean isDescalificado() {
        return descalificado;
    }

    public void setDescalificado(boolean descalificado) {
        this.descalificado = descalificado;
    }




}
