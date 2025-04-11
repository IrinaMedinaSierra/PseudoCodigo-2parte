import java.util.Scanner;

public class Ternario {

    public static void main(String[] args) {
        int numPersonas;
        boolean seguro;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas");
        numPersonas = teclado.nextInt();
        System.out.println("¿Desea un seguro de cancelación?");
        seguro = teclado.nextBoolean();
        System.out.println(
                "Viaje reservado para " + numPersonas + " persona" +(numPersonas>1?"s":"")+ "," + (seguro?"con":"sin") + " seguro de cancelacion");
    }


}
