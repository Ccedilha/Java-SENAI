package aulas.abstracao.animais;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Aguia aguia = new Aguia();

        gato.setNome("Bartolomeu");
        gato.comer();
        gato.mover();

        cachorro.setNome("Amadeus");
        cachorro.comer();
        cachorro.mover();

        aguia.setNome("Passaro");
        aguia.cacar();
        aguia.comer();
        aguia.mover();


    }
}
