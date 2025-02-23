public class Producto
{
    /// ATRIBUTOS
    private String nombre;
    private double precio;

    /// CONSTRUCTORES
    public Producto()
    {

    }

    public Producto(String nombre, double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    /// MÉTODOS
    /**
     * Muestra la información del objeto.
     */
    public void mostrarInformacion()
    {
        System.out.printf("%s | %.2f", this.nombre, this.precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
