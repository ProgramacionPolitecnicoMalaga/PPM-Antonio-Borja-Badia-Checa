package ActividadesPrimerTrimestre;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {


        Scanner src= new Scanner(System.in);

int numero=0, multiplicacion=1, limiteFactorial=1;

        System.out.println("Introduce un número entero para calcula su factorial: \n");
      numero=src.nextInt();



        while (limiteFactorial<=numero) {

          multiplicacion=multiplicacion*limiteFactorial;

          limiteFactorial++;

          System.out.print(" "+limiteFactorial);


      } for (int i=0; i<=multiplicacion;i++) {
            System.out.print(" "+multiplicacion);


        }



    }
}
