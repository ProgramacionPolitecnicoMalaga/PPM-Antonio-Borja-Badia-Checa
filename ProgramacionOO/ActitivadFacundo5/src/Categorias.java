public class Categorias {

    private String nombreCateg;

    public Categorias(String nombreCateg) {
        this.nombreCateg = nombreCateg;
    }

    public String getNombreCateg() {
        return nombreCateg;
    }

    public void setNombreCateg(String nombreCateg) {
        this.nombreCateg = nombreCateg;
    }

    @Override
    public String toString() {
        return "Categorias{" +
                "nombreCateg='" + nombreCateg + '\'' +
                '}';
    }
}

