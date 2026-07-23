package aulas.heranca.atividade.zoobsb;

public class Main {
    public static void main(String[] args) {
        Animal loboGuara = new LoboGuara();
        Animal araraAzul = new AraraAzul();

        araraAzul.comer();
        araraAzul.emitirSom();
        //araraAzul.truque();

        loboGuara.comer();
        loboGuara.emitirSom();
        //loboGuara.deitarRolar();


    }
}
