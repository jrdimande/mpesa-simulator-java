package Mpesa.src;

public class Main {
    public static void main(String[] args){
        Mpesa m1 = new Mpesa();
        m1.criarConta("jack", 000);
        m1.criarConta("json", 001);

        m1.depositar(000, 200);
        m1.transferirValor(000, 001, 50);
        m1.buscarUsuario(001).mostrarMovimentos();

    }
}
