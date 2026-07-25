package aulas.abstracao.animais;

public class Gato extends Animal implements AnimalTerrestre, AnimalCarnivoro{


    @Override
    public void comer() {
        super.comer();
    }

    @Override
    void mover(){
        System.out.println("O gato andou lentamente...");
    }

    @Override
    public void correr() {
        System.out.println("O gato está correndo");
    }

    @Override
    public void dormeNaTerra() {

    }

    @Override
    public void cacar() {
        System.out.println("O gato está caçando");
    }
}
