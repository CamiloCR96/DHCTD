import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

       // System.out.println(pedirJugada());
       // System.out.println(jugadaRandom());
        System.out.println(compararJugadas());
        System.out.println(señorSpock());
        System.out.println("Digite su numero primo favorito, para mostrar los primeros 7 numeros primos del mismo escrito : ");
        Integer numeroPrimos = scanner.nextInt();
        System.out.println("LOS NUMEROS PRIMOS SON "+numerosPrimos(numeroPrimos));

    }
    /*-----------------PIEDRA,PAPEL O TIJERA-----------------------------------------------------------*/
    public static Integer pedirJugada() {
        Integer eleccion = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            // pedimos que elija una opcion válida
            // convertimos el texto que nos llega en un número
            // y reemplazamos en valor guardado en la variable
            System.out.println("Ingrese su eleccion 1.piedra 2.papel 3.tijeras : ");
            eleccion = scanner.nextInt();

            // si el dato ingresado no es válido entonces se vuelve a pedir hasta que cumpla
        } while (eleccion < 1 || eleccion > 3);

        // mostramos los datos por consola
        System.out.println("----------------------------");
        System.out.println("La eleccion del jugador es:");
        System.out.println(eleccion);
        System.out.println("----------------------------");
        return eleccion;
    }
    public static Integer jugadaRandom() {
        int numero = (int)(Math.random() * 3 + 1);

        // mostramos los datos por consola
        System.out.println("----------------------------");
        System.out.println("La computadora saca:");
        System.out.println(numero);
        System.out.println("----------------------------");

        // finalmente devolvemos el valor de la eleccion aleatoria
        return numero;
    }
    public static String compararJugadas() {
    String []  resultados_posibles = {"¡Genial, ganaste!", "Esto fue un empate.", "Una lástima, perdiste."};


     Integer eleccionJugador = pedirJugada();
    Integer eleccionComputadora = jugadaRandom();

        // 👇 Por defecto el jugador gana
        String resultadoRonda =resultados_posibles[0];

        // 👇 Chequeamos el caso en que empata
        if (eleccionJugador.equals(eleccionComputadora)) {
            resultadoRonda = resultados_posibles[1];

            // 👇 Chequeamos los posibles casos en que pierde, sino ya sabemos que ganó
        } else if ((eleccionJugador == 1 && eleccionComputadora == 2) || (eleccionJugador == 2 && eleccionComputadora == 3) || (eleccionJugador == 3 && eleccionComputadora == 1)) {
            resultadoRonda = resultados_posibles[2];
        }

        // devolvemos la frase con el resultado de la partida
        return resultadoRonda;
    }
/*---------------------------------------- Respuesta del señor spock ----------------------------------------*/
    public static String señorSpock (){
        String []  resultados_posibles = {"Papel desaprueba Spock", "Spock destroza tijeras", "Spock vaporiza piedra"};


        Integer eleccionJugador = pedirJugada();
        Integer eleccionComputadora = jugadaRandom();

        // 👇 Por defecto el jugador gana
        String resultadoRonda =resultados_posibles[0];

        // 👇 Chequeamos el caso en que empata
        if (eleccionJugador.equals(eleccionComputadora)) {
            resultadoRonda = resultados_posibles[1];

            // 👇 Chequeamos los posibles casos en que pierde, sino ya sabemos que ganó
        } else if ((eleccionJugador == 1 && eleccionComputadora == 2) || (eleccionJugador == 2 && eleccionComputadora == 3) || (eleccionJugador == 3 && eleccionComputadora == 1)) {
            resultadoRonda = resultados_posibles[2];
        }

        // devolvemos la frase con el resultado de la partida
        return resultadoRonda;

    }
    /*---------------------------------------- Numeros primos ----------------------------------------*/

   public static Integer numerosPrimos(Integer numeroPrimo){
             Integer resultado=0;


                for (int i = 2; i <8; i++) {
                if(numeroPrimo%i!=0){
                    System.out.println(i);

                }

       }
        return resultado;

    }




}