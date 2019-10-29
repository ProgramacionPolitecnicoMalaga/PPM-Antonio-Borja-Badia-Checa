import java.util.Scanner;

public class ConsumidorCola {

    private static Cola cola;
    private static final int TAM_COLA = 5;

    public static void main(String[] args)  {
        cola = new Cola(TAM_COLA);

        try {
            cola.meter(10);
            cola.meter(30);
            cola.meter(60);
            cola.meter(12);
            System.out.println("[P1]::" + cola);
            System.out.println("Intentando meter un nuevo elemento (66)");
            cola.meter(66);
            System.out.println("Intentando meter un nuevo elemento (98)");
            cola.meter(98);
            //-------------- A partir de aquí no se ejecutan más instrucciones -----------
            System.out.println("Intentando meter un nuevo elemento (74)");
            cola.meter(74);
            System.out.println("Intentando meter un nuevo elemento (37)");
            cola.meter(37);
            System.out.println("Intentando meter un nuevo elemento (9)");
            cola.meter(9);
            System.out.println("[P2]::" + cola);
            // -------------- Las instrucciones anteriores no se ejecutan ---------------
        } catch (ControlExcepciones controlExcepciones) {
            controlExcepciones.printStackTrace();
        }
        System.out.println("[P3]::" + cola);
    }
}