import java.util.Scanner;

public class VistaProveedor {

    Scanner sc = new Scanner(System.in);

    /**
     * Metodo para pedir el nombre que regresa un String
     * @return sc.nexLine(); Lo que el usuario escriba en la siguiente linea
     */
    public String pedirNombreProveedor(){
        sc.nextLine();
        System.out.println("\nIngrese el nombre del proveedor: ");
        return sc.nextLine();
    }
    public String pedirTelefonoProveedor(){
        sc.nextLine();
        System.out.println("\nIngrese el télefono del proveedor: ");
        return sc.nextLine();
    }

    public String pedirNombreProducto(){
        sc.nextLine();
        System.out.println("\nIngrese el nombre del producto: ");
        return sc.nextLine();
    }

    /**
     * Metodo para pedir el precio del producto
     * @return sc.nextInt(); Lo que el usuario escriba en la siguiente linea
     */
    public int pedirPrecioMayoreo(){
        System.out.println("Ingrese el precio del prodcuto: ");
        return sc.nextInt();
    }

    /**
     * Metodo para pedir la cantidad de los productos
     * @return sc.nextInt(); Lo que el usuario escriba en la siguiente linea
     */
    public int pedirCantidad(){
        System.out.println("Ingrese el stock del producto ingresado: ");
        return sc.nextInt();
    }
    /**
     * Metodo que muestra el menu para la modificación de un proveedor existente
     * @return sc.nextInt(); Lo que el usuario escriba en la siguiente linea
     */
    public int menuModificarProveedor(){
        System.out.println("**********Bienvenido al menú de modificación de proveedores**********");
        System.out.println("Ingrese el número de la opción con la que desee trabajar");
        System.out.println("[1]Modificar nombre de un proveedor");
        System.out.println("[2]Modificar el télefono de un proveedor");
        System.out.println("[3]Modificar el nombre del producto");
        System.out.println("[4]Modificar el precio de un producto");
        System.out.println("[5]Modificar la cantidad de un producto");
        System.out.println("[0]Volver al menú de proveedor");
        return sc.nextInt();
    }
    /**
     * Metodo que muestra el menú para las opciones del producto
     * @return sc.nextInt(); Lo que el usuario escriba en la siguiente linea
     */
    public int menuProveedor(){
        try {


            System.out.println("**********Bienvenido al menú de opciones de proveedores**********");
            System.out.println("Ingrese el número de la opción con la que desee trabajar");
            System.out.println("[1]Agregar un proveedor");
            System.out.println("[2]Modificar un proveedor");
            System.out.println("[3]Borrar un proveedor");
            System.out.println("[4]Buscar un proveedor");
            System.out.println("[0]Regresar al menú principal");
            return sc.nextInt();
        }catch (Exception e){
            System.out.println("Excepción encontrada, se terminará el programa: "+ e);
            return 0;
        }
    }

    /**
     * Metodo que se ejecuta en caso de que el proveedor no exista o el télofono este incorrecto
     */
    public void noExisteProveedor(){
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
     * Método que se encargar de avisar que el proveedor ha sido agregado de forma correcta
     */
    public void agregadoConExito(){
        System.out.println("Producto agregado con éxito :)");
    }

    /**
     * Método que se encargar de avisar que el proveedor ha sido borrado de manera correcta
     */
    public void borradoConExito(){
        System.out.println("Borrado con éxito.");
    }

    /**
     * Método que se encarga de avisar que el proveedor ha sido modificado con éxito
     */
    public void modificadoConExito(){
        System.out.println("Modificado con éxito");
    }


}
