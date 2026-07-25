package aulas.abstracao.animais;

public abstract class Animal {
    private String nome;

    public void comer(){
        System.out.println("O "+nome+" está comendo...");
    }

    abstract void mover();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
