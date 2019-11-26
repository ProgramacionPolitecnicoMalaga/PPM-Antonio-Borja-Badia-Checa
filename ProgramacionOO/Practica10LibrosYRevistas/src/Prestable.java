import java.util.Collection;

public interface Prestable {

    public void prestar();

    public  void devolver(Collection<Paquete> paquete);


    public String estaPrestado();


}
