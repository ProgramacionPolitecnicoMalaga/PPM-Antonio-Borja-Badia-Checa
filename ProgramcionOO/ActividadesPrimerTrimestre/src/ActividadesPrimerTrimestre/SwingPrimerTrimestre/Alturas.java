package ActividadesPrimerTrimestre.SwingPrimerTrimestre;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alturas {
    private JTextField textAltura;
    private JTextField textAlturas;
    private JTextField textMedia;
    private JButton butAnnadir;
private JPanel panelMain;
static float [] alturas = new float[5];
static float media=0;
private int k=0;


public Alturas(){


    butAnnadir.addActionListener(new ActionListener() {
        @Override



        public void actionPerformed(ActionEvent e) {

            if(!textAltura.getText().equals("")){
                if(k < alturas.length){

                    alturas[k]=Float.parseFloat(textAltura.getText());
                    k++;
                    showAlturas();

                    textMedia.setText(String.valueOf(media()));

               textAltura.setText("");
               textAltura.grabFocus();
               if(k== alturas.length){

                   butAnnadir.setEnabled(false);
               }
                }

            } }

        private void showAlturas() {

            String strAlturas ="";
            for (int i= 0; i<alturas.length;i++){

                strAlturas += String.valueOf(alturas[i]);
                if (i<4){
                    strAlturas +="-";

                }
            }
            textAlturas.setText(strAlturas);
        }

        private float media(){
            float mediaAlturas=0;

            for(int i=0; i<alturas.length;i++){

                mediaAlturas+=(alturas[i])/alturas.length;
/*
                mediaAlturas+=alturas[i];
*/

            }
            return mediaAlturas;
/*
            return mediaAlturas/alturas.length;
*/
        }

    });
}
    public static void main(String[] args) {
        JFrame frame = new JFrame("Alturas");
        frame.setContentPane(new Alturas().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }



}
