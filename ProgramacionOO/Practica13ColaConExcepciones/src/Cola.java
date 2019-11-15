import java.util.Arrays;

public class Cola {

    private int head;
    private  int tail;
    public int [] ArrayElementos;
    private int elementosEnCola=0;


    public Cola (int tamannoCola){

        head=-1;
        tail=-1;

        ArrayElementos = new int[tamannoCola];

    }

    public   int sacarElemento() throws SacarElementoDeColaVaciaException {

        int elemento;
        if (!colaVacia()){
elemento=ArrayElementos[head];
head++;
if (head==ArrayElementos.length)
    head=0;
elementosEnCola--;
if(elementosEnCola==0){
    tail=-1;
    head=-1;

}
        } else {
            head=-1;
            tail=-1;
            throw new SacarElementoDeColaVaciaException("La cola está vacía");
        }

return elemento;
    }
public boolean colaLlena(){

        return elementosEnCola==ArrayElementos.length;

}

public boolean colaVacia(){

        return (elementosEnCola==0);
}

private  int numElementosEnCola(){
        return elementosEnCola;


}


public void meterElementoEnCola(int nuevoElemento){

        if(colaVacia()){

            head=-1;
            tail=-1;
        } else if (!colaLlena()) {

            tail++;
            if ((tail == ArrayElementos.length))
                tail = 0;
            elementosEnCola++;
            ArrayElementos[tail] = nuevoElemento;
        }

}

    @Override
    public String toString() {
        return "Cola{" +
                "head=" + head +
                ", tail=" + tail +
                ", ArrayElementos=" + Arrays.toString(ArrayElementos) +
                ", elementosEnCola=" + ArrayElementos.length +
                '}';
    }
}
