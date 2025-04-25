/**
 *  TipoTabla nombreTabla= TipoTabla[longitud]
 *  int[] numeros=new int[10]; -> java
 *
 *  Importante:
 *  Las tablas se comienzan a recorrer en el indice 0 y terminan en la longitud-1
 *
 *  Para recorrer una tabla se puede hacer de dos maneras
 *
 *  1->> Para i<-0 hasta longitud-1
 *
 *  2->> Para item:tabla
 *
 */


public class Tabla {
    public static void main(String[] args) {
        int[] numeros=new int[10];
        //Estos numeros los recorrere y le asignare un valor..con Random
        System.out.println("Recorrer tabla con for");
        for (int i = 0; i < numeros.length-1; i++) {
            numeros[i]= (int) (Math.random()*100); //Math.random devuelve un double...se casting a int
            System.out.print(numeros[i]+" ");
        }
        System.out.println("\nRecorrer tabla con forEach");
        for( int item: numeros ) {
            System.out.print(item+" ");
        }





    }


}
