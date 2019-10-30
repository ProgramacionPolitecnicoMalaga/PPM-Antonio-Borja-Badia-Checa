package ActividadesPrimerTrimestre.Tema2ElLibro;

public class Libro  {
    
       String Titulo, Autor, Editorial, ISBN;
    int NumeroEdicion;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        this.Editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroEdicion() {
        return NumeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.NumeroEdicion = numeroEdicion;
    }

    public Libro(String titulo, String autor) {
        Titulo = titulo;
        Autor = autor;
    }

    public Libro(String titulo, String autor, String editorial, String ISBN, int numeroEdicion) {
        Titulo = titulo;
        Autor = autor;
        Editorial = editorial;
        this.ISBN = ISBN;
        NumeroEdicion = numeroEdicion;
    }
}
