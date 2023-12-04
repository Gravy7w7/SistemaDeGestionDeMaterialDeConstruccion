/**
 * @author Pedro José Bacab Pech
 * @author Hermilo Eduardo Broca Sanchez
 */
public class Recibo extends ControladorVentaProducto {

    /*public Recibo(int cantidadP,
                  int codigoP,
                  float precioDescuento,
                  String nombreProducto,
                  String nombreCliente,
                  String telefonoCliente,
                  int totalVenta){
        super(cantidadP, codigoP, precioDescuento, nombreProducto, nombreCliente, telefonoCliente, totalVenta);
    }*/

    public Recibo(int cantidadP,
                  int codigoP,
                  float precioDescuento,
                  String nombreProducto,
                  String nombreCliente,
                  String telefonoCliente,
                  float totalVenta){
        super(cantidadP, codigoP, precioDescuento, nombreProducto, nombreCliente, telefonoCliente, (int)totalVenta);
    }

    public String toString(){
        return "\nNombre: "+nombreCliente
                +"\nTeléfono: "+telefonoCliente
                +"\nProducto: "+nombreProducto
                +"\nCantidad: "+cantidadP
                +"\nPrecio: "+totalVenta
                +"\nTotal: "+precioDescuento;
    }
}
