public class Main {
    public static void main(String[] args) {
       Persona persona =new Persona("Camilo","Carrion","114330333",26);
        ContratoMensual contratoMensual=new ContratoMensual(persona,2.0,"26/02/1996",true,900.00,6.5,"Jefe");
        ContratoSalarioXHora contratoXhora=new ContratoSalarioXHora(persona,6.5,"1999/05/06",true,20.0,950.000);
        ContratoSalarioXHora contratoXhoraEmpleado2=new ContratoSalarioXHora(persona,6.5,"1999/05/06",true,22.0,950.000);


        System.out.println(contratoMensual.cargoDelEmpleado());
        System.out.println(contratoXhora.compareTo(contratoXhoraEmpleado2));
        System.out.println(contratoXhoraEmpleado2.compareTo(contratoXhora));


    }
}