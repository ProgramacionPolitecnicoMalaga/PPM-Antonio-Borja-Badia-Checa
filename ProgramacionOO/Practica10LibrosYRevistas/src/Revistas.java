public class Revistas extends Paquete {

int numEjemplar;


    public Revistas(String codigo, String titulo, String annoPublicacion, String disponibilidad, int numEjemplar, boolean prestado) {
        super(codigo, titulo, annoPublicacion, disponibilidad, prestado);
        this.numEjemplar=numEjemplar;

    }

    @Override
    public boolean isPrestado() {
        if (prestado){
            return setDisponibilidad("No diponible.");
        }
         return setDisponibilidad("Está disponible.");
    }

    @Override
    public String toString() {
        return super.toString()+"[numEjemplar= " + numEjemplar +
                ']'+"\n"+"\n";
    }
}
