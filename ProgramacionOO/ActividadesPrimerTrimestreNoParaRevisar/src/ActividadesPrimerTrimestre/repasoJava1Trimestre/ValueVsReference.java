package ActividadesPrimerTrimestre.repasoJava1Trimestre;

public class ValueVsReference {



    public static class Persona {
        private String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Persona(String nombre) {
            super();
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    '}';
        }
    }
        public static void main(String[] args) {
            Persona persona= new Persona("pedro");

            cambiarValor(persona);

            System.out.println(persona.getNombre()+" este debería ser miguel");
            persona.setNombre("isaí");
            System.out.println(persona.toString()+" este debería ser pedro");

        }
        public static void cambiarValor(Persona p) {
/*
            p.setNombre("miguel");
*/
System.out.println(p.nombre+" ejemplo que no cambia");

        }
    }





