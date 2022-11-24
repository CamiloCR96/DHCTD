public class ContratoMensual extends Contrato {
    private Double salarioMensual;
    private Double horasTotales;
    private String cargoEmpleado;


    public ContratoMensual(Persona persona, Double cantidadDeMeses, String fechaDeInicioDeActividad, Boolean selloMinisterio, Double salarioMensual, Double horasTotales, String cargoEmpleado) {
        super(persona, cantidadDeMeses, fechaDeInicioDeActividad, selloMinisterio);
        this.salarioMensual = salarioMensual;
        this.horasTotales = horasTotales;
        this.cargoEmpleado = cargoEmpleado;
    }

    public String cargoDelEmpleado(){
        if(cargoEmpleado=="Jefe"){
            String cargo="La persona tiene el cargo de JEFE";
            return cargo;
        }
        else if (cargoEmpleado=="Empleado") {
            String cargo="La persona tiene cargo de empleado";
            return cargo;
        }
        String cargo="El empleado es supervisor";
        return cargo;

    }
}
