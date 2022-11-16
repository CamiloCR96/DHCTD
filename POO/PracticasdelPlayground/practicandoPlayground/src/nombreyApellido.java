public class nombreyApellido {


        //atributos aqui
        private String nombre;
        private String apellido;


        public nombreyApellido(String nombre, String apellido){
            this.apellido=apellido;
            this.nombre=nombre;
        }
        //getters y setters aqui


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
