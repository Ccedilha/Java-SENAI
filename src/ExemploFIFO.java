import java.util.ArrayList;

public class ExemploFIFO {
    public static void main(String[] args) {
        ArrayList<String> pilhaDePratos = new ArrayList<>();


        pilhaDePratos.add("Primeiro prato");
        pilhaDePratos.add("Segundo prato");
        pilhaDePratos.add("Terceiro prato");

        System.out.println(pilhaDePratos);

        pilhaDePratos.remove(pilhaDePratos.size()-1);

        System.out.println(pilhaDePratos);
    }
}
