/**
 * @author Pedro José Bacab Pech
 */

import java.io.Serializable;

public class Venta implements Serializable {

    private String fecha;
    private String nombreProducto;
    private int cantidadProducto;
    private float precioProducto;
    private String nombreCliente;
    private String telefonoCliente;
    private int numeroDeVenta;

    /**
     * Constructor de la Clase Venta que recibe sus atributos de ControladorVentaProducto
     * @param fecha atributo que recibe a través del ControladorVentaProducto
     * @param nombreProducto atributo que recibe a través del ControladorVentaProducto
     * @param cantidadProducto atributo que recibe a través del ControladorVentaProducto
     * @param precioProducto atributo que recibe a través del ControladorVentaProducto
     * @param nombreCliente atributo que recibe a través del ControladorVentaProducto
     * @param telefonoCliente atributo que recibe a través del ControladorVentaProducto
     * @param numeroDeVenta atributo que recibe a través del ControladorVentaProducto
     */
    public Venta(String fecha, String nombreProducto, int cantidadProducto, float precioProducto, String nombreCliente, String telefonoCliente,int numeroDeVenta){
        this.fecha=fecha;
        this.nombreProducto=nombreProducto;
        this.cantidadProducto=cantidadProducto;
        this.precioProducto=precioProducto;
        this.nombreCliente=nombreCliente;
        this.telefonoCliente=telefonoCliente;
        this.numeroDeVenta=numeroDeVenta;
    }

    //getter y setter

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public void setNumeroDeVenta(int numeroDeVenta) {
        this.numeroDeVenta = numeroDeVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public int getNumeroDeVenta() {
        return numeroDeVenta;
    }

    /**
     * Metodo toString que sirve en caso de imprimir el objeto
     * @return returna la cadena asignada
     */
    public String toString(){
        return
                "\nFecha: "+fecha
                +"\nNombre del producto: "+nombreProducto
                +"\nCantidad: "+cantidadProducto
                +"\nPrecio: "+precioProducto
                +"\nCliente: "+nombreCliente
                +"\nTelefono: "+telefonoCliente
                +"\nNumero de venta: "+numeroDeVenta;
    }
}
