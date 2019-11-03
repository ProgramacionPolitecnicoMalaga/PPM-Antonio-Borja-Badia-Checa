import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class LanzarMoneda {
    private JPanel panelMain;
    private JPanel panelCara;
    private JLabel jLabelCara;
    private JPanel panelCruz;
    private JLabel jLabelCruz;
    private JPanel panelContador;
    private JButton buttLanzarUnoPorUno;
    private JButton buttLanzamientoMultiple;
    private JLabel jLabelNumTiradas;
    private JTextField textNumTiradas;
    private JLabel jLabelPorcentajeVeces;
    private JLabel jLabelNumVecesCara;
    private JTextField textNumVecesCara;
    private JLabel jLabelNumVecesCruz;
    private JTextField textNumVecesCruz;
    private JTextField textPorcentajeCara;
    private JTextField textPorcentajeCruz;
    private JLabel jLabelMultiLanzamiento;
    private JTextField textNlanzamientos;
    private JPanel panelBotones;

    private String rutaAbsolutaCara;
    private String rutaAbsolutaCruz;
    private File imagen;
    private File imagenCara;
    private File imagenCruz;
    private int contadorCara;
    private int contadorCruz;
    private int contadorLanzamientos;
    private int caraOcruz;


    public LanzarMoneda() {

        panelCara.setVisible(false);
        panelCruz.setVisible(false);

        jLabelCara.setIcon(new ImageIcon(rutaAbsolutaMoneda("cara.png")));
        jLabelCruz.setIcon(new ImageIcon(rutaAbsolutaMoneda("cruz.png")));

        imagenCara = (new File("cara.png"));
        rutaAbsolutaCara = imagenCara.getAbsolutePath();

        imagenCruz = (new File("cruz.png"));
        rutaAbsolutaCruz = imagenCruz.getAbsolutePath();

        jLabelCara.setIcon(new ImageIcon(rutaAbsolutaCara));
        jLabelCruz.setIcon(new ImageIcon(rutaAbsolutaCruz));

        jLabelCara.setIcon(new ImageIcon(rutaAbsolutaMoneda("cara.png")));
        jLabelCruz.setIcon(new ImageIcon(rutaAbsolutaMoneda("cruz.png")));


        buttLanzarUnoPorUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                caraOcruz = (int) (Math.random() * 2);
                if (caraOcruz == 1) {
                    panelCara.setVisible(true);
                    panelCruz.setVisible(false);

                    contadorCara++;
                    contadorLanzamientos++;
                } else if (caraOcruz != 1) {
                    panelCruz.setVisible(true);
                    panelCara.setVisible(false);
                    contadorCruz++;
                    contadorLanzamientos++;

                }
                textNumTiradas.setText(Integer.toString(contadorLanzamientos));
                textNumVecesCara.setText(Integer.toString(contadorCara));
                textNumVecesCruz.setText(Integer.toString(contadorCruz));
                textPorcentajeCara.setText((((double) (contadorCara) * 100 / Double.parseDouble(textNumTiradas.getText()))) + "%");
                textPorcentajeCruz.setText((((double) (contadorCruz) * 100 / Double.parseDouble(textNumTiradas.getText()))) + "%");
                System.out.println(caraOcruz);
            }
        });
        buttLanzamientoMultiple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tiradaMultiple = Integer.parseInt(textNlanzamientos.getText());

                for (int i = 0; i < tiradaMultiple; i++) {

                    caraOcruz = (int) (Math.random() * 2);

                    if (caraOcruz == 1) {
                        panelCara.setVisible(true);
                        panelCruz.setVisible(false);

                        contadorCara++;
                        contadorLanzamientos++;
                    } else if (caraOcruz != 1) {
                        panelCruz.setVisible(true);
                        panelCara.setVisible(false);
                        contadorCruz++;
                        contadorLanzamientos++;

                    }
                    textNumTiradas.setText(Integer.toString(contadorLanzamientos));
                    textNumVecesCara.setText(Integer.toString(contadorCara));
                    textNumVecesCruz.setText(Integer.toString(contadorCruz));
                    textPorcentajeCara.setText((((double) (contadorCara) * 100 / Double.parseDouble(textNumTiradas.getText()))) + "%");
                    textPorcentajeCruz.setText((((double) (contadorCruz) * 100 / Double.parseDouble(textNumTiradas.getText()))) + "%");
                    System.out.println(caraOcruz);
                }

            }
        });
    }

    public String rutaAbsolutaMoneda(String nombreImagen) {
        File imagen = new File(nombreImagen);
        String rutaImagen = imagen.getAbsolutePath();
        return rutaImagen;

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Juego Cara o Cruz");
        frame.setContentPane(new LanzarMoneda().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.pack();
        frame.setSize(750, 350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
