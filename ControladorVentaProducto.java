/**
 * @author Pedro José Bacab Pech
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ControladorVentaProducto implements Interfaz1{

    protected int cantidadP=0;
    protected int codigoP=0;
    protected float precioP=0;
    protected float precioDescuento=0;
    protected String nombreProducto;
    protected int frecuenciaC=0;
    protected String nombreCliente;
    protected String telefonoCliente;
    protected String fecha;
    protected int numeroDeVenta=0;
    protected float totalVenta=0;

    VistaVentaProducto vista = new VistaVentaProducto();
    Calendar calendar = new GregorianCalendar();

    /**
     * Constructor de la clase
     * @param cantidadP atributo que recibe a través de los métodos hechos en está misma clase
     * @param codigoP atributo que recibe a través de los métodos hechos en está misma clase
     * @param precioDescuento atributo que recibe a través de los métodos hechos en está misma clase
     * @param nombreProducto atributo que recibe a través de los métodos hechos en está misma clase
     * @param nombreCliente atributo que recibe a través de los métodos hechos en está misma clase
     * @param telefonoCliente atributo que recibe a través de los métodos hechos en está misma clase
     * @param totalVenta atributo que recibe a través de los métodos hechos en está misma clase
     */
    public ControladorVentaProducto(int cantidadP,
                                    int codigoP,
                                    float precioDescuento,
                                    String nombreProducto,
                                    String nombreCliente,
                                    String telefonoCliente,
                                    int totalVenta){
        this.cantidadP=cantidadP;
        this.codigoP=codigoP;
        this.precioDescuento=precioDescuento;
        this.nombreProducto=nombreProducto;
        this.nombreCliente=nombreCliente;
        this.telefonoCliente=telefonoCliente;
        this.totalVenta=totalVenta;
    }

    /**
     * Constructor por defecto para hacer uso del controlador sin asignarle aún sus atributos
     */
    public ControladorVentaProducto(){}

    /**
     * Método que se encarga de tomar la fecha actual y asignarla
     */
    public void crearFecha(){
        int dia=calendar.get(Calendar.DAY_OF_MONTH);
        int mes=calendar.get(Calendar.MONTH)+1;
        int anio=calendar.get(Calendar.YEAR);

        fecha=dia+"/"+mes+"/"+anio;
    }

    /**
     * Método que se encarga de realizar la venta de un producto, usando los demás métodos como parte de su estructura
     */
    public void venderProducto(){

        if(!compraProducto()) return;

        encontrarCliente();
        aplicarDescuentoCliente();
        crearFecha();

        numeroDeVenta=numeroDeVenta+1;

        Venta venta = new Venta(fecha,nombreProducto,cantidadP,precioP,nombreCliente,telefonoCliente,numeroDeVenta);
        Recibo recibo = new Recibo(cantidadP,codigoP, precioDescuento, nombreProducto, nombreCliente, telefonoCliente, totalVenta);
        vista.imprimirRecibo(recibo);
        listaVenta.add(venta);


        preguntarSeguirComprado();

    }

    /**
     * Método compra producto que se encarga de realizar la compra a través de búsqueda de código de articulos y del teléfono del cliente
     * @return Retorna un valor booleano, en este caso tru/false, cuando el código del producto ingresado no existe no se ejecutará
     * al igual que sirve para cuando no hay stock
     */
    public boolean compraProducto(){
        codigoP=vista.pedirCodigoProducto();
        boolean encontrado=false;

        //Encontrar el producto
        for(int i=0 ; i<listaProductos.size() ; i++){
            int b = listaProductos.get(i).getCodigo();

            if(codigoP==b){
                int c=listaProductos.get(i).getStock();
                cantidadP =vista.pedirCuantosProductos();

                int resta=c-cantidadP;

                listaProductos.get(i).setStock(resta);

                if(listaProductos.get(i).getStock()<=0){
                    vista.noExisteProducto();
                    return false;
                }

                if(listaProductos.get(i).getStock()<cantidadP){
                    vista.noHayProductosSuficientes();
                    return false;
                }

                if(listaProductos.get(i).getStock()<5){
                    vista.alertaStockBajo();
                }


                precioP=listaProductos.get(i).getPrecio();
                totalVenta=(float) (precioP*cantidadP);
                nombreProducto=listaProductos.get(i).getNombreProducto();

                encontrado=true;
                break;
            }
        }
        if(encontrado){
            return true;
        }else{
            vista.noExisteProducto();
            return false;
        }
    }

    /**
     * Método que sirve para la búsqueda del cliente para permitir saber que cliente está comprando
     */
    public void encontrarCliente(){
        String a=vista.pedirTelefonoCliente();
        boolean encontrado=false;

        for(int i=0 ; i<listaClientes.size() ; i++){
            String b = listaClientes.get(i).getTelefono();

            if(a.equals(b)){
                frecuenciaC=listaClientes.get(i).getFrecuencia()+1;

                nombreCliente=listaClientes.get(i).getNombre();
                telefonoCliente=listaClientes.get(i).getTelefono();
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteCliente();
        }
    }

    /**
     * Método que determina la frecuencia del cliente para determinar si aplica un descuento
     */
    public void aplicarDescuentoCliente(){
        if(frecuenciaC>10){
            //(float) convierte el resultado a un tipo de dato float.
            float descuento = (float) (totalVenta*0.1);
            precioDescuento=totalVenta-descuento;
            vista.Descuento();
        }else{
            precioDescuento=totalVenta;
        }

    }

    /**
     * Método que se ejecuta una vez que termine la compra para saber si quiere seguir comprando o no
     */
    public void preguntarSeguirComprado(){
        int opcion;
        do {

            opcion= vista.seguirComprado();

            switch(opcion) {
                case 1:venderProducto();
                    break;
                case 2:
                    break;
                default:
                    vista.opcionNoValida();
                    break;
            }

        }while(opcion != 2);
    }



}
