package aulas.polimorfismo.exemplos.atividades;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Cadastro> dadosIncompletos = new ArrayList<>();
        Cadastro pessoa1 = new Cadastro("Joao", 22, "Professor");
        Cadastro pessoa2 = new Cadastro("Ian", 20); //Sem cargo
        Cadastro pessoa3 = new Cadastro("Ciclano");// Sem idade nem cargo

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);

    }
}
