import java.util.Objects;

public class ClasePrueba {
    int num;
    String cadena;

    public ClasePrueba(int num, String cadena) {
        this.num = num;
        this.cadena = cadena;
    }


    @Override
    public String toString() {
        return "ClasePrueba{" +
                "num=" + num +
                ", cadena='" + cadena + '\'' +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        return cadena.equalsIgnoreCase(((ClasePrueba)o).getCadena());


    }

    @Override
    public int hashCode() {
        return cadena.hashCode();
    }

    public String getCadena() {
        return cadena;
    }

    public int getNum() {
        return num;
    }
}
