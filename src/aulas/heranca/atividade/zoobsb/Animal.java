package aulas.heranca.atividade.zoobsb;

public class Animal {
    String nome;
    double peso;
    String setorNoZoo;
    String regiao;

    public void emitirSom(){}
    public void comer(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSetorNoZoo() {
        return setorNoZoo;
    }

    public void setSetorNoZoo(String setorNoZoo) {
        this.setorNoZoo = setorNoZoo;
    }
}
