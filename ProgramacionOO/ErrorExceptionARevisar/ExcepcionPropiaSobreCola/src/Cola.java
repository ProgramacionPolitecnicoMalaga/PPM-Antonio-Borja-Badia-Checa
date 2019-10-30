public class Cola {

    private int tail, head;
    static int[] elementos;
    static int elementosAlmacenados = 0;
    public Cola(int tamanoCola){
        head = 0;
        tail = -1;
        elementos = new int[tamanoCola];
    }

    public int sacar(){
        int elemento;
        if (!estaVacia()) {
            elemento = elementos[head];
            head++;
            if (!estaLlena())
                head = 0;
            elementosAlmacenados--;
        } else
            elemento = Integer.MIN_VALUE;

        return elemento;
    }

    public void meter(int nuevoElemento) throws  ControlExcepciones{
        if (estaVacia()){
            tail = head;
        }else if (!estaLlena()){
            tail++;
            elementosAlmacenados++;
            // No puedes hacer esta comprobación después de insertar el elemento. Porque
            // estarías diciendo que te parece bien usar un tail == elementos.length
            if (tail == elementos.length)
                tail = 0;
            elementos[tail] = nuevoElemento;;
        }
        else {
            System.out.println("tail = " + tail);
            System.out.println("head = " + head);
            throw new ControlExcepciones("Cola se  llenó. No se pudieron seguir añadiendo elementos.") ;
        }
    }


    public boolean estaVacia(){
        return (tail == -1);
    }

    public boolean estaLlena(){
        return ( tail + 1 ) % elementos.length == head;
    }

    private int numeroElementos(){
        int temp = (tail - head) % elementos.length;
        if (temp < 0)
            temp = (elementos.length + temp) + 1;
        else
            temp++;
        return temp;


    }

    public String toString() {
        String contenidoCola = "HEAD (" + head + ")";
        int totalElementosRecorridos = 0;
        for (int i=head; totalElementosRecorridos < numeroElementos(); i++){
            i = i%elementos.length;
            contenidoCola += "|" + elementos[i] + "|";
            totalElementosRecorridos++;
        }

        contenidoCola += "TAIL(" + tail + ")";
        return contenidoCola;
    }


}
