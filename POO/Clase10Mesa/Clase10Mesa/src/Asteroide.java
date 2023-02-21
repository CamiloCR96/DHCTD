public class Asteroide extends ObjetoGrafico{

    private int lesion;


    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        System.out.println("Asteroide  ubicado en esta posicion en el eje x : "+x+" en el eje y: "+y+" con direccion: "+direccion);
    }

    public int getLesion() {
        return lesion;
    }
}
