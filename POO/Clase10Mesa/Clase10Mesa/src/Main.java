public class Main {
    public static void main(String[] args) {
        Nave nave1=new Nave(20,30,'N',25.0,3);
        Asteroide asteroide1=new Asteroide(20,30,'N',1);

        nave1.irA(20,30,'N');
        nave1.restavida(1);
        nave1.girar('O');
    }
}