import java.io.Serializable;

/**
 * Clase Cliente
 * @author Anahi del Rosario Dzul Can
 */
public class Cliente implements Serializable {
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected int frecuencia;
    protected Direccion direccion;

    /**
     * Constructor
     *
     * @param nombre     que recibe de Controlador
     * @param apellido   que recive de Controlador
     * @param telefono   que recibe de Controlador
     * @param frecuencia que recibe de Controlador
     */
    public Cliente(String nombre,String apellido , String telefono, int frecuencia, Direccion direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.frecuencia=frecuencia;
        this.direccion=direccion;
    }

    //getter y setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {return apellido;}

    public String getTelefono() {
        return telefono;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Metodo ToString para imprimir los datos del cliente
     * @return los valores asignados respectivamente
     */
    public String toString(){
        return "\n*****Cliente*****"
                +"\nCliente: "+nombre
                +"\nTelefono"+telefono
                +"\nDireccion: "+direccion
                +"\nFrecuencia: "+frecuencia;
    }
}
