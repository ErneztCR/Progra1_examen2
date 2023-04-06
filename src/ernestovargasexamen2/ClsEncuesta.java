
package ernestovargasexamen2;

/**
 *
 * @author ervargas
 */
public class ClsEncuesta {

    //atributos
    private int numEncuesta;
    private String nombre;
    private int edad;
    private String email;
    private boolean vehiculoPropio;

    //constructor
    public ClsEncuesta(int numEncuesta, String nombre, int edad, String email, boolean vehiculoPropio) {
        this.numEncuesta = numEncuesta;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.vehiculoPropio = vehiculoPropio;
    }

    //getters y setters
    public int getNumEncuesta() {
        return numEncuesta;
    }

    public void setNumEncuesta(int numEncuesta) {
        this.numEncuesta = numEncuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVehiculoPropio() {
        return vehiculoPropio;
    }

    public void setVehiculoPropio(boolean vehiculoPropio) {
        this.vehiculoPropio = vehiculoPropio;
    }

    //toString
    @Override

    public String toString() {
        return "Encuesta{" + "numEncuesta=" + numEncuesta + ", nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", vehiculoPropio=" + vehiculoPropio + '}';
    }
        
}
