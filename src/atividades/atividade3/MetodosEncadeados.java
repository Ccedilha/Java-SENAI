package atividades.atividade3;

import java.util.Scanner;

public class MetodosEncadeados {
    public static void imprimirResultado(int resultado){
        System.out.println("Seu resultado é "+ resultado );
    }
    public static int subtrairNumeros(int x, int y){
        int resultadoSubtracao = x - y;
        return resultadoSubtracao;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número");
        int x = scanner.nextInt();
        System.out.println("Escolha outro número");
        int y = scanner.nextInt();

        imprimirResultado(subtrairNumeros(x,y));

    }
}
