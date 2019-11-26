import java.util.*;

public class AdministracionUrgencias {


    public  static Comparator<Paciente> administrarListaEspera = new Comparator<Paciente>() {
        @Override
        public int compare(Paciente p1, Paciente p2) {
            if(p1.isIncidenciaGravedad()){
                p1.setPrioridad(0);
            }
            if(p1.getPrioridad()-p2.getPrioridad()==0){
                return p1.getDNI().compareTo(p2.getDNI());
            }else{
                return p1.prioridad-p2.prioridad;
            }

        }};

    static TreeSet<Paciente> listaEspera = new TreeSet<>(administrarListaEspera);

        public static void main(String[] args) {

            listaEspera.add(new Paciente("25488B","Borja", 27,1, true));
            listaEspera.add( new Paciente("23432A","Paciente1", 72,5, false));
            listaEspera.add( new Paciente("78455S","Paciente2", 35,11, true));
            listaEspera.add(new Paciente("94613L","Paciente3", 43,8, false));
            listaEspera.add( new Paciente("845151O","Paciente4", 56,2, false));
            listaEspera.add( new Paciente("2489618K","Paciente5", 21,5, false));


            for (Paciente L :listaEspera ) {
                System.out.println(L);

            }


        }



}