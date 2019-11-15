public class SacarElementoDeColaVaciaException extends  ArrayIndexOutOfBoundsException {
public SacarElementoDeColaVaciaException(String mensaje){

    super(mensaje);
    System.out.println("La cola no contiene elementos. Por ello no es posible extraer elememtos");
}

public String advertenciaException(){


    return "No es posible sacar elementos. La cola ya está vacia";

}

}
