public class Usuario {
    private String nome;
    private int numero;
    private double saldo;
    private boolean status;

    public Usuario(String nome, int numero){
        this.nome = nome;
        this.nome = numero;
        this.saldo = 0;
    }

    // Metodos especiais

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }


    // Metodos especificos

    public void depositar(int valor){
        if (valor > 0){
            this.saldo = this.getSaldo() + valor;
        }
    }
    public void levantar(int valor){
        if (valor > 0){
            this.saldo = this.getSaldo() + valor;
        }

    }

    public void changeSatus(){
        this.status = !status;
    }

    public String toString(){
        return "Nome: " + getNome() " Numero: " + getNumero() + "Saldo: " + getSaldo();
    }


}
