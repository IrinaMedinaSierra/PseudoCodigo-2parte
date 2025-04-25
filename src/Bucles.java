import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * Para m <- 0 a 10
 *      mostrar m
 *  Fin Para
 *
 *  m<-0
 * mientras que  m<=10
 *  mostrar m
 *  incrementar m
 * Fin Mientras
 *
 *Repetir
 *   mostrar m
 *   imcrementamos m
 *
 * Mientras (m<=10)
 *
 * Bucles anidados
 *
 * Para i<-1 hasta 10
 *   mostrar Tabla del i
 *   Para j<-1 hasta 10
 *      mostrar i * j = (i*j)
 *   Fin Para
 * Fin Para
 *
 *
 * Bucle para recorrer tablas
 *
 * Por cada(elemento:laLista)
 *     mostrar elemento
 * Fin PorCada
 */



public class Bucles {
    public static void main(String[] args) {
//        System.out.println("Bucle FOR");
        //Bucle for-> declaracion;condicion;incremento
        //Array.lenght.....
//        for (int m = 0; m < 10; m++) {
//            System.out.println(m);
//        }
//        System.out.println("Bucle While");
//        int m=0;
//        while(m<=10){
//            System.out.println(m);
//            ++m;
//        }
//        System.out.println("Bucle Do-While -> Se ejecuta al menos una vez");
//        m=0;
//        do{
//            System.out.println(m);
//            ++m;
//        }while(m<=10);
//
//
//        System.out.println("Tabla de Multiplicar");
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println("TABLA DEL " +i);
//            for (int j = 1; j <=10 ; j++) {
//                System.out.println(i +"*"+ j +" = "+i*j);
//            }
//
//        }
        System.out.println("Bucle FOREach");
        String[] array = {"Nombre1","Nombre2","Nombre3","Nombre4","Nombre5"};
        //Bucle forEach....
        for( String item : array){
            System.out.println(item);
        }



    }

}
