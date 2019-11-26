import java.util.*;
public class ProbandoTreeMap {

    public int compare (String s, String t1){
        return s.compareTo(t1);
    }


    public static void main(String[] args) {
        TreeMap<String,Tarea> treeMap = new TreeMap<>();



        treeMap.put("S", new Tarea(1, "S"));
        treeMap.put("A", new Tarea(2, "A"));
        treeMap.put("Z", new Tarea(3, "Z"));

        System.out.println(treeMap);

        Iterator<String> iterator = treeMap.keySet().iterator();
  while (iterator.hasNext())
      System.out.println(treeMap.get(iterator.next()));
    }
}
