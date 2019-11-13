import java.util.LinkedList;
import java.util.ListIterator;

public class ProbandoLinkedList {

    public static void main(String[] args) {

/*

add.
add.First
        add.Last
        get.Last
                get.First
                        remove.Last
                                remove.First
                                element - devuelve el primer elemento (NoSuchElementException)
                                peek - devuelve el primer elemto (null)
   peekFirst - (null) -> devuelve y no borra
peekLast - (null)
   pollFirst == poll  (null) -> devuelve y borra


                                */

        LinkedList<ElementoTest> lList = new LinkedList<>();


        lList.addFirst(new ElementoTest("1", 1));
        lList.addFirst(new ElementoTest("2", 2));
        lList.addFirst(new ElementoTest("3", 3));

        System.out.println(lList);

        lList.addLast(new ElementoTest("4", 4));
        lList.addLast(new ElementoTest("5", 5));
        lList.addLast(new ElementoTest("6", 6));
        System.out.println(lList);

        System.out.println(lList.getFirst());
        System.out.println(lList);

        System.out.println(lList.removeFirst());
        System.out.println(lList.removeLast());
        System.out.println(lList);

        for (int i=0; i<50;i++){

lList.removeFirst();
ListIterator<ElementoTest> it = (ListIterator<ElementoTest>) lList.iterator();



    }





    }

}
