import javax.swing.*;
import java.util.*;

public class Urgencias {

int idEspacialidad;
String especialidad;
    private JPanel panelMain;
    private JPanel panelListaEspera;
    private JButton buttSigientePaciente;
    private JPanel panelVisualizarSiguientePAciente;

    public Urgencias(int idEspacialidad, String especialidad) {
        this.idEspacialidad = idEspacialidad;
        this.especialidad = especialidad;
    }

    public int getIdEspacialidad() {
        return idEspacialidad;
    }

    public void setIdEspacialidad(int idEspacialidad) {
        this.idEspacialidad = idEspacialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
