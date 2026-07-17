package atividades.atividade6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MelhoriaDeTarefas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true){
            System.out.print("Digite uma tarefa: ");
            tarefas.add(entrada.nextLine());

            System.out.println("Digite SIM para continuar\nDigite RREMOVER para remover um item");
            String opcao = entrada.nextLine();

            if (opcao.equals("remover")){}
            if (opcao.equals("fim")){
                break;
            }
        }


        Collections.sort(tarefas);
        System.out.println("Total de tarefas registradas: "+tarefas.size());

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i+1)+". "+tarefas.get(i));
        }
    }
}