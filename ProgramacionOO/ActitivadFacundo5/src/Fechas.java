import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Fechas {
    private Date fechaLimite;

    public Fechas(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void parseDate(String date_s) throws ParseException {
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dt.parse(date_s);
        SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dt1.format(date));

    }

    @Override
    public String toString() {
        return "Fechas{" +
                "fechaLimite=" + fechaLimite +
                '}';
    }
}
