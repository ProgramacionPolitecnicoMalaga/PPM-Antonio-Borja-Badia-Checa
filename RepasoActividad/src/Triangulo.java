public class Triangulo extends Figura {

    public double base, altura;
    public String color;
    public double area(){

        return Math.PI*Math.pow(base,2);

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }





}
