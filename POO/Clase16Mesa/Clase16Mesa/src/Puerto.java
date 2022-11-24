import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Contenedor>contenedorList;

    public Puerto(List<Contenedor> contenedorList) {
        this.contenedorList = contenedorList;
        contenedorList=new ArrayList<>();
    }

    public void ingresarContenedor(Contenedor contenedor){

    contenedorList.add(contenedor);
    }

    public void mostrarContendor(){
        contenedorList.sort(null);
        for (Contenedor contenedor : contenedorList) {
            System.out.println(contenedor.getIdentificador());
            }
        }

        public Integer calcularCantidadDeContenedorPeligroso(){
        Integer contador=0;
            for (Contenedor contenedor : contenedorList) {
                if(contenedor.getTransportaMaterialPeligroso()==true && contenedor.getProcedenciaPais()=="Desconocida"){
                    contador++;
                }
            }
            return contador;
        }

    }

