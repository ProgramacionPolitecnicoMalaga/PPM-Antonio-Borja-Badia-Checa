public class ControlExcepciones  extends Exception{


    public  ControlExcepciones(String mensajeAlerta){
        super(mensajeAlerta);
        System.out.println(getMessage());


    }

    public String getMessage() {
        return ("Error. La cola está llena. Saca primero un elemento, antes de introducir otro.");

    }

}
