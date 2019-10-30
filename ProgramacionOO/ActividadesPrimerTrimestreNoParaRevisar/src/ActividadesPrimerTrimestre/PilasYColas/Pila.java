package ActividadesPrimerTrimestre.PilasYColas;

import java.util.Scanner;

public class Pila {

    static Scanner src = new Scanner(System.in).useDelimiter("\\n");
    private static final int MaxLong=1000;
    static int cabeza=0;
    static  int puntero=6;

    public static  void EnseñarArray(int [] Pila){
        for(int i=0;i<puntero ;i++){
            System.out.println(Pila[i]);


        }
    }




        public static void EnseñarLongitud(int [] Pila){
        int longi= puntero-cabeza;
        System.out.println("Su longitud actual "+longi);
    }
    public static int [] Insertar(int [] Pila){
        boolean parar=true;
        System.out.println("Introduce un número para añadirlo a la cola: \n");
        int num= src.nextInt();
        for(int i=cabeza;i<Pila.length;i++){
            if(Pila[i]==0 && parar ){
                Pila[i]=num;
                parar=false;
                puntero++;
            }
        }

        return Pila;
    }
    public static int [] Extraer(int [] Pila){
        System.out.println("Extraemos el primer número \n");
        Pila[cabeza]=0;
        cabeza++;

        return Pila;
    }
    public static void EnseñarCima(int [] Pila){
        System.out.println(Pila[puntero-cabeza]); // se puede usar longi ??
    }
    public static void main(String[] args) {



        int[] Pila=new int[MaxLong];
        Pila[0]=3; Pila[3]=3;
        Pila[1]=2; Pila[4]=2;
        Pila[2]=1; Pila[5]=1;

        EnseñarArray(Pila);
        EnseñarLongitud(Pila);
        Pila=Insertar(Pila);
        EnseñarArray(Pila);
        EnseñarLongitud(Pila);
        Pila=Extraer(Pila);
        EnseñarArray(Pila);
        EnseñarLongitud(Pila);
        EnseñarCima(Pila);

    }
}



