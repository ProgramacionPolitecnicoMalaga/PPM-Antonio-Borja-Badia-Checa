import java.util.ArrayList;

public class MiMain {

    public static void main(String[] args) {
//Leer csv
        ClienteCSVReader clienteCSVReader = new ClienteCSVReader();
        //Usamos el metodo e imprimimos el array con los resultados
        ArrayList<Persona> personaArrayList = clienteCSVReader.getClientes();
        System.out.println(personaArrayList);
//Leer xml
        VehiculosXMLReader xmlReader = new VehiculosXMLReader();
        ParqueVehiculos vehiculos = new ParqueVehiculos(xmlReader.getStockVehiculos());
        System.out.println(vehiculos.getStockVehiculos());

//Creando ventas

        Concesionario concesionario= new Concesionario(vehiculos,new Ventas(),personaArrayList);
        concesionario.crearVenta(concesionario.getCompradorByNombre("Antonia González Vicario"), concesionario.getVehiculoByMarcaYModelo("Alfa-Romeo", "Giulietta 1.4TB Sport 120CV"),2);
        concesionario.crearVenta(concesionario.getCompradorByNombre("Juan Pérez García"), concesionario.getVehiculoByMarcaYModelo("Citroen", "C3 Puretech 82CV"),1);

        System.out.println(concesionario.getVentas());

        //Stock actualizado

      System.out.println(concesionario.getParqueVehiculos().getStockVehiculos());



    }
}
