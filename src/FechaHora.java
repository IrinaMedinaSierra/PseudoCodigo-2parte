import javax.print.attribute.standard.JobSheets;
import javax.swing.*;
import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class FechaHora {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now(); //Instanciando una clase de tipo LocaDate
//        System.out.println(fecha);
//        LocalTime hora = LocalTime.now();
//        System.out.println(hora);
//        LocalDateTime fechaHora = LocalDateTime.now();
//        System.out.println(fechaHora);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Indica dia de Nacimiento");
//        int dia = sc.nextInt();
//        System.out.println("Indica  Mes de nacimiento");
//        int mes = sc.nextInt();
//        System.out.println("Indica  Año de nacimiento");
//        int aNac = sc.nextInt();
//        LocalDate fechaNac = LocalDate.of(aNac, mes, dia); //Formando de tres datos tipo int un dato tipo LocalDate
//        System.out.println("Tu fecha de nacimiento es-> " + fechaNac);
//
//        String fechaNacString = JOptionPane.showInputDialog(null, "Ingresa tu fecha de Nacimiento es-> AAAA-MM-DD");
//        //Pasar de tipo string a tipo LocalDate usando la palabra parse.....
//        fechaNac = LocalDate.parse(fechaNacString);
//        JOptionPane.showMessageDialog(null, "Tu fecha de nacimiento es-> " + fechaNac);
//        LocalDate sumar5Dias = LocalDate.now().plus(5, ChronoUnit.DAYS);
//        LocalDate sumar5Meses = LocalDate.now().plus(5, ChronoUnit.MONTHS);
//        LocalDate sumar5Anios = LocalDate.now().plus(5, ChronoUnit.YEARS);
//        JOptionPane.showMessageDialog(null, "La fecha de hoy + 5 dias es-> " + sumar5Dias +
//                "\n y + 5 Meses es " + sumar5Meses + "\n y + 5 Años es " + sumar5Anios);
//        //Restar entre fecha
//        LocalDate restar5Dias = LocalDate.now().minus(5, ChronoUnit.DAYS);
//        LocalDate restar5Meses = LocalDate.now().minus(5, ChronoUnit.MONTHS);
//        LocalDate restar5Anios = LocalDate.now().minus(5, ChronoUnit.YEARS);
//        JOptionPane.showMessageDialog(null, "La fecha de hoy - 5 dias es-> " + restar5Dias +
//                "\n y - 5 Meses es " + restar5Meses + "\n y - 5 Años es " + restar5Anios);

        //Se puede de una fecha extraer el dia, mes, el año....la hora....etc..
        //extraer de la fecha de hoy el mes
//        int mesActual=fecha.getMonthValue();
//        int diaActual=fecha.getDayOfMonth();
//        int anoActual=fecha.getYear();
 //       JOptionPane.showMessageDialog(null,"La fecha actual es "+diaActual +"/"+mesActual+"/"+anoActual);
//      FORMATEAR FECHA EN ESPAÑOL (LUNES...MARZO) -> Larga ej: Jueves, 24 de Abril de 2025...
        DateTimeFormatter formatoF = DateTimeFormatter.ofPattern("EEEE',' dd 'de' MMMM 'de' yyyy",new Locale("es","ES"));
     //FORMATO CORTO, ej-> 24-04-2025
        DateTimeFormatter formatoC= DateTimeFormatter.ofPattern("dd-MM-yyyy",new Locale("es","ES"));
//        JOptionPane.showMessageDialog(null,"Ahora la fecha con formato es \n" + formatoC.format(fecha));
//        JOptionPane.showMessageDialog(null,"La fecha larga es \n" + fecha.format(formatoF).toUpperCase());
        DateTimeFormatter formatoH= DateTimeFormatter.ofPattern("hh:mm:ss");
        JOptionPane.showMessageDialog(null,"La hora con formato es \n" + LocalDateTime.now().format(formatoH));

//        //2025 es año bisiesto???
//        if (fecha.isLeapYear()){
//            JOptionPane.showMessageDialog(null,"2025 es año bisiesto");
//        }else{
//            JOptionPane.showMessageDialog(null, "2025 no es bisiesto");
//        }
//
//        //Comparar dos fechas e indicar si es antes o despues...
//        LocalDate otraFecha= LocalDate.of(2030,06,15);
//        if (fecha.isAfter(otraFecha)){//es fecha despues de otraFecha---> falso
//            JOptionPane.showMessageDialog(null,fecha.format(formatoC)+" es despues de " + otraFecha.format(formatoC));
//        }else{
//            JOptionPane.showMessageDialog(null,otraFecha.format(formatoC)+" es despues de " + fecha.format(formatoC));
//        }
//        if (fecha.isBefore(otraFecha)){//es fecha antes de otraFecha---> verdadero
//            JOptionPane.showMessageDialog(null,fecha.format(formatoC)+" es antes de " + otraFecha.format(formatoC));
//        }else{
//            JOptionPane.showMessageDialog(null,otraFecha.format(formatoC)+" es antes de " + fecha.format(formatoC));
//        }

        //Calcular fechas -> Period
//        Period p=LocalDate.parse("1971-11-13").until(fecha);
//        int dia=p.getDays();
//        int mes=p.getMonths();
//        int anio=p.getYears();
//        JOptionPane.showMessageDialog(null,"Tu edad al dia de hoy es -> " + dia + " dias " + mes + " mes " + anio   + " años"  );
//        LocalDate fechaEjemplo = LocalDate.of(1987,5,10);
//        JOptionPane.showMessageDialog(null,"Fecha Ejemplo-> " + fechaEjemplo.format(formatoF).toUpperCase());
//        try {
//            String fechaSolicitada = JOptionPane.showInputDialog(null, "Indique la fecha DD-MM-YYYY");
//            LocalDate fechaSolicitadaLD = LocalDate.parse(fechaSolicitada, formatoC);
//            JOptionPane.showMessageDialog(null, "La fecha ingresada es: " + fechaSolicitadaLD.format(formatoF));
//        }catch (Exception e){
//            JOptionPane.showMessageDialog(null,"El formato de la  fecha ingresada no es correcta-> DD-MM-YYYY");
//        }

        //Si se desea pasar los datos de una fecha y hora por partes...seria LocalDateTime(año,mes,dia,hora,minutos,seguntos)
        LocalDateTime tiempoCompleto=LocalDateTime.of(2025,4,24,12,28,5);
        DateTimeFormatter formatoTC = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        JOptionPane.showMessageDialog(null,tiempoCompleto.format(formatoTC));

        /*
        * Imagina que debes comunicar al usuario que tiene 15 dias naturales para recurrir un notificación electrónica a partir del dia siguiente de notificacion...(mañana),
        * */
        JOptionPane.showMessageDialog(null,"A partir del siguiente dia de notificacion ("+fecha.plus(1,ChronoUnit.DAYS).format(formatoC)+") tienes 15 dias naturales para rescurrir. El fin del periodo es " + fecha.plus(16,ChronoUnit.DAYS).format(formatoC) );
        //tengo una fecha...dia es sabado o domingo....Calendar....
        Calendar calendar = Calendar.getInstance();







    }
}