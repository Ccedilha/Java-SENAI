package atividades.atividade4;

public class SistemaCorrigido {
    public static void main(String[] args) {

        int valor = 1; //nome de variavel nao pode começar com número *_*
        int contador = 0; //tava faltando o ponto e virgula, mudei o valor para 1


        while (contador < 5){//O loop ocorria toda vez que o contador era maior que 0, que sempre era TRUE, e o loop também nao tinha incrementação pra parar o loop
            System.out.println("Iniciando em:" + contador);
            contador++;
        }
        exibirMensagens("Bem-vindo ao sistema",valor );// O metodo pede 2 argumentos e nessa linha so tinha 1, estava acima do "iniciando sistema" o que não fa sentido.
    }

    public static void exibirMensagens(String texto, int repeticoes){//Metodos static so podem "interagir" com outros metodos static
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(texto);
        }
    }
}
//ignorar1