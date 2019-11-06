import java.util.ArrayList;
import java.util.Iterator;

public class TrabajandoConArrayList {

    public static void hacerAlgo(ClaseDePrueba elemento){

        if (elemento.getCadena().equalsIgnoreCase("e1"))
            elemento.setCadena("-"+elemento.getCadena()+"+");

    }
public  static boolean predicado(ClaseDePrueba elemento){


        return elemento.getValor()<100;
}


    public static void main(String[] args) {


ArrayList <ClaseDePrueba> arrayList= new ArrayList<>();
ClaseDePrueba elementoBorrado = new ClaseDePrueba(100,"e1");
arrayList.add(new  ClaseDePrueba(1,"e1" ));
arrayList.add(new ClaseDePrueba(2, "e2"));
arrayList.add(new ClaseDePrueba(3, "e3"));
arrayList.add(new ClaseDePrueba(4, "e4"));
arrayList.add(1, new ClaseDePrueba(100, "valorAñadido")); //añade elemento en el index indicado respetando y desplazando el contenido
arrayList.set(2, new ClaseDePrueba(2, "pisa el de su posición"));// con set machaca el elemento  en el index indicado
arrayList.remove(new ClaseDePrueba(7,"e1"));//

       /* while (arrayList.contains(new ClaseDePrueba(3,"e1"))){//.contains en el while, mientras cadena cumpla con lo descrito lo borrará uno o más
            arrayList.remove(elementoBorrado);
        }*/

        Iterator<ClaseDePrueba> it=arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        System.out.println(arrayList.get(3));


        System.out.println(arrayList);

        ArrayList <ClaseDePrueba> arrayList2 = new ArrayList<>();
        arrayList2.add(new ClaseDePrueba( 200, "e200"));
        arrayList2.add(new ClaseDePrueba( 201, "e201"));
        arrayList2.add(new ClaseDePrueba( 202, "e202"));
        arrayList2.add(new ClaseDePrueba( 203, "e203"));

arrayList2.addAll(arrayList);//añade  arrayList2 el contenido de arrayList


        System.out.println(arrayList2);

/*arrayList.forEach(elemento->{elemento.setCadena("-"+elemento.getCadena()+"-");});
        System.out.println(arrayList);*/

/*
        arrayList.forEach(elemento->{hacerAlgo(arrayList);});
*/

arrayList.removeIf(elemento->predicado(elemento));
        System.out.println(arrayList);

 arrayList.sort((a,b)-> a.compareTo(b));


    }}
