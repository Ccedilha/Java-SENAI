package atividades.atividade2;

import java.util.Scanner;

public class VerificadorDeIdade {

    public static boolean verificarMaioridade(int idade){
        if (idade < 18){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:\n");
        int idade = scanner.nextInt();
        scanner.close();
        if (verificarMaioridade(idade)){
            System.out.println("Acesso liberado");
        }else {
            System.out.println("Acesso negado");
        }
    }
}
