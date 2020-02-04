import java.util.ArrayList;
import java.util.Iterator;

public class Vehiculos {

    ArrayList<Vehiculo> vehiculoArrayList = new ArrayList<>();


    public ArrayList<Vehiculo> getVehiculoArrayList() {
        return vehiculoArrayList;
    }

    public Vehiculo annadirVehiculo(Vehiculo nuevoVehiculo) {

        Vehiculo nombreVehiculo;
        System.out.println("El vehículo se ha añadido\n");

        vehiculoArrayList.add(nuevoVehiculo);
nombreVehiculo=nuevoVehiculo;
        return nombreVehiculo;
    }



    public void listarVehiculoPorNumeroBastidor(){
        for (Vehiculo v: vehiculoArrayList  ) {
            System.out.println(v.getNumBastidor());
        }
    }

public void listarVehiculosInformacionCompleta(){
        Vehiculo vehiculo;
        Iterator it= vehiculoArrayList.iterator();
        while (it.hasNext()){
            vehiculo= (Vehiculo)it.next();
            System.out.println(vehiculo);
        }
}


}
