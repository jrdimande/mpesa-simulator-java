package Mpesa.src;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimento {
    private Usuario emissor;
    private Usuario receptor;
    private double valor;
    private String data;

    public Movimento(Usuario emissor, Usuario receptor, double valor){
        this.emissor = emissor;
        this.receptor = receptor;
        this.valor = valor;
        this.data = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public void mostrarDetalhes(){
        System.out.println("Remetente: " + capitalizeName(this.emissor.getNome()));
        System.out.println("Destinatario: " + capitalizeName(this.receptor.getNome()));
        System.out.println("Valor em meticais: " + valor + " Meticais");
        System.out.println("Data da transiao: " + data);


    }
    private String capitalizeName(String nome){
        String[] partes = nome.split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String parte : partes){
            if (!parte.isEmpty()){
                capitalized.append(Character.toUpperCase(parte.charAt(0))).append(parte.substring(1).toLowerCase()).append(" ");
            }
        }return capitalized.toString().trim();

    }

}
