import java.util.Scanner;

/**
 * Pseudocodigo
 * Variables
 * texto nombre, apellidos
 * entero puesto,nHijos,
 * decimal tarifaHoraria,salarioBruto,salarioNeto,salarioCobrar,nHoras
 *
 *  Scanner sn
 *
 * nombre<- entrada ("indicar nombre..")
 * apellidos <- "
 * puesto <- entrada (1 - Agente de servicio 2 - Empleado de oficina 3 - Directivo"
 * nHijos<- entrada("indicar numero de hijos")
 *
 *funcion calculoSBruto (nHoras,tarifaHoraria)
 *
 *
 * funcion calculoPrimaFamiliar(nHijos)
 *
 *
 * funcion calcularDeducciones (salarioBruto)
 *
 *
 */

public class Nomina {
    public static void main(String[] args) {
        String nombre, apellidos;
        int puesto, nHijos, pfamiliar;
        double tarifaHoraria, salarioBruto, salarioNeto, salarioCobrar, nHoras;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellidos = entrada.nextLine();
        System.out.println("Ingrese su puesto: 1-> Agente de servicio 2-> Empleado de oficina 3-> Directivo");
        puesto = entrada.nextInt();
        System.out.println("Numero de Hijos");
        nHijos = entrada.nextInt();
        System.out.println("Tarifa Horaria");
        tarifaHoraria = entrada.nextDouble();
        System.out.println("Número de horas");
        nHoras = entrada.nextDouble();
        // System.out.println("La prima por hijos es " + primaFamiliar(nHijos)+"€");
        pfamiliar = primaFamiliar(nHijos);
        System.out.println("sueldo bruto " +calcularSalarioBruto(nHoras,tarifaHoraria));
    }

    static int primaFamiliar(int numHijos) {
        int prima = 0;
        if (numHijos == 1) {
            prima = 20;
        }
        if (numHijos == 2) {
            prima = 50;
        }
        if (numHijos > 2) {
            prima = 70 + (numHijos - 2) * 20;
        }
        return prima;
    }


static double calcularSalarioBruto(double nHoras,double tarifaHoraria) {
    double salarioBruto1, salarioBruto2, salarioBruto3 = 0;
    //calculo del salario bruto
    double horasT1,horasT2,horasT3;
    horasT1=169;
    horasT2=180-(nHoras-horasT1); //
    horasT3=nHoras-horasT2;

    salarioBruto1 = tarifaHoraria * 169;

    salarioBruto2 = (tarifaHoraria * 1.5) * (nHoras - 169);

    if (nHoras > 180){
        salarioBruto3 = (tarifaHoraria * 1.6) * (nHoras - 180);
    }
      return salarioBruto1+salarioBruto2+salarioBruto3;
}





}


