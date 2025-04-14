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
 * Ejemplo para 190 Horas
 * si nHoras>=169 y nHoras<=180
 *  primerTramo=(hHoras-169)*tarifaHoraria //21 *
 *  segundoTramo=((primerTramo)-(180-169))*tarifaHoraria*1.5 //21-11->10
 * si hHoras>180
 * tercerTramo=(primerTramo-segundoTramo)*tarifaHoraria*1.6 //21-10 ->11
 *
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
    // Variables de ejemplo (debes ajustar según tu implementación)
    double salarioBruto = 0.0;

// Calculando el salario bruto basado en tramos de horas trabajadas
    if (nHoras <= 168) {
        salarioBruto = nHoras * tarifaHoraria; // Menos de 169 horas
    } else if (nHoras <= 180) {
        // Entre 169 y 180 horas
        int horasNormales = 168;
        double horasExtra50 = nHoras - horasNormales;
        salarioBruto = horasNormales * tarifaHoraria + horasExtra50 * tarifaHoraria * 1.5;
    } else {
        // Más de 180 horas
        int horasNormales = 168;
        double horasExtra50 = 180 - horasNormales;
        double horasExtra60 = nHoras - 180;
        salarioBruto = horasNormales * tarifaHoraria + horasExtra50 * tarifaHoraria * 1.5 + horasExtra60 * tarifaHoraria * 1.6;
    }

// Mostrar el salario bruto
    return salarioBruto;
}





}


