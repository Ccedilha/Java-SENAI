package aulas.heranca.atividade.zoobsb;

public class AraraAzul extends Animal{
    private String coloracao;
    public void emitirSom(){
        System.out.println("A Arara-azul emite um grito forte e estridente!\n");
    }
    public void comer(){
        System.out.println("A Arara Azul está comendo sementes.");
    }
    public void truque(){
        System.out.println("A arara azul alçoou voo, deu uma volta no zoologico e voltou!");
    }
}
