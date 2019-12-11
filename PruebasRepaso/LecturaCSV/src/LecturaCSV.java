import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.util.Arrays;
import java.util.Arrays;

public class LecturaCSV {

    static File archivoCSV = new File("nuevo.csv");
    BufferedReader  lector=null;
    public final String SEPARADOR=";";
    String lineaActual;

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
    }


}




    }

