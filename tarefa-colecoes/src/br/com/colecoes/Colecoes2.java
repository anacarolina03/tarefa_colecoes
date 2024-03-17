package br.com.colecoes;

import java.util.Scanner;

public class Colecoes2 {
	
    public static void main(String[] args) {

        System.out.println("Pelo Scanner");

        Scanner scannerNomes = new Scanner(System.in);
        System.out.println("Digite o nome e o genero separados por traço, e separe cada pessoa (nome e gênero) separe por vírgula e sem dar espaço");
        System.out.println("Exemplo: Thiago da Silva-M,Ana Letícia-F,Rodrigo Fonseca-M,Mariana Dias-F");

        String resposta = scannerNomes.nextLine();
        String[] listaPessoas = resposta.split(",");


        System.out.println("Gênero Masculino:");
        for (int i = 0; i < listaPessoas.length; i++) {
            if (listaPessoas[i].contains("-M")) {
                System.out.println(listaPessoas[i]);
            }
        }

        System.out.println("Gênero Feminino:");
        for (int i = 0; i < listaPessoas.length; i++) {
            if (listaPessoas[i].contains("-F")) {
                System.out.println(listaPessoas[i]);
            }
        }
    }

}
