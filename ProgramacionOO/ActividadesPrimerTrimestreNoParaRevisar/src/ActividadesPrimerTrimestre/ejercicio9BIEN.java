package ActividadesPrimerTrimestre;

import java.util.Scanner;

public class ejercicio9BIEN {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        int n;
        int multiplicacion = 1;


        System.out.println("introduce el valor de n para calcular su factorial y la serie que le precede");
        n = s.nextInt();

        for(int i = 0; i < n ; i++){
            System.out.print("---------");
        }
        System.out.println();
        System.out.print("           I    ");
        for(int i = 1;i <= n;i++){
            System.out.print(" "+ i );



        }
        System.out.print("  ...... N");
        System.out.println();


        for(int i = 0; i < n ; i++){
            System.out.print("---------");
        }
        System.out.println();
        System.out.print("FACTORIAL (I)");
        System.out.print("   ");
        for(int i = 1;i <= n ;i++){

            multiplicacion =i;
            System.out.print(" "+ multiplicacion );
        }
        System.out.print(" ...... N");
        System.out.println();

        for(int i = 0; i < n ; i++){
            System.out.print("---------");
        }


    }
}




