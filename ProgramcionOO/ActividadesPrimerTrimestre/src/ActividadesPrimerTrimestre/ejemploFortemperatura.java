package ActividadesPrimerTrimestre;

public class ejemploFortemperatura {

    public static void main(String[] args) {


int maximaTemperatura=0, hora=0;


        int [] temperaturasDia= {21,35,18,22,12,8,28,9,17,38};


        for (int i=0; i<temperaturasDia.length; i++){

            System.out.println("Temperatura de la hora " +i +":00=> "+temperaturasDia[i]);
            if (maximaTemperatura<temperaturasDia[i]){
                maximaTemperatura=temperaturasDia[i];
                hora=i;
            }


        }
        System.out.println("La mayor temperartura alcanzada fue: \n"+maximaTemperatura+"ºC a la hora "+hora+":00");
    }
}
