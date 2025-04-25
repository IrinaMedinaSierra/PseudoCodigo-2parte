import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraysListPeliculas {
    public static void main(String[] args) {
        Film pelicula1 = new Film("Inception", "Christopher Nolan", "2010-11-20", "Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page", "Ciencia ficción, Thriller");
        Film pelicula2 = new Film("The Dark Knight", "Christopher Nolan", "2008-10-20", "Christian Bale, Heath Ledger, Aaron Eckhart", "Acción, Drama, Thriller");
        Film pelicula3 = new Film("The Godfather", "Francis Ford Coppola", "1972-08-13", "Marlon Brando, Al Pacino, James Caan", "Crimen, Drama");
        Film pelicula4 = new Film("Titanic", "James Cameron", "1997-04-02", "Leonardo DiCaprio, Kate Winslet, Billy Zane", "Drama, Romance");
        Film pelicula5 = new Film("The Matrix", "The Wachowskis", "1999-04-15", "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss", "Acción, Ciencia ficción");

        /**
         * Se quiere una colección que guarde todas estas Peliculas, utilizamos el ArrayList..
         *
         * Agregar.... nombreArraylist.add(NombreObjeto)
         */
        ArrayList<Film> misPeliculas = new ArrayList<>();

        //agregar a la coleccion
        misPeliculas.add(pelicula1); //Le agrego la pelicula 1 a una lista que formando llamada misPeliculas.
        misPeliculas.add(pelicula2);
        misPeliculas.add(pelicula3);
        misPeliculas.add(pelicula4);
        misPeliculas.add(pelicula5);
//    mostrarPeliculas(misPeliculas); //llamada a una funcion, pasando un valor....lista
         //Borrar un objeto de la lista....
//        misPeliculas.remove(pelicula2); //el indice de Pelicula2 -> 1
//        misPeliculas.remove(3);
//        System.out.println("Borrando Pelicula2");
  //      mostrarPeliculas(misPeliculas);
        //Conocer cuantos elementos tengo en un ArraList -> nombreArrayList.size()               ->>Array nombreArray.length
//        System.out.println("Tengo " + misPeliculas.size() + " peliculas en mi Lista ");
        //Recuperar y mostrar los datos de un objeto almacenado en nuestro ArrayList -> get
       // System.out.println(pelicula1.getIdPelicula() +" "+ pelicula1.getNombrePelicula());  //Tomando directamente del objeto.
        //Cuando se quiere recuperar de la lista un objeto, se debe almacenar en una variable del mismo tipo.......
//        Film recuperado=misPeliculas.get(0); //tomando del ArrayList
//        System.out.println(recuperado.toString());
        //Para modificar/actualizar los datos de un objeto almacenado en un arrayList, lo correcto es hacerlo un una clase llamada Iterator
        Iterator<Film> iterator = misPeliculas.iterator();
        while (iterator.hasNext()) { //verifica si exite elementos en el ArrayList
            Film film=iterator.next(); //Objeto temporal..almacenado en mismo tipo
            if (film.getDirector().equals("Christopher Nolan")) {
                  film.setDirector("Irina Medina"); //Cambiar el dato......de solo director....
            }
        }
        /**
         * Normalmente, utilizas el id como ese elemento de búsqueda....
         */
        int opcion=0,opcionM=0;
         do{
             System.out.println("Indica la Pelicula a modificar: " );
             for (int i=0;i<misPeliculas.size();i++) {
                 System.out.println((i+1)+ ". " + misPeliculas.get(i).getNombrePelicula());
             }
             System.out.println("6. Salir");
             Scanner sc = new Scanner(System.in);
             opcion=sc.nextInt();
             String modificar="";
             Iterator<Film> it = misPeliculas.iterator();
             while (it.hasNext()) {
                 Film film=it.next();
                 if (film.getIdPelicula()==opcion) {
                     System.out.println(film.toString() + "\n ¿Qué dato desea modificar?  \n1.- Nombre de la Pelicula \n2.- Director\n3.- Fecha de Producción \n4. Reparto \n5. Genero");
                     //hasta aqui pruebo........
                     opcionM=sc.nextInt();
                     sc.nextLine();
                     switch (opcionM){
                         case 1->{
                             System.out.println("Indique el nombre de la Pelicula");
                             modificar= sc.nextLine();
                             film.setNombrePelicula(modificar);
                         }
                         case 2->{
                             System.out.println("Indique el director de la Pelicula");
                             modificar= sc.nextLine();
                             film.setDirector(modificar);
                         }
                         case 3->{
                             System.out.println("Indique la fecha de producción de la Pelicula");
                             modificar= sc.nextLine();
                             film.setAnioProduccion(LocalDate.parse(modificar));
                         }
                         case 4->{
                             System.out.println("Indique el reparto de la Pelicula");
                             modificar= sc.nextLine();
                             film.setReparto(modificar);
                         }
                         case 5->{
                             System.out.println("Indique el genero de la Pelicula");
                             modificar= sc.nextLine();
                             film.setGenero(modificar);
                         }

                     }

                     System.out.println("Pelicula Modificada\n"+ film.toString());



                 }

             }
         }while(opcion==6);







     //   mostrarPeliculas(misPeliculas);













    }

    /**
     * Mostrar ArrayList
     */
public static void mostrarPeliculas(ArrayList<Film> listaPeliculas) {
    /**forEach **/
    System.out.println("Recorrido con forEach");
    for(Film pelicula : listaPeliculas) {
        System.out.println(pelicula);
    }
    System.out.println("Recorrido con for");
    //Ejemplo de recorrido con un For
    for( int i = 0; i < listaPeliculas.size(); i++ ) {
        System.out.println(listaPeliculas.get(i).toString());
    }

}


}
