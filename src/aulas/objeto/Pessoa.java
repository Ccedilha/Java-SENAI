package aulas.objeto;

public class Pessoa {
    public String nome;
    public int anoNascimento;
    public String genero;
    public String cor;
    public String profissao;

    public Pessoa(String genero, int anoNascimento, String nome, String cor, String profissao) {
        this.genero = genero;
        this.anoNascimento = anoNascimento;
        this.nome = nome;
        this.cor = cor;
        this.profissao = profissao;
    }

    @Override
    public String toString(){
        return nome+", "+
                anoNascimento+", "+
                genero+", "+
                cor+", "+
                profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
