public class App {

    public static void main(String[] args) {


        int numero=0;


    sumar1(numero);
        System.out.println(numero);

        Integer numero2=0;
        sumar1_2(numero2);
        System.out.println(numero2);


    }


    public static void sumar1(int numero){
        numero++;

        System.out.println("sumar1: numero=0 "+numero);

    }

    public static void sumar1_2(Integer numero){

         numero++;

         System.out.println("Sumar1_2: numero= "+numero);
    }
}
