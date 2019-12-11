public class Categoria {

  String nomCategoria;
  double sueldo;

    public Categoria(String nomCategoria, double sueldo) {
        this.nomCategoria = nomCategoria;
        this.sueldo = sueldo;
    }


    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nomCategoria='" + nomCategoria + '\'' +
                '}';
    }
}
