import java.util.ArrayList;

public class Ventas {

    private ArrayList<Venta> ventaArrayList;

    public Ventas(){

        ventaArrayList= new ArrayList<>();
    }

    public ArrayList<Venta> getVentaArrayList() {
        return ventaArrayList;
    }

    public void addVenta(Venta venta){

        ventaArrayList.add(venta);
    }

    public ArrayList<Venta> getventaByComprador(String nombre){
        ArrayList<Venta> ventasPorComprador = new ArrayList<>();
        for (Venta v: ventaArrayList){
            if (v.getComprador().getNombre().equalsIgnoreCase(nombre))
                ventasPorComprador.add(v);
        }
    return ventasPorComprador;
    }



    public int getNumeroVentas(){

        return ventaArrayList.size();
    }



    public Venta getVenta (int i){
        return ventaArrayList.get(i);

}

    @Override
    public String toString() {
        return "Ventas{" +
                "Lista de ventas=" + ventaArrayList +
                '}'+"\n";
    }


}
