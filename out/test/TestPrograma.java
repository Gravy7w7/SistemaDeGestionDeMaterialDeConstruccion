import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPrograma {

    @Test
    void testConstructor() {
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
}