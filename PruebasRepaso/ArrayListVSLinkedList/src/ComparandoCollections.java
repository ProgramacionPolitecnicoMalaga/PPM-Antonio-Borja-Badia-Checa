import java.util.LinkedList;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;
public  class ComparandoCollections {


private static     ArrayList<Double> arrayList = new ArrayList<>();
    private static LinkedList<Double> linkedList = new LinkedList<>();

    public static void insertarMilNumerosAleatorios(List <Double> list){

        for (int i=0; i<10000; i++){

            double numAleatorio= (ThreadLocalRandom.current().nextDouble(0, 50));
            list.add(numAleatorio);
        }


    }

    public static void main(String[] args) {

    for (int i=0; i<10000; i++){

       double numAleatorio= (ThreadLocalRandom.current().nextDouble(0, 50));
        arrayList.add(numAleatorio);
        linkedList.add(numAleatorio);
    }

    linkedList.add(70.0);
    arrayList.add(70.0);

        System.out.println(arrayList);
        System.out.println(linkedList);

    }

}
