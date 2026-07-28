package aulas.polimorfismo.exemplos.atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Cadastro> dadosIncompletos = new ArrayList<>();

        Cadastro pessoa1 = new Cadastro("Joao", 22, "Professor");
        Cadastro pessoa2 = new Cadastro("Ian", 20); // Sem cargo
        Cadastro pessoa3 = new Cadastro("Ciclano"); // Sem idade nem cargo

        ArrayList<Cadastro> todosCadastros = new ArrayList<>();
        todosCadastros.add(pessoa1);
        todosCadastros.add(pessoa2);
        todosCadastros.add(pessoa3);

        for (Cadastro pessoa : todosCadastros) {
            if (pessoa.isIncompleto()) {
                dadosIncompletos.add(pessoa);
            }
        }

        System.out.println("=== Cadastros antes da atualização ===");
        for (Cadastro pessoa : todosCadastros) {
            System.out.println(pessoa);
        }
        
        System.out.println("\n=== Atualizando cadastros incompletos ===");
        for (int i = 0; i < dadosIncompletos.size(); i++) {
            Cadastro pessoa = dadosIncompletos.get(i);
            System.out.println("\nAtualizando: " + pessoa.getNome());

            if (pessoa.getIdade() == 0) {
                System.out.print("Digite a idade: ");
                int novaIdade = entrada.nextInt();
                entrada.nextLine();
                pessoa.setIdade(novaIdade);
            }

            if (pessoa.getCargo() == null) {
                System.out.print("Digite o cargo: ");
                String novoCargo = entrada.nextLine();
                pessoa.setCargo(novoCargo);
            }

            pessoa.atualizarStatus();
        }

        System.out.println("\n=== Cadastros depois da atualizacao ===");
        for (Cadastro pessoa : todosCadastros) {
            System.out.println(pessoa);
        }

        entrada.close();
    }
}