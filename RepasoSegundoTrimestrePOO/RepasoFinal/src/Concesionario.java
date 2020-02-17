import java.util.ArrayList;

public class Concesionario {
    private ParqueVehiculos parqueVehiculos;
    private Ventas ventas;
    private ArrayList<Persona> compradores;

    public Concesionario(ParqueVehiculos parqueVehiculos, Ventas ventas, ArrayList<Persona> compradores) {
        this.parqueVehiculos = parqueVehiculos;
        this.ventas = ventas;
        this.compradores = compradores;
    }

public Persona getCompradorByNombre(String nombre){
        for (Persona comprador: compradores){
            if (comprador.getNombre().equalsIgnoreCase(nombre))
                return comprador;
        }

        return null;
}

public Vehiculo getVehiculoByMarcaYModelo(String marca, String modelo){

        return parqueVehiculos.getStockVehiculoByMarcayModelo(marca,modelo).getVehiculo();


}
public ArrayList<Venta> getVentas(){

        return ventas.getVentaArrayList();


}

public ParqueVehiculos getParqueVehiculos(){

        return parqueVehiculos;
}


public void crearVenta(Persona comprador, Vehiculo vehiculo, int unidades){

        StockVehiculo stockVehiculo=parqueVehiculos.getStockVehiculoByMarcayModelo(vehiculo.getMarca(),vehiculo.getModelo());
        if (stockVehiculo.getUnidades()>unidades){
            Venta venta = new Venta(comprador, vehiculo, unidades);
            ventas.addVenta(venta);
        actualizarStock(stockVehiculo,venta);
        }
}
public void actualizarStock(StockVehiculo stockVehiculo, Venta venta){

       parqueVehiculos.actualizarUnidades(venta);
}

}
