/**
 * @author Hermilo Eduardo Broca Sanchez
 */
public class ControladorProveedor implements Interfaz1 {

    /**
     * Creamos la vista
     */
    VistaProveedor vista = new VistaProveedor();

    /**
     * Método que ejecuta el menú de proveedores
     */
    public void menuProveedor(){
        int opcion;

        do {
            opcion= vista.menuProveedor();

            switch (opcion) {
                case 1:
                    agregarProveedor();
                    break;
                case 2:
                    menuModificarProveedor();
                    break;
                case 3:
                    borrarProveedor();
                    break;
                case 4:
                    buscarProveedor();
                    break;
                case 0:
                    vista.volviendoMenuPrincipal();
                    break;
                default:
                    vista.opcionNoValida();
                    break;
            }
        }while(opcion != 0);
    }

    /**
     * Método para agregar un nuevo proveedor
     */
    public void agregarProveedor(){
        Proveedor obj1 = new Proveedor(
                vista.pedirNombreProveedor(),
                vista.pedirTelefonoProveedor(),
                vista.pedirNombreProducto(),
                vista.pedirPrecioMayoreo(),
                vista.pedirCantidad()
        );

        listaProveedores.add(obj1);
        vista.agregadoConExito();
    }

    /**
     * Método para borrar un proveedor a través de la búsqueda mediante su teléfono
     */
    public void borrarProveedor(){
        String a=vista.pedirTelefonoProveedor();
        boolean encontrado=false;

        for(int i=0 ; i<listaProveedores.size() ; i++){
            String b = listaProveedores.get(i).getTelefono();

            if(a.equals(b)){
                listaProveedores.remove(i);
                vista.borradoConExito();
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProveedor();
        }
    }

    /**
     * Método para buscar un proveedor a través de la búsqueda mediante su teléfono
     */
    public void buscarProveedor(){
        String a=vista.pedirTelefonoProveedor();
        boolean encontrado=false;

        for(int i=0 ; i<listaProveedores.size() ; i++){
            String b = listaProveedores.get(i).getTelefono();

            if(a.equals(b)){
                System.out.println(listaProveedores.get(i));
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProveedor();
        }
    }

    /**
     * Método que ejecuta un submenú para elegir que atributo se desea modificar del proveedoor
     */
    public void menuModificarProveedor(){
        int opcion;

        do {

            opcion= vista.menuModificarProveedor();

            switch (opcion) {
                case 1:
                    modificarNombreProveedor();
                    break;
                case 2:
                    modificarTelefonoProveedor();
                    break;
                case 3:
                    modificarNombreProducto();
                    break;
                case 4:
                    modificarPrecioProducto();
                    break;
                case 0:
                    vista.volviendoMenuPrincipal();
                    break;
                default:
                    vista.opcionNoValida();
                    break;
            }
        }while(opcion != 0);
    }

    /**
     * Método para modificar el nombre del proveedor a través de la búsqueda mediante su teléfono
     */
    public void modificarNombreProveedor(){
        String a=vista.pedirTelefonoProveedor();
        boolean encontrado=false;

        for(int i=0 ; i<listaProveedores.size() ; i++){
            String b = listaProveedores.get(i).getTelefono();

            if(a.equals(b)){
                listaProveedores.get(i).setNombreProducto(vista.pedirNombreProveedor());
                vista.modificadoConExito();
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProveedor();
        }
    }

    /**
     * Método para modificar el télefono del proveedor a través de la búsqueda de este mismo
     */
    public void modificarTelefonoProveedor(){
        String a=vista.pedirTelefonoProveedor();
        boolean encontrado=false;

        for(int i=0 ; i<listaProveedores.size() ; i++){
            String b = listaProveedores.get(i).getTelefono();

            if(a.equals(b)){
                listaProveedores.get(i).setTelefono(vista.pedirTelefonoProveedor());
                vista.modificadoConExito();
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProveedor();
        }
    }

    /**
     * Método para modificar el nombre del producto que el proveedor vende a través de la búsqueda mediante su teléfono
     */
    public void modificarNombreProducto(){
        String a=vista.pedirTelefonoProveedor();
        boolean encontrado=false;

        for(int i=0 ; i<listaProveedores.size() ; i++){
            String b = listaProveedores.get(i).getTelefono();

            if(a.equals(b)){
                listaProveedores.get(i).setNombreProducto(vista.pedirNombreProducto());
                vista.modificadoConExito();
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProveedor();
        }
    }

    /**
     * Método para modificar el precio del producto que el proveedor vende a través de la búsqueda mediante su teléfono
     */
    public void modificarPrecioProducto(){
        String a=vista.pedirTelefonoProveedor();
        boolean encontrado=false;

        for(int i=0 ; i<listaProveedores.size() ; i++){
            String b = listaProveedores.get(i).getTelefono();

            if(a.equals(b)){
                listaProveedores.get(i).setPrecioMayoreo(vista.pedirPrecioMayoreo());
                vista.modificadoConExito();
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProveedor();
        }
    }

}
