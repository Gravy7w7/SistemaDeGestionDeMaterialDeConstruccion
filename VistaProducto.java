/**
 * @author Pedro José Bacab Pech
 * @author Anahi del Rosario Dzul Can
 */

import java.util.Scanner;
public class VistaProducto {

    Scanner sc = new Scanner(System.in);

    /**
     * Metodo para pedir el nombre que regresa un String
     * @return sc.nexLine(); Lo que el usuario escriba en la siguiente linea
     */
    public String pedirNombreP(){
        sc.nextLine();
        System.out.println("\nIngrese el nombre del prodcuto: ");
        return sc.nextLine();
    }

    /**
     * Metodo para seleccionar la categoria del producto
     * @return sc.nextInt(); Lo que el usuario escriba en la siguiente linea
     */
    public int pedirCategoria(){
        System.out.println("Ingrese el numero de alguna de las siguiente categorías: ");
        System.out.println("[1]HERRAMIENTAS");
        System.out.println("[2]LADRILLOS");
        System.out.println("[3]POLVOS");
        System.out.println("[4]VITROPISOS");
        return sc.nextInt();
    }

    /**
     * Metodo para pedir el precio del producto
     * @return sc.nextInt(); Lo que el usuario escriba en la siguiente linea
     */
    public int pedirPrecio(){
        System.out.println("Ingrese el precio del prodcuto: ");
        return sc.nextInt();
    }
    /**
     * Metodo para pedir la descripción del producto
     * @return sc.nextLine(); Lo que el usuario escriba en la siguiente linea
     */
    public String pedirDescripcion(){
        sc.nextLine();
        System.out.println("Ingrese la descripción del producto: ");
        return sc.nextLine();
    }
    /**
     * Metodo para pedir la cantidad del producto
     * @return sc.nextInt(); Lo que el usuario escriba en la siguiente linea
     */
    public int pedirStock(){
        System.out.println("Ingrese el stock del producto ingresado: ");
        return sc.nextInt();
    }
    /**
     * Metodo para pedir el código de identificación del producto
     * @return sc.nextInt(); Lo que el usuario escriba en la siguiente linea
     */
    public int pedirCodigo(){
        System.out.println("Ingrese el código del producto: ");
        return sc.nextInt();
    }
    /**
     * Metodo que muestra el menu para la modificación de un producto existente
     * @return sc.nextInt(); Lo que el usuario escriba en la siguiente linea
     */
    public int menuModificarProducto(){
        System.out.println("**********Bienvenido al menú de modificación de productos**********");
        System.out.println("Ingrese el número de la opción con la que desee trabajar");
        System.out.println("[1]Modificar nombre de un producto");
        System.out.println("[2]Modificar el precio de un producto");
        System.out.println("[3]Modificar la categoría de un producto");
        System.out.println("[4]Modificar el stock de un producto");
        System.out.println("[0]Volver al menú de producto");
        return sc.nextInt();
    }
    /**
     * Metodo que muestra el menú para las opciones del producto
     * @return sc.nextInt(); Lo que el usuario escriba en la siguiente linea
     */
    public int menuProducto(){
        try {


            System.out.println("**********Bienvenido al menú de opciones de productos**********");
            System.out.println("Ingrese el número de la opción con la que desee trabajar");
            System.out.println("[1]Agregar un Producto");
            System.out.println("[2]Modificar un producto");
            System.out.println("[3]Borrar un producto");
            System.out.println("[4]Buscar un producto");
            System.out.println("[0]Regresar al menú principal");
            return sc.nextInt();
        }catch (Exception e){
            System.out.println("Excepción encontrada, se terminará el programa: "+ e);
            return 0;
        }
    }

    /**
     * Metodo que se ejecuta en caso de que el producto no exista o el código este incorrecto
     */
    public void noExisteProducto(){
        System.out.println("No existe producto con ese código.");
    }

    /**
     * Método que imprime que la opción ingresada no es válida
     */
    public void opcionNoValida(){
        System.out.println("Opción no válida, intenta de nuevo.");
    }

    /**
     * Método que se encarga de avisar que estás regresando al menú principal
     */
    public void volviendoMenuPrincipal(){
        System.out.println("Volviendo al menú princiapl.");
    }

    /**
     * Método que se encargar de avisar que el producto ha sido agregado de forma correcta
     */
    public void agregadoConExito(){
        System.out.println("Producto agregado con éxito :)");
    }

    /**
     * Método que se encargar de avisar que el producto ha sido borrado de manera correcta
     */
    public void borradoConExito(){
        System.out.println("Borrado con éxito.");
    }

    /**
     * Método que se encarga de avisar que el producto ha sido modificado con éxito
     */
    public void modificadoConExito(){
        System.out.println("Modificado con éxito");
    }

}
