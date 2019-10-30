package ActividadesPrimerTrimestre.PilasYColas;

import java.util.Scanner;

public class Cola {

    static Scanner src = new Scanner(System.in);

    private static final int LONGITUD_MAXIMA=1000;

    static int head=0;
    static int tail=6;
    static int num;
    
    public static void EnsennarArray (int [] Cola){
        for (int i=0;i<tail;i++){

            System.out.println(Cola[i]);
        }
        
    }
    
    public static void EnsennarLongitud (int [] Cola){
        
        int longitud=tail-head;
        System.out.println("La longitud del array, en principio es: "+longitud);
        
    }
    
    public static int [] Insertar (int[] Cola){
        
        boolean stop=true;
        System.out.println("Introduce un número para añadirlo a la cola: \n");
        int num = src.nextInt();
        for (int i=head; i<Cola.length;i++){
            
            if(Cola[i]==0 && stop){
                
                Cola[i]=num;
                stop=false;
                tail++;
            }
        }
    
    return Cola;
    }
    
    public static int [] Extraer (int [] Cola){

        System.out.println("Extraemos el último número \n");
        Cola[head]=0;
        tail--;
        
        return Cola;
    }
    
    public static void EnsennarCima (int [] Cola){
        System.out.println(Cola[tail-head]);
        
    }

    public  boolean estaLLena(){

       // return (tail +1)% Cola.==head;

  return false;
    }

    public boolean estaVacia(){

        return (tail == -1);
    }



    public static void main(String[] args) {

   int[] Cola= new int[LONGITUD_MAXIMA];
        Cola[0]=3; Cola[3]=3;
        Cola[1]=2; Cola[4]=2;
        Cola[2]=1; Cola[5]=1;
   
   EnsennarArray(Cola);
   EnsennarLongitud(Cola);
   EnsennarCima(Cola);
   Cola=Insertar(Cola);
   EnsennarArray(Cola);
   EnsennarLongitud(Cola);
   Cola=Extraer(Cola);
   EnsennarArray(Cola);
   EnsennarLongitud(Cola);
   EnsennarCima(Cola);
   
    }
}
