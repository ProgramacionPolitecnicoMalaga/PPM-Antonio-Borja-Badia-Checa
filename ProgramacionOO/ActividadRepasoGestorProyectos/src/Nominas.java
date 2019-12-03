public class Nominas {

public static final double TECNICO=900;
public static final double ADMINISTRADOR=1400;
public static final double PROGRAMADOR= 1800;
public static final double JEFE_PROYECTO=2500;
public static final double JEFE_OPERACIONES= 3500;
public double sueldoTotal;
public String categoria;
public      double sueldoBase;

Empleados empleados = new Empleados();
    public Nominas(String categoria, double sueldoBase) {
        this.categoria = categoria;
        this.sueldoBase = sueldoBase;
    }

    public Nominas(int categoria) {
        switch (categoria) {
            case 1:
                sueldoBase = TECNICO;
                break;
            case 2:
                sueldoBase = ADMINISTRADOR;
                break;
            case 3:
                sueldoBase = PROGRAMADOR;
                break;
            case 4:
                sueldoBase = JEFE_PROYECTO;
                break;
            case 5:
                sueldoBase = JEFE_OPERACIONES;
        }
    }

    public Nominas() {
    }

    public  double elegirCategoria (String categoria){
        switch(categoria)
    {
        case "Técnico":
            System.out.println(TECNICO);
           sueldoBase=TECNICO;
            break;
        case "Programador":
            System.out.println(PROGRAMADOR);
           sueldoBase=PROGRAMADOR;
            break;
        case "Administrador":
            System.out.println(ADMINISTRADOR);
sueldoBase=ADMINISTRADOR;
            break;
        case "J.Proyecto":
            System.out.println(JEFE_PROYECTO);
           sueldoBase=JEFE_PROYECTO;
            break;
        case "J.Operaciones":
            System.out.println(JEFE_OPERACIONES);
            sueldoBase=JEFE_OPERACIONES;
            break;
    }
return sueldoBase;

    }
    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }
}
