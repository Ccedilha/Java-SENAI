package atividades.atividade6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MelhoriaDeTarefas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5 - remover tarefa");
            tarefas.add(entrada.nextLine());

            System.out.println("Digite SIM para continuar\nDigite RREMOVER para remover um item");
            String opcao = entrada.nextLine();

            if (opcao.equals("remover")){
                System.out.println("Deseja remover o primeiro ou o último item?\n");
                String opcaoRemover = entrada.nextLine();
                if (opcaoRemover.equals("ultimo")){
                    tarefas.remove(tarefas.size()-1);
                }else {
                    tarefas.remove(tarefas.size());

                }

            }
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