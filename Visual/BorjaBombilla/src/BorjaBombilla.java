import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class BorjaBombilla {
    private JPanel panelBombillaEncendida;
    private JPanel panelBombillaApagada;
    private JPanel panelInterruptores;
    private JButton buttON;
    private JButton buttOFF;
    private JLabel JLabelEncendida;
    private JLabel JLabelApagada;
    private JPanel panelMain;
    private File imagenBombillaEncendida;
    private File imagenBombillaApagada;
    private File imagen;

    private String rutaAbsolutaON;
    private String rutaAbsolutaOFF;

    public BorjaBombilla() {

        panelBombillaEncendida.setVisible(true);

        buttON.setEnabled(false);

        panelBombillaApagada.setVisible(false);

        buttOFF.setEnabled(true);


       /* JLabelEncendida.setIcon(new ImageIcon("C:\\Users\\borja_\\Desktop\\Programacion\\Visual\\Bombilla\\BombillaEncendida.png"));
        JLabelApagada.setIcon(new ImageIcon("C:\\Users\\borja_\\Desktop\\Programacion\\Visual\\Bombilla\\BombillaApagada.png"));*/ //Estas dos líneas, hacen referencia de manera absoluta a la ruta de la imagen.

        JLabelEncendida.setIcon(new ImageIcon(rutaBombilla("BombillaEncendida.png")));
        JLabelApagada.setIcon(new ImageIcon(rutaBombilla("BombillaApagada.png")));


        imagenBombillaEncendida= new File("BombillaEncendida.png");
        rutaAbsolutaON=imagenBombillaEncendida.getAbsolutePath();
        System.out.println(rutaAbsolutaON);


        imagenBombillaApagada= new File("BombillaApagada.png");
        rutaAbsolutaOFF=imagenBombillaApagada.getAbsolutePath();

        JLabelEncendida.setIcon(new ImageIcon(rutaAbsolutaON));
        JLabelApagada.setIcon(new ImageIcon(rutaAbsolutaOFF));
        System.out.printf(String.valueOf(JLabelEncendida));

        JLabelEncendida.setIcon(new ImageIcon(rutaBombilla("BombillaEncendida.png")));
        JLabelApagada.setIcon(new ImageIcon(rutaBombilla("BombillaApagada.png")));

        buttON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelBombillaEncendida.setVisible(true);
                panelBombillaApagada.setVisible(false);

                buttOFF.setEnabled(true);
                buttON.setEnabled(false);

            }
        });

        buttOFF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelBombillaEncendida.setVisible(false);
                panelBombillaApagada.setVisible(true);

                buttON.setEnabled(true);
                buttOFF.setEnabled(false);
            }
        });
    }

    public String rutaBombilla(String nombreImagen){//metodo para extraer la ruta absoluta de la imagen. Sospecho que sólo funciona a nivel de "proyecto".
        imagen = new File(nombreImagen);
        String rutaImagen=imagen.getAbsolutePath();
        return rutaImagen;

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interruptor para Apagar/Encender la Bombilla");
        frame.setContentPane(new BorjaBombilla().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
