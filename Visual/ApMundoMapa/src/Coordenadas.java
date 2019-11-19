import org.openstreetmap.gui.jmapviewer.interfaces.ICoordinate;


public abstract  class Coordenadas implements ICoordinate {

public double x;
public double y;

    public Coordenadas(double x, double y) {
        super();


    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


public void setLocalizacion(double x, double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coordenadas other = (Coordenadas) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        throw new RuntimeException("Operación inválida");

    }



}
