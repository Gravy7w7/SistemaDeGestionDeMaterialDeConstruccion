/**
 * @author Pedro José Bacab Pech
 */

import java.util.Scanner;

public class VistaVentaProducto {

    /**
     * Inicialización del Scanner
     */
    Scanner sc = new Scanner(System.in);

    /**
     * Método que se encarga de pedir el código del producto
     * @return lo que escriba el usuario en la siguiente linea
     */
    public int pedirCodigoProducto(){
        System.out.println("Ingrese el código del producto: ");
        return sc.nextInt();
    }

    /**
     *  Método que se encarga de pedir la cantidad de Productos
     * @return lo que escriba el usuario en la siguiente linea
     */
    public int pedirCuantosProductos(){
        System.out.println("Ingrese la cantidad de estos productos");
        return sc.nextInt();
    }

    /**
     * Método que se encarga de pedir el télefono del Cliente
     * @return lo que el usuario escriba en la siguiente linea
     */
    public String pedirTelefonoCliente(){
        sc.nextLine();
        System.out.println("Ingrese el número del cliente: ");
        return sc.nextLine();
    }

    /**
     * Método que se encarga de avisar que se aplicó el descuento
     */
    public void Descuento(){
        System.out.println("Se aplicó descuento.");
    }

    /**
     * Método que se encarga de avisar que el código del producto no existe
     */
    public void noExisteProducto(){
        System.out.println("No esxiste producto con ese código.");
    }

    /**
     * Método que se encarga de avisar que no existe un cliente con el número proporcionado
     */
    public void noExisteCliente(){
        System.out.println("No existe un cliente con ese número.");
    }

    /**
     * Método que se encarga de imprimir el recibo cuando la venta se ha ejecuta en el caso de que el producto exista/Stock disponible
     * @param recibo Objeto que recibe del controlador para poder imprimirlo
     */
    public void imprimirRecibo(Recibo recibo){
        System.out.println("**********Recibo de compra**********");
        System.out.println(recibo);
    }

    /**
     * Método que se encarga de preguntar si se desea seguir comprando
     * @return lo que se escriba en la siguiente linea
     */
    public int seguirComprado(){
        System.out.println("¿Deseas seguir comprado?");
        System.out.println("[1]Si");
        System.out.println("[2]No");
        return sc.nextInt();
    }

    /**
     * Metodo que se encarga de avisar que no hay productos suficientes para realizar la venta
     */
    public void noHayProductosSuficientes(){
        System.out.println("No hay productos suficientes para realizar la compra, intente de nuevo.");
    }

    /**
     * Método que se encarga de avisar que no hay stock del producto
     */
    public void noHayProducto(){
        System.out.println("No tenemos este producto en existencia.");
    }

    /**
     * Método que se encarga de avisar que la opción seleccionada no es válida
     */
    public void opcionNoValida(){
        System.out.println("Opción no válida, intenta de nuevo.");
    }

    /**
     * Método que se encarga de avisar cuando el stock es bajo
     */
    public void alertaStockBajo(){
        System.out.println("¡Stock bajo!");
    }

}
