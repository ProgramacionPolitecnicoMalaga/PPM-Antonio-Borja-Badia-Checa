public class Circulo extends Figura{

    public double radio;
    public String color;
    public double area(){

        return Math.PI*Math.pow(radio,2);

    }

    public void setRadio(double radio){

        this.radio=radio;
    }






}
