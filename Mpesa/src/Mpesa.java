package Mpesa.src;

import java.util.ArrayList;

public class Mpesa {
    private ArrayList<Usuario> usuarios;

    public Mpesa(){
        this.usuarios = new ArrayList<>();
    }

    public void criarConta(String nome, int numero){
        Usuario newUser = new Usuario(nome, numero);
        usuarios.add(newUser);
    }

    public void removerConta(int numero){
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNumero() == numero){
                usuarios.remove(i);
            }
        }
    }

    public void desativarConta(int numero){
        for (int i = 0 ; i < usuarios.size() ; i++){
            if (usuarios.get(i).getStatus() == true && usuarios.get(i).getNumero() == numero){
                usuarios.get(i).setStatus();
            }
        }
    }
    public void reativarConta(int numero){
        for (int i = 0 ; i < usuarios.size() ; i++){
            if (usuarios.get(i).getStatus() == false && usuarios.get(i).getNumero() == numero){
                usuarios.get(i).setStatus();
            }
        }
    }

    public Usuario buscarUsuario(int numero){
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNumero() == numero){
                return usuarios.get(i);
            }
        }return null ;
    }

    public void listarUsuarios(){
        for (int i = 0; i < usuarios.size(); i++){
            System.out.println(usuarios.get(i).getNome());
        }
    }


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

    public void levantar(int valor, int numero){
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNumero() == numero && usuarios.get(i).getSaldo() >= valor){
                if (usuarios.get(i).getStatus() == true){
                    usuarios.get(i).setSaldo(usuarios.get(i).getSaldo() - valor);
                }
            }
        }
    }

    public void transferirValor(int numeroEmissor, int numeroReceptor, int valor){
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

