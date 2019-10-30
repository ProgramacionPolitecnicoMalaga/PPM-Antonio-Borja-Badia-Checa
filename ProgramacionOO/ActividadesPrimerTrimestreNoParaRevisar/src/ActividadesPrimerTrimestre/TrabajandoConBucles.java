package ActividadesPrimerTrimestre;

import java.util.Scanner;

public class TrabajandoConBucles {


    public static void main(String[] args) {

        int opcion;
        boolean encontrado=false;
        Scanner lectorTeclado =  new Scanner(System.in);

        System.out.println("Qué número estás esperando?");
        opcion=lectorTeclado.nextInt();


        do {
            System.out.println("Indica un número: \n");
            if (lectorTeclado.nextInt() == opcion)
                encontrado=true;
        } while (!(opcion==3));




    }
}
