import java.util.Scanner;

public class Main {
    //variable global
    static Scanner sc = new Scanner(System.in);//puede ser usuado por todos los metodos

    public static void main(String[] args) {
        int edad=15;
        String mensaje=edad>=18?"Es mayor de edad":"Es menor de edad";
        int respuesta=edad>=18?1:2;
        boolean siNo=edad>=18?true:false;














    if(verficarElectricidad()){
        //continuo haciendo el cafe
        encenderCafetera();
        abrirCafetera();
        sacarFiltro();
        if(ponerFiltro()){
            System.out.println("Seguimos haciendo el cafe.........");











        }else{
            System.out.println("Vuelve a comenzar");
        }
    }else{
        //termina el programa
        System.out.println("Buen provecho");
    }

    }

    /**
     * @description Metodo que verifica si existe electricidad y de la respuesta dependera la continuidad de la aplicacion
     * @return verificarluz
     */
    static boolean verficarElectricidad(){
        boolean verficarLuz = false;
        System.out.println("Tiene luz -> true / false");
        verficarLuz = sc.nextBoolean();
        if(verficarLuz){
            System.out.println("Hago cafe");
            verficarLuz = true;
        }else{
            irBar();
        }
        return verficarLuz;
    }

    /**
     * @descripcion Metodo que solo muestra la acción de encender la cafetera
     */
    static void encenderCafetera(){
        System.out.println("Encendiendo Cafetera");
    }

    static void abrirCafetera(){
        System.out.println("Abrir Cafetera");
    }
    static void sacarFiltro(){
        System.out.println("Sacar Filtro");
    }

    static void irBar(){
        System.out.println("Me voy Bar");
    }

    static void irSupermercado(){
        System.out.println("Me voy Supermercado");
    }

    /**
     * @description Metodo que verifica si hay filtros, sino se va al supermercado
     * @return tenerfiltro
     */
    static boolean ponerFiltro(){
        boolean tenerFiltro = false;
        System.out.println("Tienes filtro -> true / false");
        tenerFiltro = sc.nextBoolean();
        if(tenerFiltro){
            System.out.println("Pongo el filtro");
        }else{
            irSupermercado();
        }
        return tenerFiltro;
    }

}