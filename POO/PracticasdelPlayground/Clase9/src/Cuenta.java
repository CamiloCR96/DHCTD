public class Cuenta extends CuentaCorriente {

    private String numero;
    private Double saldo;

    public Cuenta(Double descubierto, String numero, Double saldo) {
        super(descubierto);
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double extraerDinero(){

       return saldo-=getDescubierto();



    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
