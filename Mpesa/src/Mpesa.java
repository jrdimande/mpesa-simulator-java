package Mpesa.src;

import java.util.ArrayList;

public class Mpesa {
    private ArrayList<Usuario> usuarios;

    public Mpesa(){
        this.usuarios = new ArrayList<>();
    }
    Utils validar = new Utils();

    // Método para criar conta
    public void criarConta(String nome, int numero){

        if (validar.validarNumero(numero) == true){
            Usuario newUser = new Usuario(nome, numero);
            usuarios.add(newUser);
        }
    }

    // Método para remover conta
    public void removerConta(int numero){
        if (validar.validarNumero(numero) == true){
            for (int i = 0; i < usuarios.size(); i++){
                if (usuarios.get(i).getNumero() == numero){
                    usuarios.remove(i);
                }
            }
        }

    }

    // Método para desativar conta
    public void desativarConta(int numero){
        if (validar.validarNumero(numero) == true){
            for (int i = 0 ; i < usuarios.size() ; i++){
                if (usuarios.get(i).getStatus() == true && usuarios.get(i).getNumero() == numero){
                    usuarios.get(i).setStatus();
                }
            }

        }

    }

    // Método para reativar conta
    public void reativarConta(int numero){
        if (validar.validarNumero(numero) == true){
            for (int i = 0 ; i < usuarios.size() ; i++){
                if (usuarios.get(i).getStatus() == false && usuarios.get(i).getNumero() == numero){
                    usuarios.get(i).setStatus();
                }
            }
        }

    }

    // Método para retornar o objeco usuario
    public Usuario buscarUsuario(int numero){
        if (validar.validarNumero(numero)){
            for (int i = 0; i < usuarios.size(); i++){
                if (usuarios.get(i).getNumero() == numero){
                    return usuarios.get(i);
                }
        }

        }return null ;
    }

    // Método para listar usuários do mpesa
    public void listarUsuarios(){
        for (int i = 0; i < usuarios.size(); i++){
            System.out.println(usuarios.get(i).getNome());
        }
    }

    // Método para depositar valor
    public void depositar(int valor, int numero){
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNumero() == numero){
                if (valor > 0){
                    if (usuarios.get(i).getStatus() == true){
                        usuarios.get(i).setSaldo(usuarios.get(i).getSaldo() + valor);
                    }
                }
            }
        }
    }

    // Método para levantar valor
    public void levantar(int valor, int numero){

        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNumero() == numero && usuarios.get(i).getSaldo() >= valor){
                if (usuarios.get(i).getStatus() == true){
                    usuarios.get(i).setSaldo(usuarios.get(i).getSaldo() - valor);
                }
            }
        }
    }

    // Método para transferir valor de uma conta para outra
    public void transferirValor(int numeroEmissor, int numeroReceptor, int valor){
        if (validar.validarNumero(numeroEmissor) == true && validar.validarNumero(numeroReceptor) == true){
            Usuario emissor = buscarUsuario(numeroEmissor);
            Usuario receptor = buscarUsuario(numeroReceptor);

            if (emissor != null && receptor != null){
                if (emissor.getSaldo() >= valor && emissor.getStatus() && receptor.getStatus()){
                    emissor.setSaldo(emissor.getSaldo() - valor);
                    receptor.setSaldo(receptor.getSaldo() + valor);

                    Movimento movimento = new Movimento(emissor, receptor, valor);
                    emissor.getMovimentos().add(movimento);
                    receptor.getMovimentos().add(movimento);

                }
            }

        }

    }

}

