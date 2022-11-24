public class Main {
    public static void main(String[] args) {

        Capitan capitan = new Capitan(1,"Popeye","El Marino");
        Velero velero = new Velero(capitan,5000.0,2000.0,2021,1.0,5);
        Yate yate = new Yate(capitan,5000.0,2000.0,2021,1.0,1);
        Yate otroYate = new Yate(capitan,5000.0,2000.0,2021,1.0,5);

        System.out.println(velero.calcularAlquiler());
        System.out.println(velero.esGrande());

        System.out.println(yate.compareTo(otroYate));
        System.out.println(otroYate.compareTo(yate));
    }
}