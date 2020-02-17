import java.util.NoSuchElementException;

public class EstablecimientoNoExistenteException extends NoSuchElementException {
	public EstablecimientoNoExistenteException(String msg){
		super(msg);
	}
}
