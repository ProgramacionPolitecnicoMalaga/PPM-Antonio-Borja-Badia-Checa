public class Suma {
    private int sumaTotal=0;

    private AvisadorCambioSuma avisador;
    public void sumar(int numero){
        sumaTotal+=numero;
        avisador.avisar()

    }


    public int getSumaTotal(){
        return sumaTotal;
    }

    public void setAvisador(AvisadorCambioSuma avisador) {
        this.avisador = avisador;
    }


}
