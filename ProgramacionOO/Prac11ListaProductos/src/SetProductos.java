import java.util.*;

public class SetProductos implements MejoresProductos {
    ArrayList <Producto> listaProductos = new ArrayList<>();
    private final  int TAMANNO_OPCIONES=1;
Producto producto = new Producto();

    public SetProductos(Producto producto) {
        this.producto = producto;
    }

    @Override
    public SetProductos seleccionMejoresProductos(double indiceCalidad) {
        return null;
    }


    public void getTotalProductos(int tamannoListaProductos) {
        tamannoListaProductos=listaProductos.size();
    }

    public void addProducto(Producto nuevoProducto ){

        Scanner src = new Scanner(System.in);
        System.out.println("Introduce un nuevo producto\n"+
                "Nombre del producto: ");
        producto.nombreProducto=src.nextLine();
        System.out.println("Precio del producto: ");
        producto.precioProducto= Double.parseDouble(src.nextLine());
        System.out.println("Valoración del producto: ");
        producto.nombreProducto= String.valueOf(src.nextDouble());

        addProducto(listaProductos.add(nuevoProducto));
    }

}
