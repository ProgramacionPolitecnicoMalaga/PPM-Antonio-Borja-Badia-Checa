public class ejemploBucle {

    //public static int dia= 5;

    public static void main(String[] args) {

        int [] ventas= {2,3,7,1,0};
        boolean encontrado=false;
        int ventaDeInteres=7;
        int diaDeInteres;

        int dia= 0;
        while ((! encontrado) && (dia <4)){
            if (ventas[dia]==7)
                encontrado=true;
            else
                dia++;
        }
    switch (dia){

        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miércoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
            default:
                System.out.println("No coincide con la búsqueda.");


    }



    }
}
