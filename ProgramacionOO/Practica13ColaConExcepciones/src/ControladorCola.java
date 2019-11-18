public class ControladorCola {

    private static  final int TAM_COLA=10;
    public static void main(String[] args) {

        try {


            Cola cola = new Cola(TAM_COLA);


            cola.meterElementoEnCola(6);
            cola.meterElementoEnCola(10);
            cola.meterElementoEnCola(12);
            cola.meterElementoEnCola(89);
            cola.meterElementoEnCola(98);
            System.out.println(cola);
            cola.meterElementoEnCola(16);
            cola.meterElementoEnCola(34);
            cola.meterElementoEnCola(43);
            cola.meterElementoEnCola(9);
            cola.meterElementoEnCola(10);
            System.out.println(cola);
            cola.sacarElemento();
            cola.sacarElemento();
            cola.sacarElemento();
            cola.sacarElemento();
            cola.sacarElemento();
            System.out.println(cola);
            cola.sacarElemento();
            cola.sacarElemento();
            cola.sacarElemento();
            cola.sacarElemento();
            cola.sacarElemento();
            System.out.println(cola);
        }
        catch (SacarElementoDeColaVaciaException e){
            System.out.println(e.advertenciaException());

        }

    }

}
