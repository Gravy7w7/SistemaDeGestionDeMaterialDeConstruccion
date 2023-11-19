/**
 * Clase proveedores
 * @author Anahi del Rosario Dzul Can
 */
public class Proveedores {
    private String NombreProveedores;
    private int Telefono;
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
    public Proveedores(String NombreProveedores, int Telefono, String NombreProducto, int PrecioMayoreo, int Cantidad){
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

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
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

}
