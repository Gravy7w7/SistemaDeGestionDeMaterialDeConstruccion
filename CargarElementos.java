/**
 * @author Pedro José Bacab Pech
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CargarElementos implements Interfaz1 {

    /**
     * Método que inicializa la lista de productos ademas de serializarlos y deserializarlos
     */
    public void InicializarProductos(){
        Producto Martillo = new Producto(5,"Martillo",50,"Objeto para martillar",35,123);
        Producto Mazo = new Producto(5,"Mazo",80,"Objeto para golpear",5,11);

        listaProductos.add(Martillo);
        listaProductos.add(Mazo);

        //serializar los datos que estan cargados
        try {
            ObjectOutputStream producto_guardado = new ObjectOutputStream(new FileOutputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\Sistema de Gestión de Materiales de construcción\\GestióndeProductos\\Objetos\\Productos.dat"));
            producto_guardado.writeObject(listaProductos);
            producto_guardado.close();
            System.out.println("Serializado correctamente(Productos)");
        }catch (Exception e){
            System.out.println("Excepción: "+e);
        }

        //Deserializar los datos que se serializaron
        try{
            ObjectInputStream producto_recuperado = new ObjectInputStream(new FileInputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\Sistema de Gestión de Materiales de construcción\\GestióndeProductos\\Objetos\\Productos.dat"));
            Object objetoRecuperado = producto_recuperado.readObject();
            ArrayList <Producto> listaProductosRecuperados = (ArrayList<Producto>) objetoRecuperado;
            producto_recuperado.close();
            System.out.println("deserializado correctamente(Productos)");
        }catch (Exception e){
            System.out.println("Excepción: "+e);
        }

    }

    /**
     * Método que iniciliza la lista de Clientes ademas de serializarlos y deserializarlos
     */
    public void InicializarClientes(){
        Direccion direccion1 = new Direccion("Calle 61A","38 y 40","400","Santa Cruz","Tizimin","Casa blanca con gris");
        Cliente cliente1 = new Cliente("Pedro","Bacab","9861004491",11,direccion1);

        Direccion direccion2 = new Direccion("Calle 79","50B y 52","S/N","Adolfo Lopez Mateos","Tizimin","Casa verde con porche de lamina roja");
        Cliente cliente2 = new Cliente("Anahi","Dzul","9861020957",2,direccion2);

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);

        //serializar los datos que estan cargados
        try {
            ObjectOutputStream cliente_guardado = new ObjectOutputStream(new FileOutputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\Sistema de Gestión de Materiales de construcción\\GestióndeProductos\\Objetos\\Clientes.dat"));
            cliente_guardado.writeObject(listaClientes);
            cliente_guardado.close();
            System.out.println("Serializado correctamente(Clientes)");
        }catch (Exception e){
            System.out.println("Excepción: "+e);
        }

        //Deserializar los datos que se serializaron
        try{
            ObjectInputStream cliente_recuperado = new ObjectInputStream(new FileInputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\Sistema de Gestión de Materiales de construcción\\GestióndeProductos\\Objetos\\Clientes.dat"));
            Object objetoRecuperado = cliente_recuperado.readObject();
            ArrayList <Cliente> listaClientesRecuperados = (ArrayList<Cliente>) objetoRecuperado;
            cliente_recuperado.close();
            System.out.println("deserializado correctamente(Clientes)");
        }catch (Exception e){
            System.out.println("Excepción: "+e);
        }

    }

    /**
     * Método que iniciliza la lista de Proveedores ademas de serializarlos y deserializarlos
     */
    public void InicializarProveedores(){
        Proveedor provedor1 = new Proveedor("Matiza","9861001111","Vitropisos",80,100);

        listaProveedores.add(provedor1);

        //serializar los datos que estan cargados
        try {
            ObjectOutputStream proveedor_guardado = new ObjectOutputStream(new FileOutputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\Sistema de Gestión de Materiales de construcción\\GestióndeProductos\\Objetos\\Proveedores.dat"));
            proveedor_guardado.writeObject(listaProveedores);
            proveedor_guardado.close();
            System.out.println("Serializado correctamente(Proveedores)");
        }catch (Exception e){
            System.out.println("Excepción: "+e);
        }

        //Deserializar los datos que se serializaron
        try{
            ObjectInputStream proveedor_recuperado = new ObjectInputStream(new FileInputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\Sistema de Gestión de Materiales de construcción\\GestióndeProductos\\Objetos\\Proveedores.dat"));
            Object objetoRecuperado = proveedor_recuperado.readObject();
            ArrayList <Proveedor> listaProveedoresRecuperados = (ArrayList<Proveedor>) objetoRecuperado;
            proveedor_recuperado.close();
            System.out.println("deserializado correctamente(Proveedores)");
        }catch (Exception e){
            System.out.println("Excepción: "+e);
        }
    }

    /**
     * Método que iniciliza la lista de Ventass ademas de serializarlos y deserializarlos
     */
    public void InicializarVentas(){
        Venta venta1 = new Venta("02/12/2023","Martillo",1,50,"Pedro","9861004491",0);
        listaVenta.add(venta1);

        //serializar los datos que estan cargados
        try {
            ObjectOutputStream venta_guardado = new ObjectOutputStream(new FileOutputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\Sistema de Gestión de Materiales de construcción\\GestióndeProductos\\Objetos\\Ventas.dat"));
            venta_guardado.writeObject(listaVenta);
            venta_guardado.close();
            System.out.println("Serializado correctamente(Ventas)");
        }catch (Exception e){
            System.out.println("Excepción: "+e);
        }

        //Deserializar los datos que se serializaron
        try{
            ObjectInputStream venta_recuperado = new ObjectInputStream(new FileInputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\Sistema de Gestión de Materiales de construcción\\GestióndeProductos\\Objetos\\Ventas.dat"));
            Object objetoRecuperado = venta_recuperado.readObject();
            ArrayList <Venta> listaVentasRecuperados = (ArrayList<Venta>) objetoRecuperado;
            venta_recuperado.close();
            System.out.println("deserializado correctamente(Ventas)");
        }catch (Exception e){
            System.out.println("Excepción: "+e);
        }
    }


}
