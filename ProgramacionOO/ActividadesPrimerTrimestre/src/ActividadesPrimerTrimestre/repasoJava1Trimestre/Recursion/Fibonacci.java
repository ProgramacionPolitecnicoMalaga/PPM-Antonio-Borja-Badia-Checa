package ActividadesPrimerTrimestre.repasoJava1Trimestre.Recursion;

import java.util.Scanner;

public class Fibonacci {

   static int numFibonacci;

   static Scanner src = new Scanner(System.in);

    public static int Fib(int n){
        if (n==1) return 0;
       else  if (n==2) return 1;
        else return Fib(n-1)+ Fib(n-2);

    }

    public static void main(String[] args) {

        System.out.println("Introduce un entero para calcular Fibonacci:  " +(Fib(numFibonacci)));
        numFibonacci= src.nextInt();
        //System.out.println(Fib(10));
    }
}
