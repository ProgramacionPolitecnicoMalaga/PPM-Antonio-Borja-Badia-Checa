import java.util.NoSuchElementException;

public class CiudadNoExistenteException extends NoSuchElementException{
	public CiudadNoExistenteException(String msg){
		super(msg);
	}
}
