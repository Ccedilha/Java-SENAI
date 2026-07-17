package atividades.atividade2;

import java.util.Scanner;

public class detetiveNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número\n");
        int num = scanner.nextInt();
        scanner.nextLine();

        String parImpar;
        String negativoPositivo;

        if (num == 0){
            System.out.println("Seu número é 0");
            return;
        }

        if (num % 2 == 0){
            parImpar = "Par.";
        }else {
            parImpar = "Impar.";
        }

        if (num < 0){
            negativoPositivo = "Negativo.";
        }else {
            negativoPositivo = "Positivo.";
        }

        System.out.printf("O número é "+parImpar+"\n"+
                           "O número é "+negativoPositivo );

    }
}
