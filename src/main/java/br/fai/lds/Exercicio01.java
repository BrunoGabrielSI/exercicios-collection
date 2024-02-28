package br.fai.lds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Exercicio01 app = new Exercicio01();
        app.start();
    }

    private void start() {

        List<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (lista.size()< 5){
            System.out.println("DIGITE O VALOR: ");
   //         String valor = scanner.nextLine();
            String valor = obterDados();

            if (valor.isEmpty() || valor.equals("Invalido")){
                continue;
            }

            lista.add(valor);
        }

        for (String item: lista){
            System.out.println("VALOR DIGITADO: " + item);
        }

        lista.add("Item adicionado automaticamente 01");
        lista.add("Item adicionado automaticamente 02");

        lista.remove(1);
        lista.remove(1);
        for (int i = 0; i < lista.size(); i++){
            String item = lista.get(i);
            System.out.println("item da lista: " + item);
        }

    }
    private String obterDados() {
        Scanner scanner = new Scanner(System.in);
    //    String valor = scanner.nextLine();

        try {
            int valorInteiro = scanner.nextInt();
            System.out.println("valor inteiro: " + valorInteiro);

            return String.valueOf(valorInteiro);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return "Invalido";
        }


    }
}
