/**
 * @author Pedro José Bacab Pech
 * @Anahi del Rosario Dzul Can
 */

import java.util.Scanner;
public class VistaProducto {

    Scanner sc = new Scanner(System.in);

    public String pedirNombreP(){
        sc.nextLine();
        System.out.println("\nIngrese el nombre del prodcuto: ");
        return sc.nextLine();
    }

    public int pedirCategoria(){
        System.out.println("Ingrese el nombre de alguna de las siguiente categorías: ");
        System.out.println("[1]HERRAMIENTAS");
        System.out.println("[2]LADRILLOS");
        System.out.println("[3]POLVOS");
        System.out.println("[4]VITROPISOS");
        return sc.nextInt();
    }

    public int pedirPrecio(){
        System.out.println("Ingrese el precio del prodcuto: ");
        return sc.nextInt();
    }

    public String pedirDescripcion(){
        sc.nextLine();
        System.out.println("Ingrese la descripción del producto: ");
        return sc.nextLine();
    }

    public int pedirStock(){
        System.out.println("Ingrese el stock del producto ingresado: ");
        return sc.nextInt();
    }

    public int pedirCodigo(){
        System.out.println("Ingrese el código del producto: ");
        return sc.nextInt();
    }

    public int menuModificarProducto(){
        System.out.println("**********Bienvenido al menú de modificación de productos**********");
        System.out.println("Ingrese el número de la opción con la que desee trabajar");
        System.out.println("[1]Modificar nombre de un producto");
        System.out.println("[2]Modificar el precio de un producto");
        System.out.println("[3]Modificar la categoría de un producto");
        System.out.println("[4]Modificar el stock de un producto");
        System.out.println("[0]Salir del programa");
        return sc.nextInt();
    }

    public int menuProducto(){
        try {


            System.out.println("**********Bienvenido al menú de opciones de productos**********");
            System.out.println("Ingrese el número de la opción con la que desee trabajar");
            System.out.println("[1]Agregar un Producto");
            System.out.println("[2]Modificar un producto");
            System.out.println("[3]Borrar un producto");
            System.out.println("[0]Salir del programa");
            return sc.nextInt();
        }catch (Exception e){
            System.out.println("Excepción encontrada, se terminará el programa: "+ e);
            return 0;
        }
    }


}
