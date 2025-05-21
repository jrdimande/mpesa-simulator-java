package Mpesa.src;

public class Main {
    public static void main(String[] args){
        Mpesa m1 = new Mpesa();
        m1.criarConta("jack", 840000000);
        m1.criarConta("json", 840000001);

        m1.depositar(200, 840000001);
        m1.transferirValor(840000001, 840000000, 50);
        m1.buscarUsuario(840000000).mostrarMovimentos();
        m1.buscarUsuario(840000001).mostrarMovimentos();

        System.out.println(m1.buscarUsuario(840000000).toString());
        m1.transferirValor(840000000, 840000001, 150);
        System.out.println(m1.buscarUsuario(840000000).toString());
        System.out.println(m1.buscarUsuario(840000001).toString());

    }
}
