import com.github.lgooddatepicker.components.CalendarPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.chrono.ChronoLocalDate;

import static java.util.concurrent.TimeUnit.DAYS;

public class CalculaFechas {
    private JPanel panelMain;
    private JPanel panelFecha1;
    private JPanel panelFecha2;
    private JLabel jLabelAnnos;
    private JTextField textAnnos;
    private JLabel jLabelMeses;
    private JTextField textMeses;
    private JLabel jLabelDias;
    private JTextField textDias;
    private JLabel jLabelHoras;
    private JTextField textHoras;
    private JLabel jLabelMinutos;
    private JTextField textMinutos;
    private JLabel jLabelSegundos;
    private JTextField textSegundos;
    private JTextField jLabelCalculadora;
    private JButton buttCalcular;
    private CalendarPanel calendarFecha1;
    private JLabel jLabelFecha1;
    private JPanel panelCalcular;
    private JLabel jLabelFecha2;
    private CalendarPanel calendarFecha2;
    private ChronoLocalDate fecha1;
private ChronoLocalDate fecha2;



    public double [] fechaCalculada(ChronoLocalDate fecha1, ChronoLocalDate fecha2){

       double[] diferenciaFechas = new double[6];
       diferenciaFechas[0]= DAYS.toChronoUnit().between(fecha1,fecha2)/365;
     //  System.out.println(diferenciaFechas[0]);
       diferenciaFechas[1]= DAYS.toChronoUnit().between(fecha1,fecha2)/30;
       //System.out.println(diferenciaFechas[1]);
       diferenciaFechas[2]= DAYS.toChronoUnit().between(fecha1,fecha2);
       //System.out.println(diferenciaFechas[2]);
       diferenciaFechas[3]= DAYS.toChronoUnit().between(fecha1,fecha2)*24;
       //System.out.println(diferenciaFechas[3]);
       diferenciaFechas[4]= DAYS.toChronoUnit().between(fecha1,fecha2)*1440;
       //System.out.println(diferenciaFechas[4]);
       diferenciaFechas[5]= DAYS.toChronoUnit().between(fecha1,fecha2)*86400;
       //System.out.println(diferenciaFechas[5]);

return diferenciaFechas;
   }



    public void getDiferencia (double[]fechas){
        textAnnos.setText(String.valueOf(fechas[0]));
        textMeses.setText(String.valueOf(fechas[1]));
        textDias.setText(String.valueOf(fechas[2]));
        textHoras.setText(String.valueOf(fechas[3]));
        textMinutos.setText(String.valueOf(fechas[4]));
        textSegundos.setText(String.valueOf(fechas[5]));
        panelCalcular.setVisible(true);
    }




    public CalculaFechas() {
        buttCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fecha1=calendarFecha1.getSelectedDate();
                fecha2=calendarFecha2.getSelectedDate();
                getDiferencia(fechaCalculada(fecha1,fecha2));
            }
        });
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Fechas");
        frame.setContentPane(new CalculaFechas().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //   frame.pack();
        frame.setSize(new Dimension(350,680));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

}}
