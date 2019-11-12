import java.util.ArrayList;

public class ListIterator<I extends Number> {


    public  ListIterator (){

        ArrayList<Integer> miArray = new ArrayList<>();
ListIterator<Integer> listr = null;
miArray.add(0);
miArray.add(1);
miArray.add(2);
miArray.add(3);
miArray.add(4);
listr= (ListIterator<Integer>) miArray.listIterator();
        System.out.println("Elementos  en orden direccioanal: ");
        while (listr.hasNext()){

            System.out.println(listr.next());
        }
while (listr.hasPrevius()){

    System.out.println(listr.previus());

}

    }

    public static void main(String[] args) {



    }


}
