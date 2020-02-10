import java.util.Scanner;

public class InterfazTPV {
    Scanner src = new Scanner(System.in);


    public String crearFactura (Mesas mesas) {
        int opcion;
        String mensaje = "Error not found TPV";
        do {
        System.out.println("------¡Bien venido al menú!------\n");
        System.out.println("¿Qué opción desea realizar?\n" +
                "1-Listar todas las mesas\n" +
                "2-Listar mesas abiertas\n" +
                "3-Listar mesas cerradas\n" +
                "4-Gestionar Mesa abierta\n" +
                "9-Apagar TPV\n"
        );
        opcion = src.nextInt();
            switch (opcion) {
                case 1:
                    mesas.listarMesas(mesas);
                    break;
                case 2:
                    mesas.mostrarMesasAbiertas(mesas);
                    break;
                case 3:
                    mesas.mostrarMesasCerradas(mesas);
                    break;
                case 4:
                        menuGestionarMesa(mesas);
                    break;
                case 9:
                    System.out.println(mensaje = "Adiós");
                    break;
            }

        } while (opcion!=9);
            return mensaje;
        }

    public void menuGestionarMesa(Mesas mesas) {
int opcion;

String codMesa, nomProducto, annadirOtroProducto;
double precioProducto;

System.out.println("1-Realizar pedido");

        System.out.println("2-Pagar cuenta");

        opcion=src.nextInt();

        if(opcion==1){
           // realizarPedio();
            mesas.mostrarMesasAbiertas(mesas);
            System.out.println("Introduce el código de una mesa disponible: ");
            codMesa=src.next();
            Mesa mesa = mesas.elegirMesaAFacturar(codMesa);

            do {
                System.out.println("Indique un producto: ");
                nomProducto = src.next();
                System.out.println("Indique el precio del producto: ");
                precioProducto = src.nextDouble();
                System.out.println("¿Desea añadir otro producto?");
                annadirOtroProducto=src.next();
mesa.getListaProductos().annadirProducto(nomProducto,precioProducto);


            }while ( annadirOtroProducto.equalsIgnoreCase("SI"));



        }

        else {

            //pagarCuenta();
        }



    }


}




