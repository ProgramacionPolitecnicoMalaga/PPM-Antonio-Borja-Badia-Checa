import java.util.Objects;

public class Categoria {

    private String nomCategoria;

    public Categoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nomCategoria='" + nomCategoria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        Categoria categoria=(Categoria) o;
        return categoria.getNomCategoria().equalsIgnoreCase(getNomCategoria());

    }


}




