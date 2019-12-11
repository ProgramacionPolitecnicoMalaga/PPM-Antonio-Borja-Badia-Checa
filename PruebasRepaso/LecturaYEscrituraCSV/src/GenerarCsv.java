import java.io.*;

public class GenerarCsv {

BufferedWriter bufferedWriter;
    public void escribirCSV()  {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("nuevo.csv"));
            bufferedWriter.write("Hola esto es un nuevo csv; Hola; Adiós;");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
