package ActividadesPrimerTrimestre;

import java.util.Scanner;

public class Actividdad6 {
    public static void main(String[] args) {
        boolean coincideIsabel = false;
        boolean coincideVicente=false;

        Scanner lectorTeclado = new Scanner(System.in);

        int numVentas=0;

        int [] Isabel ={7,7,10,6,4};
        int [] Vicente = {4,7,5,4,5};


        System.out.println("Introduce el número de items vendidos, para comprobar qué empleado lo ha realiazado: \n");
        numVentas=lectorTeclado.nextInt();

      for (int i=0; i<Isabel.length; i++) {

          if (numVentas == Isabel[i])
            {
                coincideIsabel = true;
            }
        }

        for (int i=0; i<Vicente.length;i++) {

            if (numVentas==Vicente[i]){

             coincideVicente=true;

            }

        }

      if ((coincideIsabel==true) && (coincideVicente==true)) {

            System.out.println("Isabel, Vicente");

       }
          if
            (coincideIsabel == true){

                System.out.println("Isabel");
        } else if (coincideVicente==true){

            System.out.println("Vicente");
        }
        else  {

        System.out.println("No hay coincidencias.");


        }}}

