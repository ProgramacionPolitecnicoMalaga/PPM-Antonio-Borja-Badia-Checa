import java.util.ArrayList;

public class MiMain {

    public static void main(String[] args) {
//Leer csv
        ClienteCSVReader clienteCSVReader = new ClienteCSVReader();
        //Usamos el metodo e imprimimos el array con los resultados
        ArrayList<Persona> personaArrayList = clienteCSVReader.getClientes();
        System.out.println(personaArrayList);
//Leer xml
        VehiculosXMLReader vehiculosXMLReader = new VehiculosXMLReader();


    }
}
