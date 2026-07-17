package atividades.atividade4;

import java.util.Scanner;

public class abrirCofre {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cofre fechado, tente descobrir o codigo.");
        int tentativa = entrada.nextInt();
        entrada.nextLine();
        int senha = 9999;
        int numeroDeTentativas = 0;
        int[] tentativas = new int[5];
        while (tentativa != senha && numeroDeTentativas < 4){
            tentativas[numeroDeTentativas] = tentativa;
            numeroDeTentativas++;
            int naoSeiComoFazerIsso = 4 - numeroDeTentativas;
            System.out.println("Código errado, restam "+naoSeiComoFazerIsso+ " tentativas...");
            tentativa = entrada.nextInt();
        }
        if(tentativa == senha){
            System.out.println("Cofre aberto!");

        }else {
            for (int i = 0; i < numeroDeTentativas; i++) {
                System.out.println(tentativas[i]);
            }
            System.out.println("... Cofre bloqueado!");
        }

    }
}
//ignorar3
