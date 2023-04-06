
package ernestovargasexamen2;

import java.util.ArrayList;

/**
 *
 * @author ervargas
 */
public class ClsEncuesta {

    // se crean arraylist para almacenar los datos de las encuestas
    private static ArrayList<String> nombre = new ArrayList<>();
    private static ArrayList<Integer> edad = new ArrayList<>();
    private static ArrayList<String> email = new ArrayList<>();
    
    //constructor
    public ClsEncuesta() {
        nombre.clear();
        edad.clear();
        email.clear();
    }

    //metodos get y set
    public static ArrayList<String> getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        ClsEncuesta.nombre.add(nombre);
    }

    public static ArrayList<Integer> getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        ClsEncuesta.edad.add(edad);
    }

    public static ArrayList<String> getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        ClsEncuesta.email.add(email);
    }

    //metodo para calcular la cantidad de encuestas
    public static int cantidadEncuestas() {
        return nombre.size();
    }

    //metodo para saber si la edad es entre 18 y 50 si es mayor a 50 o menor a 18 debe arrojar un mensaje por JOptionPane
    public static String edad(int edad) {
        if (edad >= 18 && edad <= 50) {
            return "La edad esta entre 18 y 50";
        } else if (edad > 50) {
            return "La edad es mayor a 50";
        } else {
            return "La edad es menor a 18";
        }
    }
        
}
