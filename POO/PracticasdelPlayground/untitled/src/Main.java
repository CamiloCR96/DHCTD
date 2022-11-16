import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        char segundainicial;
        char inicial;
        String nombre;
        String apellido;
        int num1;
        int divisor;

        System.out.println("Digite su nombre: ");
        nombre= sc.nextLine();

        System.out.println("Digite su nombre: ");
        apellido=sc.nextLine();
        inicial=nombre.charAt(0);
        segundainicial=apellido.charAt(0);


        System.out.println("Tus iniciales son : "+ inicial + segundainicial);
        System.out.println("Digita el primer valor: ");
        num1=sc.nextInt();
        System.out.println("Digita el divisor: ");
        divisor=sc.nextInt();
        esDivisible(num1,divisor);
    }

   public static boolean esDivisible(int n ,int divisor){

        if(n%divisor==0){
            System.out.println("Si es divisible");
           return true;
        }
        else {
           System.out.println("No es divisible");
           return false;
       }

    }
}