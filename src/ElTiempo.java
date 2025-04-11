import java.util.Scanner;

/**
 * Inicio
 * variable temperatura tipo double
 * variable sn tipo Scanner
 * temperatura <- introducir("¿Cuánta temperatura hace?")
 * si temperatura<2
 *  mostrar "Riesgo de Hielo"
 *  sino si  temperatura  <15
 *     mostrar  "Hace Frio"
 *     sino si temperatura <30
 *          mostrar "Buena temperatura"
 *          sino si temperatura>=30
 *              mostrar "Hace mucho calor"
  */

public class ElTiempo {
    public static void main(String[] args) {
   Scanner sn = new Scanner(System.in);
        double temperatura;
        System.out.println("Ingrese el temperatura : ");
        temperatura=sn.nextDouble();
        if(temperatura<=-50 || temperatura>=50) {
            System.out.println("Temperatura humanamente no soportable");
        }else {
            if (temperatura < 2) {
                System.out.println("Riesgo de Hielo");
            } else if (temperatura < 15) {
                System.out.println("Hace frio");
            }


        }
    }





}
