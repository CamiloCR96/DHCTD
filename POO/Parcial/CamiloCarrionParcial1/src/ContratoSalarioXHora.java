public class ContratoSalarioXHora extends Contrato implements Comparable {

    private Double cantidadDehoras;
    private Double valorDeLaHora;


    public ContratoSalarioXHora(Persona persona, Double cantidadDeMeses, String fechaDeInicioDeActividad, Boolean selloMinisterio, Double cantidadDehoras, Double valorDeLaHora) {
        super(persona, cantidadDeMeses, fechaDeInicioDeActividad, selloMinisterio);
        this.cantidadDehoras = cantidadDehoras;
        this.valorDeLaHora = valorDeLaHora;
    }

    @Override
    public int compareTo(Object o) {
        ContratoSalarioXHora horasContratadas = (ContratoSalarioXHora) o;

        if (cantidadDehoras > horasContratadas.cantidadDehoras) {
            return 1;
        }
        if (horasContratadas.cantidadDehoras>cantidadDehoras) {
            return -1;
        }
        return 0;
    }
}
