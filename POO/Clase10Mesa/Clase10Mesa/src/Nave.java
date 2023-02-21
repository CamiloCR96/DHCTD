public class Nave extends ObjetoGrafico{
    private double velocidad;
    private int vida;


    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "posicion en x:"+getPosx()+" posicion en y: "+getPosy()+" direccion: "+getDireccion();
    }

    @Override
    public void irA(int x, int y, char direccion) {

        System.out.println("desplazandose hasta la posicion en el eje x :"+x+" en el eje y: "+y+" con direccion a: "+direccion);
    }

    public void girar(char direccion){
        if(direccion=='N'){
            System.out.println("ESTA DIRIGIENDOSE HACIA EL NORTE");
        }
        if(direccion=='S'){
            System.out.println("ESTA DIRIGIENDOSE HACIA EL SUR");
        }
        if(direccion=='O'){
            System.out.println("ESTA DIRIGIENDOSE HACIA EL OESTE");
        }
        if(direccion=='E'){
            System.out.println("ESTA DIRIGIENDOSE HACIA EL ESTE");
        }
        else {
            System.out.println("ESTAS FUERA DE CURSO SELECCIONA UNA NUEVA DIRECCION");
        }
    }

    public void restavida(int valor){

        System.out.println(getVida()-valor);
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getVida() {
        return vida;
    }
}
