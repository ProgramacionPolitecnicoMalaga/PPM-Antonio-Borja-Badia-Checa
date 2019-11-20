import java.util.HashSet;
import java.util.*;

public class ProbandoHashSet {


    public static void main(String[] args) {


        HashSet<ClasePrueba> hashSet = new HashSet<>();

        hashSet.add(new ClasePrueba( 1, "c1"));
        hashSet.add(new ClasePrueba( 1, "c1"));
        hashSet.add(new ClasePrueba( 2, "c1"));
        hashSet.add(new ClasePrueba( 2, "c2"));
        hashSet.add(new ClasePrueba( 1, "c1"));
        System.out.println(hashSet);
hashSet.clear();
        hashSet.add(new ClasePrueba( 7, "c7"));
        hashSet.add(new ClasePrueba( 8, "c8"));
        hashSet.add(new ClasePrueba( 1, "c7"));
        hashSet.add(new ClasePrueba( 10, "c30"));



        Iterator <ClasePrueba> it = hashSet.iterator();

        while (it.hasNext()){

            
        }


    }


}
