package aulas.abstracao.animais;

public class Aguia extends Animal implements AnimalVoador,AnimalCarnivoro{
    @Override
    void mover() {
        System.out.println("Pulando de galho em galho");
    }

    @Override
    public void voar() {
        System.out.println("A águia está voando");
    }

    @Override
    public void cacar() {
        System.out.println("A águia está caçando");
    }
}
