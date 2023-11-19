/**
 * @author Pedro Jose Bacab Pech
 * @author Anahi del Rosario Dzul Can
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class VistaGeneral {

    Scanner sc = new Scanner(System.in);

    public int menuGeneral(){
        try {
            System.out.println("**********Bienenvenido al sistema de Gestión de Materiales de construcción**********");
            System.out.println("Ingrese el número de la opción con la que desee trabajar");
            System.out.println("[1]Productos");
            System.out.println("[2]Clientes");
            System.out.println("[3]Proveedores");
            System.out.println("[0]Salir del programa");
            return sc.nextInt();
        }catch (Exception e){
            System.out.println("Excepción encontrada, se terminará el programa: "+ e);
            return 0;
        }

    }

}
