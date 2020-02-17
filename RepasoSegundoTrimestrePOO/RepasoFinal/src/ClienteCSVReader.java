import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClienteCSVReader {

private String archivoALeer;

    public ClienteCSVReader() {
        archivoALeer = "clientes.csv";
    }

    public ArrayList<Persona> getClientes(){

        ArrayList<Persona> personasArrayList = new ArrayList<>();
        try {
            File file = new File(archivoALeer);
            Scanner src = new Scanner (file);

            String lineaClientes= src.nextLine();
            String [] arrayClientes = lineaClientes.split(";");
            for (int i=0;i<arrayClientes.length;i++ )
                personasArrayList.add(new Persona(arrayClientes[i]));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    return personasArrayList;
    }

}