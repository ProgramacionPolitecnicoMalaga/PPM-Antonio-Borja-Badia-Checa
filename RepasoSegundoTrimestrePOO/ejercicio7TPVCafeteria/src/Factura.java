import java.util.TreeMap;

public class Factura {

    Mesa mesa;
    Mesas mesas;
    Producto producto;
    Productos productos;

    public TreeMap facturaMesa (Mesas mesaAFacturar, Productos productosAFacturar){

        this.mesas=mesaAFacturar;
        this.productos=productosAFacturar;

        TreeMap<Mesas, Productos> facturaTreemap = new TreeMap<>();
facturaTreemap.put(mesaAFacturar=new Mesas(), productosAFacturar=new Productos());
return facturaTreemap;
    }
}
