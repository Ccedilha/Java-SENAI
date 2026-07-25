package aulas.abstracao.animais;

public class Cachorro extends Animal{
    @Override
    public void comer() {
        super.comer();
    }

    @Override
    void mover() {
        System.out.println("O cachorro está correndo.");
    }
}
