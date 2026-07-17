package atividades.atividade4;
import java.util.Scanner;

public class GeradorDeFormas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha quantos Degrais você quer.\n");
        int limite = entrada.nextInt();
        char simbolo = '#';
        int limiteChar = 1;
        int degrais = 0;
        for (int x=degrais;x<limite;x++){
            for (int y=0;y<limiteChar;y++){
                System.out.print(simbolo);
            }
            limiteChar++;
            System.out.print("\n");
            degrais++;
        }
    }
}
//ignorar2