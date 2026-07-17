package atividades.atividade2;

import java.util.Scanner;

public class mediaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota número um:\n");
        double nota1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Nota número dois:\n");
        double nota2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Nota número três:\n");
        double nota3 = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        double mediaAritmetica = (nota1 + nota2 + nota3) / 3;

        if(mediaAritmetica >= 7.0){
            System.out.println("Aprovado!");
        } else if (mediaAritmetica >= 5.0  || mediaAritmetica <= 6.9){
            System.out.println("Em recuperação.");
        }else {
            System.out.println("Reprovado.");
        }
    }
}
