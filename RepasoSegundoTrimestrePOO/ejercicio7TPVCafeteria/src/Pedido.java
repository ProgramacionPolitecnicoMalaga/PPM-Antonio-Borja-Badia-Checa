import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    Mesa mesa;
    Mesas mesas;
    Productos productos;
    Scanner src = new Scanner(System.in);
    String annadirOtroProducto;

    public void Comanda (String codMesa, String producto, double precioProducto){

        mesas.mostrarMesasAbiertas(mesas);
        System.out.println("Indique el código de una mesa abierta: ");
        codMesa = src.next();
       mesa= mesas.elegirMesaAFacturar(codMesa);
        if (codMesa.equalsIgnoreCase(mesa.getCodigoMesa())) {
            do {
                System.out.println("Indique un producto: ");
                producto = src.next();
                System.out.println("Indique el precio del producto: ");
                precioProducto = src.nextDouble();
                System.out.println("¿Desea añadir otro producto?");
                annadirOtroProducto=src.next();

        }while ( annadirOtroProducto.equalsIgnoreCase("SI"));
        }

        System.out.println(codMesa+producto+precioProducto);
}








}
