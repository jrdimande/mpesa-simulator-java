package Mpesa.src;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int numero;
    private double saldo;
    private ArrayList<Movimento> movimentos;
    private boolean status;

    public Usuario(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0;
        this.status = true;
        this.movimentos = new ArrayList<>();
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

    public void setStatus(){
        this.status = !status;
    }
    public boolean getStatus(){
        return this.status;
    }
    public ArrayList getMovimentos(){
        return this.movimentos;
    }



    // Métodos específicos
    public String toString(){
        return "Nome: " + getNome() + " Numero: " + getNumero() + " Saldo: " + this.getSaldo() + " MZN";
    }

    public void mostrarMovimentos(){
        for (int i = 0; i < this.movimentos.size(); i++){
            System.out.println(movimentos.get(i).toString());
        }
    }




}
