import java.io.*;
import java.util.Arrays;


public class LeerCSV {
    BufferedReader bufferedReader=null;

    public void leerCSV()  {
         final String SEPARADOR=";";
        String lineaActual;

        try {
            bufferedReader = new BufferedReader(new FileReader("nuevo.csv"));
            bufferedReader.readLine();
            while ((lineaActual=bufferedReader.readLine()) !=null) {
String [] campos = lineaActual.split(SEPARADOR);
                System.out.println(Arrays.toString(campos));
                System.out.println(campos[1]);

            }


        } catch (FileNotFoundException e)  {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (null!=bufferedReader) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            }
        }

    }


