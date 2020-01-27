import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;

public class GestorCSV {

    static File archivoCSV = new File("platos.csv");
    BufferedReader  lector=null;
    public final String SEPARADOR=";";
    String lineaActual;
//HashMap<String,Plato> platos = new HashMap<>();


    public void lectorCSV(){
        String [] campos;

        try {
            lector= new BufferedReader(new FileReader(archivoCSV.getAbsolutePath()));
            while ((lineaActual=lector.readLine())!=null){
                campos=lineaActual.split(SEPARADOR);

                for (int i=0;i<campos.length;i++){

                    System.out.println(campos[i]);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                lector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
