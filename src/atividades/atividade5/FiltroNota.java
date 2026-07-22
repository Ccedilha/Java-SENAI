package atividades.atividade5;

import java.util.ArrayList;
import java.util.Scanner;

public class FiltroNota {
    static ArrayList<Double> notas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("Digite sua nota");
            notas.add(entrada.nextDouble());

        }
    }
}
