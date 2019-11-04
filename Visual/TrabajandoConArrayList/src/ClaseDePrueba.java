import java.util.Objects;

public class ClaseDePrueba {

    private int valor;
    private String cadena;




    public ClaseDePrueba (int valor, String cadena){

        this.cadena=cadena;
        this.valor=valor;

    }

    public int getValor() {
        return valor;
    }



    public String getCadena() {
        return cadena;
    }

    @Override
    public String toString() {
        return "ClaseDePrueba{" +
                "valor=" + valor +
                ", cadena='" + cadena + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return ((ClaseDePrueba) o) .getCadena().equalsIgnoreCase(cadena);
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
}
