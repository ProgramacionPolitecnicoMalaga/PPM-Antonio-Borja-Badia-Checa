package ActividadesPrimerTrimestre.com.politecnico;

public class MovimientoenL extends Movimiento {



    public Coordenadas mover( Coordenadas punto, int movimiento){
 switch(movimiento){
        case HACIA_ARRIBA:
            punto.setX(punto.getX()+2);
            break;
        case HACIA_DERECHA:
            punto.setX(punto.getX()+1);
            break;
        case HACIA_ABAJO:
            punto.setY(punto.getY()-1);
            break;
        case HACIA_IZQUIERDA:
            punto.setX(punto.getX()-1);
    }
        return punto;
}


}
