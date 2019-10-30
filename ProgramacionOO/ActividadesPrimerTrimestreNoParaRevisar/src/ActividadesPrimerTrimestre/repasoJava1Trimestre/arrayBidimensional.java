package ActividadesPrimerTrimestre.repasoJava1Trimestre;

public class arrayBidimensional {


    public static void main(String[] args) {

        String[][] arraySimple = new String[10][10];
        for (String[] i : arraySimple) {
            System.out.println(" ");
            for (String[] j : arraySimple) {
                System.out.print("[]");
            }
        }

  /* int [] arraySimple  = new int[5];
        arraySimple[0]=54; // 0 entre corchetes hace referencia a la posición del array, el =1, 1 es el valor de la posición osea 1
        arraySimple[1] = 55;
        arraySimple[2] = 56;
        arraySimple[3] = 57;
        arraySimple[4] = 58;
   for (int i: arraySimple) {            //for each
       System.out.print("|" + i);
   }*/

/*for (int i=0; i<arraySimple.length;i++) { // for simple
    System.out.println(arraySimple[i]);

}*/
    }}