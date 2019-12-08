public class MImain {

    public static void main(String[] args) {
Producto p1 = new Producto("P1");
Producto p2 = new Producto("P2");

p1.setEspecificacionesArrayList(new Componente("C1", 7));
p1.setEspecificacionesArrayList(new Componente("C2", 10));
p1.setEspecificacionesArrayList(new Componente("C3", 4));


Inventario inventario = new Inventario();
inventario.addExistencias(new Componente("C1", 0),100);
inventario.addExistencias(new Componente("C2", 0),100);
inventario.addExistencias(new Componente("C3", 0),100);


if(escasos.size<10){
    System.out.println();

}


    }
}
