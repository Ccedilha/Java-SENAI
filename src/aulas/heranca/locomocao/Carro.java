package aulas.heranca.locomocao;

public class Carro extends Veiculo {
    String cor;
    String categoria;
    String cambio;
    int quilometragem;



    public void ligarArCondicionado(){
        System.out.println("Ligando ar-condicionado do seu carro...");
    }
}
