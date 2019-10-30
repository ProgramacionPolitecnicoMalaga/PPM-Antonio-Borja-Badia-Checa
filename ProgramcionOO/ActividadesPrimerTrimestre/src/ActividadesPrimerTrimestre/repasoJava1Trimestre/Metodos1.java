package ActividadesPrimerTrimestre.repasoJava1Trimestre;

public class Metodos1 {

double num1=12;
double num2=6;



public double Multiplicacion(int x, int y){
    double multiplicacion=x*y;
    return multiplicacion;
    //Al haber return, no hace falta meter souts en cada método
}

    public double Suma(int x, int y){

    double suma=x+y;
    return suma;
    }

   /* public double Division() {
double division=num1/num2;
    return division;


    }*/

    public double Division /*void cuando no va a devolver nada, sólo ejectua*/() {
        double division=num1/num2;
        return division;


    }


    public double Resta() {

double resta=num1-num2;
return resta;
        }

        //Metodo constructor
            public static void main(String[] args) {

        /*Implementar las clase operaciones. Se deben cargar dos valores enteros, calcular suma, resta, multiplicación
        y división. Cada una en un método, imprimir dichos resultados. Estos dos atributos serán de la clase.*/

        Metodos1 objetoOperacion = new Metodos1();
        //Manera de crear un objeto= NombreClase nombresObjeto  = new NombreClase();

                System.out.println("Multiplicación: "+objetoOperacion.Multiplicacion(5,6));
                System.out.println("Suma: "+objetoOperacion.Suma(7,12));

                System.out.println("División: "+objetoOperacion.Division());
                System.out.println("Resta: "+objetoOperacion.Resta());

                double calculo=objetoOperacion.Multiplicacion(5,6);// Creando la variable calculo, guardamos el resultado del método Multiplicación
                System.out.println(+calculo);
    }
}
