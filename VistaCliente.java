/**
 * @author Anahi del Rosario Dzul Can
 */

import java.util.Scanner;

public class VistaCliente{

    /**
     * Creación del scanner para obtener los datos de cada vista
     */
    Scanner sc = new Scanner(System.in);

    /**
     * Imprime menu clientes
     * @return nos regresa la opcion elegida
     */
    public int menuCliente(){
        try{
            System.out.println("\n**************** Bienvenido al menú de Clientes ***************");
            System.out.println("Ingrese la opcion que desee elegir: ");
            System.out.println("[1]Agregar Cliente");
            System.out.println("[2]Modificar Datos del Cliente");
            System.out.println("[3]Borrar Cliente");
            System.out.println("[4]Modificar dirección");
            System.out.println("[0]Volver al menú principal");
            return sc.nextInt();
        }catch (Exception e){
            System.out.println("Excepción encontrada, se terminará el programa: "+e);
            return 0;
        }
    }

    /**
     * imprime que el cliente no esta registrado en los datos de la sucursal
     */
    public void ClienteNoRegistrado(){
        System.out.println("El cliente no esta registrado en la sucursal");
    }

    /**
     * Metodo para pedir el nombre del cliente
     * @return nombre del cliente ingresado en la siguiente linea
     */
    public String pedirNombre(){
        sc.nextLine();
        System.out.println("Ingrese el nombre del cliente: ");
        return sc.nextLine();
    }

    /**
     * Metodo para pedir el apellido del cliente
     * @return apellido del cliente ingresado en la siguiente linea
     */
    public String pedirApellido(){
        sc.nextLine();
        System.out.println("Ingrese el apellido del cliente: ");
        return sc.nextLine();
    }

    /**
     * Metodo para pedir el telefono del cliente
     * @return el numero telefonico del cliente capturado en la linea siguiente
     */
    public String pedirTelefono(){
        System.out.println("Ingrese el numero de telefono del cliente: ");
        sc.nextLine();
        return sc.nextLine();
    }

    /**
     * Metodo para pedir la calle del cliente
     * @return el numero de la calle del cliente
     */
    public String pedirCalle(){
        System.out.println("Calle: ");
        sc.nextLine();
        return sc.nextLine();
    }

    /**
     * Metodo para pedir lo9s cruzamientos de la calle del cliente
     * @return los cruzamientos del cliente
     */
    public String pedirCruzamientos(){
        sc.nextLine();
        System.out.println("Cruzamientos");
        return sc.nextLine();
    }

    /**
     * Metodo para pedir el numero de casa del cliente
     * @return El numero de casa del cliente escrita en la siguiente linea
     */
    public String pedirnumeroCasa(){
        sc.nextLine();
        System.out.println("Ingrese el numero de casa de el cliente: ");
        return sc.nextLine();
    }

    /**
     * Metodo para pedir la colonia del cliente
     * @return la colonia del cliente ingresada en la siguiente linea
     */
    public String pedirColonia(){
        sc.nextLine();
        System.out.println("Ingrese la colonia del cliente: ");
        return sc.nextLine();
    }

    public String pedirCiudad(){
        sc.nextLine();
        System.out.println("Cuidad de reciedencia del cliente: ");
        return sc.nextLine();
    }

    /**
     * metodo para pedir las referencias de la casa del cliente
     * @return referencias escritas en la sigueinte linea
     */
    public String pedirReferencia(){
        sc.nextLine();
        System.out.println("Referencias: ");
        return sc.nextLine();
    }

    /**
     * Imrime mensaje de modificacion exitosa
     */
    public void nombreModificado(){
        System.out.println("Nombre modificado con exito");
    }

    /**
     * Imprime mensaje de telefono registrado, aplica para primer registro y modificacion.
     */
    public void telefonoNoRegistrado(){
        System.out.println("Este telefono no se encuentra registrado en la sucursal");
    }

    /**
     * Imprime el menu de las opciones del cliente
     * @return un numero que nos dira la opcion elegida
     */
    public int menuModificarCliente(){
        System.out.println("\n********* Menú de Modificación a Datos del Cliente **************** ");
        System.out.println("Seleccione la opcion con la que desee trabajar");
        System.out.println("[1]Modificar Nombre del cliente");
        System.out.println("[2] Modificar el apellido del cliente ");
        System.out.println("[3] Modificar el telefono del cliente ");
        System.out.println("[4] Menú para modificar dirección del cliente");
        System.out.println("[0] Volver al menú Cliente");
        return sc.nextInt();
    }


    /**
     * Imprime el menú  para modificar la informacion acerca de la direccion del cliente.
     * @return numero con la opcion seleccionada
     */
    public int menuModificarDireccion() {
        System.out.println("\n******** Menú de modificación a la Dircción del cliente *******");
        System.out.println("[1] Modificar calle");
        System.out.println("[2] Modificar Cruzamientos");
        System.out.println("[3] Modificar Numero de casa");
        System.out.println("[4] Modificar Colonia");
        System.out.println("[5] Modificar Cuidad");
        System.out.println("[6] Modificar Referencias del cliente ");
        System.out.println("[0] Volver al Menú cliente");
        return sc.nextInt();
    }


    /**
     * opcion no valida en el menú
     */
    public void opcionNoValida(){
        System.out.println("Opción no válida, intenta de nuevo.");
    }

    /**
     * Imprime orden de volver al menú principal
     */
    public void volverAMenuPrincipal(){
        System.out.println("Volviendo al menú principal.");
    }

    /**
     * Imprime Si el cliente se borro de la lista
     */
    public void BorrarCliente(){
        System.out.println("Cliente Borrado con exito.");
    }

    /**
     * Imprime que el numero telefonico se actualizo con exito
     */
    public void nuevoTelefono(){
        System.out.println("Telefono actualizado con exito.");
    }

    /**
     * Imprime la opcion generalizada para hacer alguna actualización
     */
    public void ActualizacionCorrecta(){
        System.out.println("Actualización realizada...");
    }



}
