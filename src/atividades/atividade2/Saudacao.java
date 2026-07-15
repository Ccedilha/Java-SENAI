package atividades.atividade2;

import java.util.Scanner;



public class Saudacao {
    public static void imprimirSaudacao(String nome){
        System.out.println(
                "Olá, "+ nome+
                 " ! Bem vindo(a) à nossa aula de métodos."

        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:\n");
        String nome = scanner.nextLine();

        scanner.close();

        imprimirSaudacao(nome);

    }
}
