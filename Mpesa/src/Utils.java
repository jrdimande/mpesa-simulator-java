package Mpesa.src;

public class Utils {

    // Função para validar número do usuário
    public boolean validarNumero(int numero){
        int tamanho = String.valueOf(numero).length();

        if (tamanho == 9){
            return true;
        }
    }

    // Função para validar valor
    public boolean validarValor(int numero){
        if (numero < 0){
            return true;
        }

    }

    // Funçao para validar nome do usuário
    public boolean validarNome(String nome){

    }

}
