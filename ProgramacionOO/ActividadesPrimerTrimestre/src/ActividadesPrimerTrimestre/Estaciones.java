package ActividadesPrimerTrimestre;

import java.util.Scanner;

public class Estaciones {

    public static void main(String[] args) {

        int meses [] = {1,2,3,4,5,6,7,8,9,10,11,12};

        Scanner lectorTeclado= new Scanner(System.in);


        int mes=0;
        System.out.println("Introduce un número de mes: \n");
        mes=lectorTeclado.nextInt();
       /* if (mes==12|| (mes==1)||(mes==2)){

            System.out.println("Es Invierno");
        }*/

        if (lectorTeclado.hasNextInt()) {
            mes = lectorTeclado.nextInt();
        } else {
            mes = 1;
            System.out.println("Esa opción no existe. El programa termina aquí");
            return;
        }

            switch (mes) {


                case 12:
                    System.out.println("Es Invierno");
                case 1:
                    System.out.println("Es Invierno");
                case 2:
                    System.out.println("Es Invierno");
                    break;
                case 3:

                    System.out.println("Es primavera");
                case 4:
                    System.out.println("Es primavera");

                case 5:
                    System.out.println("Es primavera");
                    break;

                case 6:
                    System.out.println("Es verano");
                case 7:
                    System.out.println("Es verano");

                case 8:
                    System.out.println("Es verano");
                    break;
                case 9:
                    System.out.println("Es Otoño");

                case 10:
                    System.out.println("Es Otoño");

                case 11:
                    System.out.println("Es Otoño");
            }


        }


    }


