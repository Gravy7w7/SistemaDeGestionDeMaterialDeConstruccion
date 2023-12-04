/**
 * @author Anahi del Rosario Dzul Can
 */
public class ControladorCliente implements Interfaz1{

    /***
     * Creamos la vista
     */
    VistaCliente vista = new VistaCliente();

    /**
     * Creamos el menú de opciones a elegir para el menu de clientes
     */
    public void menuCliente() {
        int opcion;

        do {
            opcion = vista.menuCliente();

            switch (opcion) {
                case 1:
                    AgregarCliente();
                    break;
                case 2:
                    menuModificarCliente();
                    break;
                case 3:
                    BorrarCliente();
                    break;
                case 4:
                    menuModificarDireccion();
                    break;
                case 0:
                    vista.volverAMenuPrincipal();
                    break;
                default:
                    vista.opcionNoValida();
                    break;
            }
        } while (opcion != 0);
    }


    /**
     * Metodo para agregar al cliente a la lista
     */
    public void AgregarCliente() {
        int frecuencia = 0;

        Direccion direccion = new Direccion(
                vista.pedirCalle(),
                vista.pedirCruzamientos(),
                vista.pedirnumeroCasa(),
                vista.pedirColonia(),
                vista.pedirCiudad(),
                vista.pedirReferencia()
        );

        Cliente obj1 = new Cliente(
                vista.pedirNombre(),
                vista.pedirApellido(),
                vista.pedirTelefono(),
                frecuencia,
                direccion);

    }

    /**
     * Metodo que busca y elimina al cliente elegido de la lista
     */
    public void BorrarCliente() {
        String a = vista.pedirTelefono();
        boolean encontrado = false;

        for (int i = 0; i < listaClientes.size(); i++) {
            String b = listaClientes.get(i).getTelefono();

            if (a.equals(b)) {
                listaClientes.remove(i);
                vista.BorrarCliente();
                encontrado=true;
                break;
            }
        }
        if (!encontrado) {
            vista.ClienteNoRegistrado();
        }
    }

    /**
     * Menú de opciones para modificar datos especificos del cliente
     */
    public void menuModificarCliente() {
        int opcion;
        do {
            opcion = vista.menuModificarCliente();

            switch (opcion) {
                case 1:
                    modificarNombre();
                    break;
                case 2:
                    modificarApellido();
                    break;
                case 3:
                    modificarTelefono();
                    break;
                case 4: menuModificarDireccion();
                    break;
                case 0:
                    menuCliente();
                    break;
                default:
                    vista.opcionNoValida();
                    break;
            }
        } while (opcion != 0);
    }


    /**
     * Metodo para buscar y modificar el nombre del cliente emn la lista
     */
    public void modificarNombre() {
        String a = vista.pedirTelefono();
        boolean encontrado = false;

        for (int i = 0; i < listaClientes.size(); i++) {
            String b = listaClientes.get(i).getTelefono();

            if (a.equals(b)) {
                listaClientes.get(i).setNombre(vista.pedirNombre());
                vista.ActualizacionCorrecta();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            vista.ClienteNoRegistrado();
        }
    }


    /**
     * Metodo para buscar y modificar el apellido del cliente en la lista
     */
    public void modificarApellido() {
        String a = vista.pedirTelefono();
        boolean encontrado = false;

        for (int i = 0; i < listaClientes.size(); i++) {
            String b = listaClientes.get(i).getTelefono();

            if (a.equals(b)) {
                listaClientes.get(i).setNombre(vista.pedirApellido());
                vista.ActualizacionCorrecta();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            vista.ClienteNoRegistrado();
        }
    }


    /**
     * Metodo para buscar y modificar el telefono del cliente
     */
    public void modificarTelefono() {
        String a = vista.pedirTelefono();
        boolean encontrado = false;

        for (int i = 0; i < listaClientes.size(); i++) {
            String b = listaClientes.get(i).getTelefono();

            if (a.equals(b)) {
                listaClientes.get(i).setNombre(vista.pedirTelefono());
                vista.nuevoTelefono();
                vista.ActualizacionCorrecta();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            vista.ClienteNoRegistrado();
        }
    }


    /**
     * Menu para modificar la direccion del cliente seleccionado en la lista
     */
    public void menuModificarDireccion() {
        int opcion;

        do {
            opcion = vista.menuModificarDireccion();

            switch (opcion) {
                case 1:
                    modificarCalle();
                    break;
                case 2:
                    modificarCruzamiento();
                    break;
                case 3:
                    modificarnumeroCasa();
                    break;
                case 4:
                    modificarcolonia();
                    break;
                case 5:
                    modificarCiudad();
                    break;
                case 6:
                    modificarReferencia();
                    break;
                case 0:
                    menuCliente();
                    break;
                default:
                    vista.opcionNoValida();
                    break;

            }
        } while (opcion != 0);
    }



    /**
     * Metodo para buscar y modificar la calle de la direccion del cliente seleccionado
     */
    public void modificarCalle() {
        String a = vista.pedirTelefono();
        boolean encontrado = false;

        for (int i = 0; i < listaClientes.size(); i++) {
            String b = listaClientes.get(i).getTelefono();
            Cliente cliente = listaClientes.get(i);

            if (a.equals(b)) {
                Direccion direccion = cliente.getDireccion();
                String nuevaCalle = vista.pedirCalle();
                direccion.setCalle(nuevaCalle);
                vista.ActualizacionCorrecta();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            vista.ClienteNoRegistrado();
        }
    }



    /**
     * Metodo para buscar y modificar los cruzamientos de la direccion del cliente seleccionado
     */
    public void modificarCruzamiento() {
        String a = vista.pedirTelefono();
        boolean encontrado = false;

        for (int i = 0; i < listaClientes.size(); i++) {
            String b = listaClientes.get(i).getTelefono();
            Cliente cliente = listaClientes.get(i);

            if (a.equals(b)) {
                Direccion direccion = cliente.getDireccion();
                String nuevoCruzamiento = vista.pedirCruzamientos();
                direccion.setCalle(nuevoCruzamiento);
                vista.ActualizacionCorrecta();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            vista.ClienteNoRegistrado();
        }
    }

    /**
     * Metodo para buscar y modificar el numero de casa de la direccion del cliente seleccionado
     */
    public void modificarnumeroCasa() {
        String a = vista.pedirTelefono();
        boolean encontrado = false;

        for (int i = 0; i < listaClientes.size(); i++) {
            String b = listaClientes.get(i).getTelefono();
            Cliente cliente = listaClientes.get(i);

            if (a.equals(b)) {
                Direccion direccion = cliente.getDireccion();
                String NuevonumeroCasa = vista.pedirnumeroCasa();
                direccion.setNumeroCasa(NuevonumeroCasa);
                vista.ActualizacionCorrecta();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            vista.ClienteNoRegistrado();
        }
    }

    /**
     * Metodo para buscar y modificar la colonia de la direccion del cliente seleccionado
     */
    public void modificarcolonia(){
        String a = vista.pedirTelefono();
        boolean encontrado = false;

        for (int i = 0; i < listaClientes.size(); i++) {
            String b = listaClientes.get(i).getTelefono();
            Cliente cliente = listaClientes.get(i);

            if (a.equals(b)) {
                Direccion direccion = cliente.getDireccion();
                String NuevaColonia = vista.pedirColonia();
                direccion.setNumeroCasa(NuevaColonia);
                vista.ActualizacionCorrecta();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            vista.ClienteNoRegistrado();
        }
    }

    /**
     * Metodo para buscar y modificar la cuidad donde recide cliente seleccionado
     */
    public void modificarCiudad(){
        String a = vista.pedirTelefono();
        boolean encontrado = false;

        for (int i = 0; i < listaClientes.size(); i++) {
            String b = listaClientes.get(i).getTelefono();
            Cliente cliente = listaClientes.get(i);

            if (a.equals(b)) {
                Direccion direccion = cliente.getDireccion();
                String NuevaCiudad = vista.pedirCiudad();
                direccion.setCiudad(NuevaCiudad);
                vista.ActualizacionCorrecta();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            vista.ClienteNoRegistrado();
        }
    }

    /**
     * Metodo para buscar y modificar la referencia de la direccion del cliente seleccionado
     */
    public void modificarReferencia(){
        String a = vista.pedirTelefono();
        boolean encontrado = false;

        for (int i = 0; i < listaClientes.size(); i++) {
            String b = listaClientes.get(i).getTelefono();
            Cliente cliente = listaClientes.get(i);

            if (a.equals(b)) {
                Direccion direccion = cliente.getDireccion();
                String Nuevareferencia = vista.pedirReferencia();
                direccion.setCiudad(Nuevareferencia);
                vista.ActualizacionCorrecta();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            vista.ClienteNoRegistrado();
        }
    }

}
