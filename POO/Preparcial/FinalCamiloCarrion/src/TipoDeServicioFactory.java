public class TipoDeServicioFactory {


    private static TipoDeServicioFactory instance;

    private TipoDeServicioFactory(){

    }

    public static TipoDeServicioFactory getInstance() {
        if(instance == null){
            instance = new TipoDeServicioFactory();
        }
        return instance;
    }

    public TipoDeServicio generarTipoDeServicio(String servicio){
        switch (servicio){
            case "VENTA AIRE ACONDICIONADO" :
                return new ServicioSimple("VENTA AIRE ACONDICIONADO","INCLUYENDO UN SERVICIO",65.000,false);
            case "COLOCACION DE AIRE ACONDICIONADO" :
                return new ServicioSimple("COLOCACION DE AIRE ACONDICIONADO"," INCLUYENDO LA COLOCACION",10.000,true);
            case "FULL AIRE ACONDICIONADO" :
                ComboServicio comboServicio = new ComboServicio("FULL AIRE ACONDICIONADO","SERVICIO COMPLETO",0.1);
                comboServicio.agregarServicio(this.generarTipoDeServicio("VENTA AIRE ACONDICIONADO"));
                comboServicio.agregarServicio(this.generarTipoDeServicio("COLOCACION DE AIRE ACONDICIONADO"));
                return comboServicio;
        }
        return null;
    }
}
