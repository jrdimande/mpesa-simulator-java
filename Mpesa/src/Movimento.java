package Mpesa.src;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Movimento {
    private Usuario emissor;
    private Usuario receptor;
    private double valor;
    private String data;

    public Movimento(Usuario emissor, Usuario receptor, int valor) {
        this.emissor = emissor;
        this.receptor = receptor;
        this.valor = valor;
        this.data = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public Usuario getEmissor(){
        return this.emissor;
    }
    public Usuario getReceptor(){
        return this.receptor;
    }
    public double getValor(){
        return  this.valor;
    }
    public String getData(){
        return this.data;
    }
    public String toString() {
        return "Remetente: " + emissor.getNome() +
                " (" + emissor.getNumero() + ") | " +
                "Beneficiário: " + receptor.getNome() +
                " (" + receptor.getNumero() + ") | " +
                "Valor: " + valor + " MZN | " +
                "Data: " + data;
    }

}
