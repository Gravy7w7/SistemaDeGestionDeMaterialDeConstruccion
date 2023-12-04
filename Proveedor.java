import java.io.Serializable;

/**
 * Clase proveedores
 * @author Anahi del Rosario Dzul Can
 * @author Pedro José Bacab Pech
 */
public class Proveedor implements Serializable {
    private String NombreProveedores;
    private String Telefono;
    private String NombreProducto;
    private int PrecioMayoreo;
    private int Cantidad;

    /**
     * Constructor de la clase
     * @param NombreProveedores recibido por el programador
     * @param Telefono recibido por el programador
     * @param NombreProducto recibido por el programador
     * @param PrecioMayoreo recibido por el programador
     * @param Cantidad recibido por el programador
     */
    public Proveedor(String NombreProveedores, String Telefono, String NombreProducto, int PrecioMayoreo, int Cantidad){
        this.NombreProveedores = NombreProveedores;
        this.Telefono = Telefono;
        this.NombreProducto = NombreProducto;
        this.PrecioMayoreo = PrecioMayoreo;
        this.Cantidad = Cantidad;
    }

    public String getNombreProveedores() {
        return NombreProveedores;
    }

    public void setNombreProveedores(String nombreProveedores) {
        NombreProveedores = nombreProveedores;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public int getPrecioMayoreo() {
        return PrecioMayoreo;
    }

    public void setPrecioMayoreo(int precioMayoreo) {
        PrecioMayoreo = precioMayoreo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    /**
     * Método toString para imprimir las variables
     * @return los valores asignados
     *
     */
    public String toString(){
        return
                "\nNombre: "+NombreProveedores
                +"\nTeléfono: "+Telefono
                +"\nNombre del producto: "+NombreProducto
                + "\nPrecio: "+PrecioMayoreo
                +"\nCantidad: "+Cantidad;
    }
}
