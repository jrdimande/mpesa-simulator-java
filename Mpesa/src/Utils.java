package Mpesa.src;

public class Utils {

    // Função para validar número do usuário
    public boolean validarNumero(int numero){
        int tamanho = String.valueOf(numero).length();

        if (tamanho == 9){
            return true;
        }else {
            return false;
        }

    }

    public boolean validarValor(int numero){
        if (numero < 0){
            return true;
        }else {
            return false;
        }

    }

    public boolean validarNome(String nome){

    }

}
