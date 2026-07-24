package aulas.polimorfismo.exemplos.atividades;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cadastro pessoa1 = new Cadastro("Joao", 22, "Professor");
        Cadastro pessoa2 = new Cadastro("Fulano", 33);
        Cadastro pessoa3 = new Cadastro("Ciclano");

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);

        //if (pessoa1 > 0){}
    }
}
