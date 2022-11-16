public class Articulo {

    private String descripcion;
    private double precioVenta;
    private  int stock;




    public Articulo(String descripcion, int stock,Double precioVenta){
        this.descripcion=descripcion;
        this.precioVenta=precioVenta;
        this.stock=stock;
    }

    public boolean sotck(){
        return stock>0;
        }


    public Double consultarPrecio(){
       return precioVenta;

    }
}
