public class UsuarioJuego {




    //ATRIBUTOS
    private String nombre;
    private String clave;
    private Integer puntaje=0;
    private Integer nivel;

    //CONSTRUCTOR
    public UsuarioJuego(String nombre,String clave){
        this.nombre=nombre;
        this.clave=clave;

    }


    //METODOS

    public void aumentarPuntaje(){

        this.puntaje+=1;
    }

    public void subirNivel(){
        this.nivel=0;
        this.nivel+=1;
    }
    public void bonus(Integer valor){

        this.puntaje+=valor;
        System.out.println("bonus: "+puntaje);
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
