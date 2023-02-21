public class ObjetoGrafico {
    private int posx;
    private int posy;
    private char direccion;

    public ObjetoGrafico(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(int x , int y, char direccion){
        System.out.println("Usted esta ubicado en esta posicion en el eje x : "+x+" en el eje y: "+y+" con direccion: "+direccion);
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public char getDireccion() {
        return direccion;
    }
}
