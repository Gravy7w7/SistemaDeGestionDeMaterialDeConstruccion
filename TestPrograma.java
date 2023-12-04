import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPrograma {

    @Test
    void testConstructorProducto() {
        //Datos de prueba
        int categoria = 1;
        String nombreP="Martillo";
        int precio = 30;
        String descripcion="Objeto usado para clavar";
        int stock = 50;
        int codigo=122423;

        Producto productoTest = new Producto(categoria,nombreP,precio,descripcion,stock,codigo);

        assertEquals(categoria,productoTest.getCategoria());
        assertEquals(nombreP,productoTest.getNombreProducto());
        assertEquals(precio,productoTest.getPrecio());
        assertEquals(descripcion,productoTest.getDescripcion());
        assertEquals(stock,productoTest.getStock());
        assertEquals(codigo,productoTest.getCodigo());
    }

    @Test
    void testConstructorProveedor() {
        //Datos de prueba
        String NombreProveedores="Anahi";
        String Telefono="9861001111";
        String NombreProducto="Mazos";
        int PrecioMayoreo=50;
        int Cantidad=30;

        Proveedor proveedorTest = new Proveedor(NombreProveedores,Telefono,NombreProducto,PrecioMayoreo,Cantidad);

        assertEquals(NombreProveedores,proveedorTest.getNombreProveedores());
        assertEquals(Telefono,proveedorTest.getTelefono());
        assertEquals(NombreProducto,proveedorTest.getNombreProducto());
        assertEquals(PrecioMayoreo,proveedorTest.getPrecioMayoreo());
        assertEquals(Cantidad,proveedorTest.getCantidad());
    }

    @Test
    void testConstructorVenta() {
        //Datos de prueba
        String fecha="03/12/2023";
        String nombreProducto="Mazo";
        int cantidadProducto=3;
        float precioProducto=30;
        String nombreCliente="Pedro";
        String telefonoCliente="9861004491";
        int numeroDeVenta=14;

        Venta ventaTest = new Venta(fecha,nombreProducto,cantidadProducto,precioProducto,nombreCliente,telefonoCliente,numeroDeVenta);

        assertEquals(fecha,ventaTest.getFecha());
        assertEquals(nombreProducto,ventaTest.getNombreProducto());
        assertEquals(cantidadProducto,ventaTest.getCantidadProducto());
        assertEquals(precioProducto,ventaTest.getPrecioProducto());
        assertEquals(nombreCliente,ventaTest.getNombreCliente());
        assertEquals(telefonoCliente,ventaTest.getTelefonoCliente());
        assertEquals(numeroDeVenta,ventaTest.getNumeroDeVenta());
    }

    @Test
    void testConstructorCliente() {
        //Datos de prueba
        String calle="61A";
        String cruzamientos="38 y 49";
        String numeroCasa="400";
        String colonia="Santa Cruz";
        String ciudad="Tizimín";
        String referencia="Casa blanca con verde";

        Direccion direccionTest = new Direccion(calle,cruzamientos,numeroCasa,colonia,ciudad,referencia);
        assertEquals(calle,direccionTest.getCalle());
        assertEquals(cruzamientos,direccionTest.getCruzamientos());
        assertEquals(numeroCasa,direccionTest.getNumeroCasa());
        assertEquals(colonia,direccionTest.getColonia());
        assertEquals(ciudad,direccionTest.getCiudad());
        assertEquals(referencia,direccionTest.getReferencia());

        String nombre="Anahi";
        String apellido="Dzul";
        String telefono="9861020957";
        int frecuencia=10;
        Direccion direccion = new Direccion(calle,cruzamientos,numeroCasa,colonia,ciudad,referencia);

        Cliente ClienteTest = new Cliente(nombre,apellido,telefono,frecuencia,direccion);

        assertEquals(nombre,ClienteTest.getNombre());
        assertEquals(apellido,ClienteTest.getApellido());
        assertEquals(telefono,ClienteTest.getTelefono());
        assertEquals(frecuencia,ClienteTest.getFrecuencia());
        assertEquals(direccion,ClienteTest.getDireccion());



    }
}