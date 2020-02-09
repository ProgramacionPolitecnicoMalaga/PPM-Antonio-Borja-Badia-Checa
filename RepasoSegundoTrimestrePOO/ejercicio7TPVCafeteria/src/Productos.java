import java.util.ArrayList;
import java.util.Iterator;

public class Productos {

    private ArrayList<Producto> productoArrayList = new ArrayList<>();

    public void  annadirProducto(String nombreProducto, double precioProducto){

        productoArrayList.add(new Producto(nombreProducto, precioProducto));
        System.out.println("Producto añadido");
    }

    public void listarProductos(){

        Producto producto;
        Iterator it=productoArrayList.iterator();
        while (it.hasNext()){
            producto=(Producto)it.next();
            System.out.println(producto);
        }
    }


}
