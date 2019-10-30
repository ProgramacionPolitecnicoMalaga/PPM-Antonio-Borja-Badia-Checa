package ActividadesPrimerTrimestre;

import java.util.Scanner;

public class Actividad7 {

    public static void main(String[] args) {

        boolean coincideIsabel = false;
        boolean coincideVicente=false;

        Scanner lectorTeclado = new Scanner(System.in);

        int numVentas=0;

        int [] Isabel ={7,7,10,6,4};
        int [] Vicente = {4,7,5,4,5};

        double sumaIsabel = 0.0, mediaIsabel=0.0;
        double sumaVicente = 0.0, mediaVicente=0.0;

        int numeroMaximoIsabel =0;
        int numeroMaximoVicente =0;


        System.out.println("Introduce el número de items vendidos, para comprobar qué empleado lo ha realiazado: \n");
        numVentas=lectorTeclado.nextInt();

        for (int i=0; i<Isabel.length; i++) {

            sumaIsabel+=Isabel[i];

            if(numeroMaximoIsabel<Isabel[i]) {
            numeroMaximoIsabel=Isabel[i];

            }
            if (numVentas == Isabel[i])
            {
                coincideIsabel = true;
            }
        }

        for (int i=0; i<Vicente.length;i++) {

            sumaVicente+=Vicente[i];

          if (numeroMaximoVicente<Vicente[i]){

              numeroMaximoVicente=Vicente[i];
          }

            if (numVentas==Vicente[i]){

                coincideVicente=true;

            }

        }

        if (coincideIsabel == true){

            System.out.println("Isabel");
        } else if (coincideVicente==true){

            System.out.println("Vicente");
        }
        else  {

            System.out.println("No hay coincidencias.");


        }
        mediaIsabel=sumaIsabel/Isabel.length;
        System.out.println("La media de ventas de Isabel es: " +mediaIsabel+"\n");

        mediaVicente=sumaVicente/Vicente.length;
        System.out.println("La media de ventas de Vicente es: "+mediaVicente+"\n");



    if (numeroMaximoIsabel>numeroMaximoVicente){

        System.out.println("Isabel es la vendedora de la semana con " +numeroMaximoIsabel+" items en un día");


    } else {
        System.out.println("Vicente es el vendedor de la semana con "+numeroMaximoVicente+" items en un día.");
    }

    }



    }

