package atividades.atividade5;
import java.util.ArrayList;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>(5);
        //int[] numeros = new int[5];
        int somatorioArray = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Escolha um número");
            listaDeNumeros.add(entrada.nextInt());
            entrada.nextLine();
            for(int numero : listaDeNumeros){
                somatorioArray+= listaDeNumeros.get(i);
                System.out.println(somatorioArray);
            }
            //}
        }
        //System.out.println(listaDeNumeros);
        //System.out.println(somatorioArray);
    }
}
