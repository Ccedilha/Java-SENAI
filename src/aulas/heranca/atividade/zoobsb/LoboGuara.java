package aulas.heranca.atividade.zoobsb;

public class LoboGuara extends Animal {
    private String andadura;
    public void emitirSom(){
        System.out.println("O Lobo Guará está uivando no cerrado!\n");
    }
    public void comer(){
        System.out.println("O Lobo Guará está comendo a carne de um roedor!\n");
    }
    public void deitarRolar(){
        System.out.println("O "+getNome()+" deitou e rolou!");
    }
}
