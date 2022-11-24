public abstract class Contrato {
    private Persona persona;
    private Double cantidadDeMeses;
    private String fechaDeInicioDeActividad;
    private Boolean selloMinisterio;

    public Contrato(Persona persona, Double cantidadDeMeses, String fechaDeInicioDeActividad, Boolean selloMinisterio) {
        this.persona = persona;
        this.cantidadDeMeses = cantidadDeMeses;
        this.fechaDeInicioDeActividad = fechaDeInicioDeActividad;
        this.selloMinisterio = selloMinisterio;
    }

    public Boolean incorporarTrabajo(){
        if (selloMinisterio==true){
            return true;
        }
        return false;
    }
}
