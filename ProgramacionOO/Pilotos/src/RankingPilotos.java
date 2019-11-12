import java.io.File;

public class RankingPilotos {

public File archivo;
public String rutaArchivo;

    public String getXmlRuta(String rutaArchivo) {

        archivo = new File("pilotos.csv");
        rutaArchivo = archivo.getAbsolutePath();

        return rutaArchivo;

    }


    public static void main(String[] args) {


    }


}
