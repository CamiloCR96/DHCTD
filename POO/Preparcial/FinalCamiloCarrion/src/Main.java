public class Main {
    public static void main(String[] args) {


        Empresa empresa= new Empresa();

        TipoDeServicioFactory factory= TipoDeServicioFactory.getInstance();

        empresa.agregarTipoDeServicio(factory.generarTipoDeServicio("VENTA AIRE ACONDICIONADO"));
        empresa.agregarTipoDeServicio(factory.generarTipoDeServicio("COLOCACION DE AIRE ACONDICIONADO"));
        empresa.agregarTipoDeServicio(factory.generarTipoDeServicio("FULL AIRE ACONDICIONADO"));

        empresa.mostrarServicio();
    }
}