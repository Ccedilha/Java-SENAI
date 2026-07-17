package atividades.atividade2;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso:\n");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite sua altura:\n");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        double imc = (altura * altura) / peso;

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso Normal.");
        } else if (imc > 25.0 && imc <= 29.9){
            System.out.println("Sobrepeso.");
        }else {
            System.out.println("Obesidade.");
        }
    }
}