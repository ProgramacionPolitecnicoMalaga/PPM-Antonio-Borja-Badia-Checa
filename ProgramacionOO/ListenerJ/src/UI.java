import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    private JLabel lblSuma;
    private JTextField textSuma;
    private JButton buttSuma;
    private JPanel panlSuma;
    public Suma suma= new Suma();

    public UI(){
        buttSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                suma.sumar(Integer.parseInt(textSuma.getText()));
            }
        });


    }

    public AvisadorCambioSuma avisador = new AvisadorCambioSuma() {
        @Override
        public void avisar(Suma suma) {
            lblSuma.setText(String.valueOf(suma.getSumaTotal()));
        }
    };




}
