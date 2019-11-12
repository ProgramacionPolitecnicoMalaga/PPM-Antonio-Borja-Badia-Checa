import java.io.File;

public class RankingPilotos {

    public static File archivo;
public String rutaArchivo;

    public static  String getRutaArchivo(String rutaArchivo) {

        archivo = new File("pilotos.csv");
        rutaArchivo = archivo.getAbsolutePath();

        return rutaArchivo;

    }


    public static void main(String[] args) {
RankingPilotos rankingPilotos = new RankingPilotos();

        getRutaArchivo();
    }




}
