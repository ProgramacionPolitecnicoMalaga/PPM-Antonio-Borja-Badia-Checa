import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ListaInvitados {
    File listaDeInvitados = new File("ListaInvitados.csv");
    BufferedReader objetoALeer=null;
    String SEPARADOR=";";
    String lineaActual;
    ArrayList<File> invitadosArrayList = new ArrayList<File>();

    public void LeerCsv(){
String [] campos;

        try {
            objetoALeer= new BufferedReader( new FileReader(listaDeInvitados.getAbsolutePath()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            lineaActual= (String.valueOf(new FileReader(listaDeInvitados)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true){
            try {
                if (!((lineaActual=objetoALeer.readLine()) !=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            campos=lineaActual.split(SEPARADOR);
            String fechNacimiento =(campos[3]);
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaFormateada= null;
            try {
                fechaFormateada = formatoFecha.parse(fechNacimiento);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Invitados invitados = new Invitados(campos[0], campos[1], campos[2], fechNacimiento);


            fechNacimiento= formatoFecha.format(fechaFormateada);


            System.out.println(invitados.toString());
            invitadosArrayList.add(listaDeInvitados);
            System.out.println(invitadosArrayList);


        }
}}
