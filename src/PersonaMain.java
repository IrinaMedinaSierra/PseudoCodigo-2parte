import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
       menu();
    }
    //Global->
    // se accede a los datos desde cualquier metodo/funcion para que todos los metodos puedan acceder a sus datos
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Persona> personas=new ArrayList<>();

    public static void menu() {
        int opcion=0;
        do {
            String opcionS = JOptionPane.showInputDialog(null, "Menu del CRUD \n 1. Crear Persona\n2. Modificar Persona\n3. Eliminar Persona\n4. Mostrar Persona \n5. Salir");
            try {
                //Cuando lees un String y lo quieres pasar entero/numerico.....
                opcion = Integer.parseInt(opcionS);
                switch (opcion) {
                    case 1 -> alta();
                    case 2,3-> eliminarModificarPersona(opcion);
                    case 4 -> JOptionPane.showMessageDialog(null,mostrar());
                    case 5 -> JOptionPane.showMessageDialog(null,"Se ha finalizado el programa");
                }
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            } while (opcion != 5) ;
    }

    public static void alta() {
        String nombre= solicitarTexto("nombre");
        String apellido=solicitarTexto("apellido");
        char sexo=solicitarTexto("sexo").charAt(0);
        String email=solicitarTexto("email");
        String direccion=solicitarTexto("direccion");
        String telefono=validarTelefono();
        //Lo ideal es que se validen.....
        Persona p=new Persona(nombre,apellido,sexo,telefono,email,direccion);
        personas.add(p);
        System.out.println("Alta correcta.....");
    }

    /** Crear los metodos de Eliminar/Modificar**/
    public static void eliminarModificarPersona(int opcion) {
        //1. Verificamos que existen personas en el ArrayList para poder Eliminar
        if (personas.size()>0) {
            boolean cambiadoEliminado=false;
            //Solicito el id de la persona mostrando todas las dada de alta, llamando el metodo mostrar()
            String idEliminar = JOptionPane.showInputDialog(null, "Indique el Id a Eliminar" + mostrar());
            try {
                //El JOptionPane lee un tipo texto (String) y el id es numerico, por lo que debo utilizar un try - catch para pasar ese dato y asegurar que no error
                int idElim = Integer.parseInt(idEliminar);
                //Se utiliza el Iterator para recorrer el ArrayList y poder hacer cambios dentro de el
                Iterator<Persona> it = personas.iterator();
                while (it.hasNext()) {
                    Persona p = it.next();
                    //se valida que el id del objeto persona que se instancia como p es igual al que ha indicado el usuario.
                    if (p.getIdPersona() == idElim) {
                        /** A partir de aqui es modificar**/
                        if(opcion==2){
                            String opcionModificar=JOptionPane.showInputDialog(null,"Indique la Opción a modificar \n1->Nombre \n2-> Apellido \n3-> Sexo\n4-> Dirección \n5-> Email \n6-> Teléfono");
                            switch (opcionModificar){
                                case "1"-> {
                                    String nombre=solicitarTexto("nombre");
                                    p.setNombre(nombre);
                                    cambiadoEliminado=true;
                                }
                                case "2"->{
                                    String apellido=solicitarTexto("apellido");
                                    p.setApellido(apellido);
                                    cambiadoEliminado=true;

                                }
                                case "3"->{
                                    String sexo=solicitarTexto("sexo");
                                    p.setSexo(sexo.charAt(0));
                                    cambiadoEliminado=true;
                                }
                                case "4"->{
                                    String direccion=solicitarTexto("direccion");
                                    p.setDireccion(direccion);
                                    cambiadoEliminado=true;
                                }
                                case "5"->{
                                    String email=solicitarTexto("email");
                                    p.setEmail(email);
                                       cambiadoEliminado=true;
                                }
                                case "6"->{
                                    String telefono=validarTelefono();
                                    p.setTelefono(telefono);
                                    cambiadoEliminado=true;
                                }
                                default -> JOptionPane.showMessageDialog(null, "Opcion no valida");
                            }

                        }
                        /** A partir de aqui es eliminar**/
                        if (opcion==3) {
                            //pedimos confirmación al usuario si esta seguro de borrar ese id
                            int confirmarEliminar = JOptionPane.showConfirmDialog(null, "Esta seguro de borrar el id " + idEliminar);
                            if (confirmarEliminar == JOptionPane.YES_OPTION) {
                                //mediante el iterator, se elimina ese objeto del ArrayList
                                it.remove();
                                cambiadoEliminado = true;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Indique el Id no valido");
            }
            if (!cambiadoEliminado) {
                JOptionPane.showMessageDialog(null,"No existe el id del personaa");
            }


        }else{
            JOptionPane.showMessageDialog(null, "No hay personas que eliminar");
        }
    }
    /**Lo ideal es solicitar los datos en metodos y pasarlos  */
    public static String solicitarTexto(String textoVariable) {
        String texto="";
        do {
            texto = JOptionPane.showInputDialog(null, "Ingrese el " + textoVariable );
        }while (texto.isEmpty());
        return texto;
    }


    public static String validarTelefono() {
        String telefono=solicitarTexto("telefono");
        boolean telefonoValido=false;
        do {
            if (telefono.length()==9) {
                char numeroI = telefono.charAt(0);
                if (numeroI != '6' && numeroI != '7' && numeroI != '8' && numeroI != '9') {
                    JOptionPane.showMessageDialog(null, "El telefono no es valido, debe comenzar por  6 ó 7 ó 8 ó 9");
                    telefono = solicitarTexto("telefono");
                } else {
                    telefonoValido = true;
                }
            }else{
                JOptionPane.showMessageDialog(null, "El telefono no es valido, debe tener 9 digitos");
                telefono = solicitarTexto("telefono");
            }
        }while (!telefonoValido);
        return telefono;
    }

    //Mostrar
    public static String mostrar() {
        String cadena="";
        for (Persona p : personas) {
            cadena += p.toString() + "\n";
        }
        if(cadena.isEmpty())
            cadena="No existe personas dadas de Alta";

        return cadena;
    }

}
