package ActividadesPrimerTrimestre.Tema2ElLibro;

import java.util.Scanner;

import static ActividadesPrimerTrimestre.Tema2ElLibro.Biblioteca.biblioteca;


public class Bibliotecario {


public static void annadirLibro () {


    Scanner src = new Scanner(System.in); //.useDelimiter("\\n");

    int numLibros, i = 0;
    System.out.println("Cuántos libros desea guardar?");
    //numLibros = src.nextInt();
//src.nextLine();
    numLibros = Integer.parseInt( src.nextLine()); // nextInt() NO consume salto de línea. Con Integer.parseInt() forzamos a que sí lo haya

    while (true) {
        i++;
        System.out.println("Introduce un un titulo.");
        String Titulo = src.nextLine();

        System.out.println("Introduce un Autor.");
        String Autor = src.nextLine();

        System.out.println("Introduce una Editorial.");
        String Editorial = src.nextLine();

        System.out.println("Introduce un Nº de Edición:");
        int NumeroEdicion = src.nextInt();
        src.nextLine();

        System.out.println("Introduce un ISBN.");
        String ISBN = src.nextLine();

        Libro nuevoLibro = new Libro(Titulo, Autor, Editorial, ISBN, NumeroEdicion); /* Creo un objeto llamado nuevoLibro, de esta forma
        guardamos los valores de los atributos añadidos por el usuario. Luego en el main un for each, se encargará de imprimirlo*/

        biblioteca.add(nuevoLibro);// biblioteca es el arrayList creado en Biblioteca

        if (i == numLibros) { //Una vez i se iguala a numLibros, el bucle se rompe
            break;
        }
    }

}
    public static void main(String[] args) {

       // Libro libro1 = new Libro("La isla del tesoro", "Robert Lowis", "Anaya", "ESP7863265",85);


        annadirLibro();//Llamamos al metodo annadirLibro dentro del main


        for (Libro i:  biblioteca){
            System.out.println("[Título:] "+i.getTitulo()+" [Autor:] "+i.getAutor()+" [Editorial:] "+i.getEditorial()+" [Nº Editorial:] "+i.getNumeroEdicion()+" [ISBN:] "+i.getISBN());
            int j= 0;
            j++;

        }


    }
}
