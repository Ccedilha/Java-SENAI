package atividades.atividade3;

import java.util.Scanner;

public class CalcularDobro {
    public static int calculaDobro(int num){
        int dobradorDaSilva = num * 2;
        return dobradorDaSilva;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:\n");
        int num = scanner.nextInt();

        System.out.println("O dobro do seu número é "+ calculaDobro(num));
    }
}
