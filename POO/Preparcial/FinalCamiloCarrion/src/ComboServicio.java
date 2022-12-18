import java.util.ArrayList;
import java.util.List;

public class ComboServicio extends TipoDeServicio{

    private List<TipoDeServicio> tipoDeServicioList;
    private Double descuento;

    public ComboServicio(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        tipoDeServicioList=new ArrayList<>();
        this.descuento = descuento;
    }

    public void agregarServicio(TipoDeServicio tipoDeServicio){
        tipoDeServicioList.add(tipoDeServicio);
    }

    @Override
    public Double calcularPrecio() {
        Double sumaPrecios=0.0;
        for (TipoDeServicio tipoDeServicio : tipoDeServicioList) {

            sumaPrecios+=tipoDeServicio.calcularPrecio();
        }
        return sumaPrecios-(sumaPrecios*descuento);
    }
}
