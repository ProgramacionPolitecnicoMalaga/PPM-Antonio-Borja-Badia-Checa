public class Cuadrado extends Figura {


    public double lado;
    public String color;
    public double area(){

        return Math.PI*Math.pow(lado,2);

    }

    public void setlado(double lado){

        this.lado=lado;
    }



}
