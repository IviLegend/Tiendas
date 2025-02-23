package programatienda.instanciables;

import java.util.ArrayList;

/**
 * Clase de tienda. Contiene un inventario de objetos
 * @author Ivan
 * @version 1.1.0
 */
public class Tienda
{
    /// ATRIBUTOS
    public ArrayList<Producto> inventario;

    /// CONSTRUCTORES
    public Tienda()
    {

    }

    public Tienda(ArrayList<Producto> inventario)
    {
        this.inventario = inventario;
    }

    /**
     * Muestra el menú
     */
    public static void mostrarMenu()
    {
        System.out.println("1. Mostrar inventario");
        System.out.println("2. Añadir producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Salir");
    }

    /**
     * Muestra el stock del inventario
     */
    @Deprecated
    public void mostrarInventarioAntiguo()
    {
        System.out.println("Buscando...");
        esperar(2000);
        for (int i = 0; i < inventario.size(); i++)
        {
            System.out.printf("%d. %s | %.2f\n", i + 1, inventario.get(i).getNombre(), inventario.get(i).getPrecio());
        }
    }

    /**
     * Muestra el stock del inventario
     */
    public void mostrarInventario()
    {
        System.out.println("Buscando...");
        esperar(1000);
        for (int i = 0; i < inventario.size(); i++)
        {
            System.out.printf("%d. ", i + 1);
            inventario.get(i).mostrarInformacion();
            System.out.println();
        }
    }

    /**
     * Añade un producto al inventario.
     * @param nombreProducto El nombre del producto a añadir
     * @param precio El precio del producto a añadir
     * @return El producto que ha sido añadido.
     */
    public Producto anyadirProducto(String nombreProducto, double precio)
    {
        Producto productoAnyadir = new Producto(nombreProducto, precio);
        inventario.add(productoAnyadir);
        return productoAnyadir;
    }

    /**
     * Retira un producto del inventario.
     * @param indexProducto El índice del producto a retirar
     * @return El producto que ha sido retirado
     */
    public Producto retirarProducto(int indexProducto)
    {
        indexProducto--;
        Producto productoRetirado = inventario.get(indexProducto);
        inventario.remove(indexProducto);
        return productoRetirado;
    }

    /**
     * Espera la cantidad de milisegundos especificada.
     *
     * @param milisegundos La cantidad de milisegundos que va a esperar.
     * @see <a href="https://stackoverflow.com/questions/15528140/java-thread-sleep-and-interrupted-exception">Stack Overflow</a>
     * @since 1.2.4
     */
    public static void esperar(int milisegundos)
    {
        try
        {
            Thread.sleep(milisegundos);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
