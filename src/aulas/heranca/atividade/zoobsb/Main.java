package aulas.heranca.atividade.zoobsb;

public class Main {
    public static void main(String[] args) {
        LoboGuara loboGuara = new LoboGuara();
        AraraAzul araraAzul = new AraraAzul();

        araraAzul.comer();
        araraAzul.emitirSom();
        araraAzul.truque();

        loboGuara.setNome("Lobin");
        loboGuara.comer();
        loboGuara.emitirSom();
        loboGuara.deitarRolar();


        System.out.println(loboGuara.getNome());

    }
}
