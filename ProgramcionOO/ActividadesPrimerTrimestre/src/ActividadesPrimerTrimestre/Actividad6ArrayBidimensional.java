package ActividadesPrimerTrimestre;

import java.util.Scanner;

public class Actividad6ArrayBidimensional {


    public static void main(String[] args) {

        Scanner src= new Scanner(System.in);


        int [][] ventarPorEmpleado = {

                {7, 7, 10, 6, 4},
                {4,7,5,4,5}
        };

String [] vendedores = {"Isabel","Vicente"};

int ventasDeInteres= -1;
boolean [] empleadosDeInteres={false,false};
boolean existenEmpleadosDeInteres=false;
        System.out.println("Qué número de ventas interesa: ");
        ventasDeInteres=src.nextInt();


        for (int numeroEmpleado=0;numeroEmpleado<vendedores.length;numeroEmpleado++){

            for (int venta=0; venta<ventarPorEmpleado[numeroEmpleado].length;venta++){

                if (ventasDeInteres==ventarPorEmpleado[numeroEmpleado][venta]){
                    empleadosDeInteres[numeroEmpleado]=true;
                    existenEmpleadosDeInteres=true;
                }
            }

        }

        if (existenEmpleadosDeInteres)
            System.out.println("Los vendedores que han vendido " +ventasDeInteres+" son:");
 else
        System.out.println("Lo siento. Nadie ha vendido esa cantidad.");



       // for (){


        }
    }

