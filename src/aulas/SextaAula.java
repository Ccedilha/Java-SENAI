package aulas;

import aulas.objeto.Pessoa;

public class SextaAula {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(
                "M",
                2005,
                "Ian",
                "Branco",
                "ç"
        );
        pessoa1.getNome();


        System.out.println(pessoa1);
    }
}