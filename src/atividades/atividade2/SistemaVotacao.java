package atividades.atividade2;

import java.util.Scanner;

public class SistemaVotacao {
    public static void main(String[] args) {
        System.out.println("Qual a sua idade?\n");
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();

        if(idade < 16){
            System.out.println("Não pode votar.");
        } else if (idade == 16  || idade == 17){
            System.out.println("Voto facultativo.");
        }else {
            System.out.println("Voto obrigatório.");
        }

    }
}
