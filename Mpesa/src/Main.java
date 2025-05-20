package Mpesa.src;

public class Main {
    public static void main(String[] args){
        Mpesa m1 = new Mpesa();
        m1.criarConta("jack", 84003);
        m1.criarConta("json", 84004);

        m1.depositar(200, 84003);
        m1.transferirValor(84003, 84004, 50);
        m1.buscarUsuario(84003).mostrarMovimentos();
        m1.buscarUsuario(84004).mostrarMovimentos();

        System.out.println(m1.buscarUsuario(84003).toString());
        m1.transferirValor(84003, 84004, 150);
        System.out.println(m1.buscarUsuario(84004).toString());
        System.out.println(m1.buscarUsuario(84003).toString());

    }
}
