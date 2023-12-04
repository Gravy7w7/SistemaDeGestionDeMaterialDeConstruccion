/**
 * @author Anahi del Rosario Dzul Can
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class VistaGeneral {

    Scanner sc = new Scanner(System.in);

    /**
     * Método que ejecuta el menú general para obtener la opción en consola, con una excepción
     * @return regresa un entero que es lo que el usuario escribirá para seleccionar la opción
     */
    public int menuGeneral(){
        try {
            System.out.println("**********Bienenvenido al sistema de Gestión de Materiales de construcción**********");
            System.out.println("Ingrese el número de la opción con la que desee trabajar");
            System.out.println("[1]Productos");
            System.out.println("[2]Clientes");
            System.out.println("[3]Proveedores");
            System.out.println("[4]VentaProducto");
            System.out.println("[5]Registro de ventas");
            System.out.println("[0]Salir del programa");
            return sc.nextInt();
        }catch (Exception e){
            System.out.println("Excepción encontrada, se terminará el programa: "+ e);
            return 0;
        }

    }

    /**
     * Método que imprime en caso de que la opción ingresada no sea válida
     */
    public void opcionNoValida(){
        System.out.println("Opción no válida, intenta de nuevo.");
    }

    /**
     * Método que imprime un texto al seleccionar salir del programa
     */
    public void saliendoDelPrograma(){
        System.out.println("Saliendo del programa, hasta luego! :)");
    }

    /**
     * Metodo que pide el número de venta que desea ser consultada
     * @return regresa un entero que es lo que el usuario escribirá para buscar la venta
     */
    public int ingreseNumeroDeVenta(){
        System.out.println("Ingrese el número de venta que desea consultar");
        return sc.nextInt();
    }

    /**
     * Método que imprime el mensaje en caso de que el número ingresado para buscar venta no sea valido
     */
    public void noExisteVenta(){
        System.out.println("No existe el número de venta ingresado");
    }

}
