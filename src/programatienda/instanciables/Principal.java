package programatienda.instanciables;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase principal del sistema de tiendas
 * @author Ivan
 * @version 1.0.0
 */
public class Principal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Creamos productos de prueba
        Producto chaqueta = new Producto("Chaqueta marrón", 25.99);
        Producto abrigo = new Producto("Abrigo azul", 56.99);
        Producto zapatillas = new Producto("Zapatillas Nike", 46.50);
        Producto reloj = new Producto("Reloj de muñeca", 15.95);

        // Creamos un inventario y añadimos los productos
        ArrayList<Producto> inventario = new ArrayList<>();
        inventario.add(chaqueta);
        inventario.add(abrigo);
        inventario.add(zapatillas);
        inventario.add(reloj);

        // Creamos la tienda
        Tienda tienda = new Tienda(inventario);

        System.out.println("== BIENVENIDO A NUESTRO SISTEMA DE TIENDAS ==");
        int opcion = -1;

        while (opcion != 4)
        {
            System.out.println("== ¿Que quieres hacer? ==");
            Tienda.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion)
            {
                case 1:
                {
                    tienda.mostrarInventario();
                    System.out.println();
                    break;
                }

                case 2:
                {
                    System.out.print("Dime el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Dime ahora el precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();
                    tienda.anyadirProducto(nombre, precio);
                    break;
                }

                case 3:
                {
                    System.out.println("Dime el número de producto que quieres eliminar: ");
                    int index = scanner.nextInt();
                    tienda.retirarProducto(index);
                    break;
                }

                case 4:
                {
                    System.out.println("¡ADIÓS!");
                    System.exit(0);
                }
            }
        }
    }
}