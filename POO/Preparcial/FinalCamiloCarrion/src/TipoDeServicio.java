public abstract class TipoDeServicio {
    private String nombre;
    private String descripcion;

    public TipoDeServicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

   public abstract Double calcularPrecio();

    public String toString() {
        return "nombre : " + nombre + " precio " + calcularPrecio();
    }
}
