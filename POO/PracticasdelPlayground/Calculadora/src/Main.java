import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    integer a;
    integer b;
    int opc;

        System.out.println("Digite el primer digito: ");
        a= sc.nextint();

        System.out.println("Digite el segundo digito: ");
        b= sc.nextint();



        do {
            System.out.println("-----------------------------");
            System.out.println("1.sumar");
            System.out.println("2.restar");
            System.out.println("3.division");
            System.out.println("4.multiplicacion");
            System.out.println("5.salir");
            System.out.println("-------------------------------");
            System.out.println("Escriba una de las opciones: ");
            opc=sc.nextint();
            switch (opc){
                case 1:
                    System.out.println(suma(a,b));
                    break;

                case 2:
                    System.out.println(resta(a,b));
                    break;

                case 3:
                    System.out.println(dividir(a,b));
                    break;
                case 4:
                    System.out.println(multiplicar(a,b));
                    break;



                default:
                    System.out.println("Gracias por participar.");
                    break;

            }

        }while ((opc>=1 ||opc<=3)|| opc==5);

    }
    public static int suma(int a, int b){
        return a + b;
    }
    public static int resta(int a, int b){



            return a-b;


    }
    public static int dividir(int a, int b){

        if(b==0){
           System.out.println("No se puede realizar esta operacion.");
            return 0;
        }
        else {


           int solucion = a / b;
            return solucion;
        }

    }
    public static int multiplicar(int a, int b){


        return a*b;
    }


}