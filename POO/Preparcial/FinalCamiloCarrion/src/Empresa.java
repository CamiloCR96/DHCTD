import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial;
    private List<TipoDeServicio> tipoDeServicioList;

    public Empresa() {
        tipoDeServicioList=new ArrayList<>();
    }



    public void agregarTipoDeServicio(TipoDeServicio tipoDeServicio) {
        tipoDeServicioList.add(tipoDeServicio);
    }

    public void mostrarServicio() {
        for (TipoDeServicio tipoDeServicio : tipoDeServicioList) {
            System.out.println(tipoDeServicio);
        }
    }
}
