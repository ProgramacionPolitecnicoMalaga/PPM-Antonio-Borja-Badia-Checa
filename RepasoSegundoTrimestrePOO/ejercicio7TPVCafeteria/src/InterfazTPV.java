import java.util.Scanner;

public class InterfazTPV {

    public InterfazTPV() {
    }

    public void crearFactura (Mesas mesaAfacturar){
        Mesas mesas = new Mesas();
        Scanner src= new Scanner(System.in);
        String codigoMesaAbierta;
        Mesa mesaAGestionar = new Mesa();
        int opcion;
        Productos addProducto = new Productos();
        String nomProducto = "";
        double precioProducto = 0;
        System.out.println("------¡Bien venido al menú!------");
        System.out.println("¿Qué opción desea realizar?\n"+
                "1-Listar todas las mesas\n"+
                "2-Listar mesas abiertas\n"+
                "3-Listar mesas cerradas\n"+
                "4-Gestionar Mesa abierta"+
                "9-Apagar TPV"
        );

        opcion= src.nextInt();

        switch (opcion){

            case 1:
                mesas.listarMesas();
                break;
            case 2:
                mesas.mostrarMesasAbiertas();
                break;
            case 3:
                mesas.mostrarMesasCerradas();
                break;
            case 4:
                System.out.println("Indique el código de una mesa abierta: ");
                codigoMesaAbierta=src.next();
                if (codigoMesaAbierta.equalsIgnoreCase(mesaAGestionar.getCodigoMesa())){
                    System.out.println("Indique un producto: ");
                    nomProducto=src.next();
                    System.out.println("Indique el precio del producto: ");
                    precioProducto=src.nextDouble();
                    addProducto.annadirProducto(nomProducto, precioProducto);

                }

            case 9:
                break;
        }

    }




}
