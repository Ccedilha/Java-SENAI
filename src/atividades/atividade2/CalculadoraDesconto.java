package atividades.atividade2;

import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double desconto = 0;
        System.out.println("Informe o valor total da compra:\n");
        double valorCompra = scanner.nextDouble();


        if (valorCompra < 100){
            System.out.println("Valor total: "+valorCompra);
            return;
        } else if (valorCompra >= 100 && valorCompra <= 299.99) {
            desconto = 0.10;
        }else {
            desconto = 0.20;
        }
        double valorTotal = valorCompra - (valorCompra * desconto);
        double valorPoupado = valorCompra * desconto;
        System.out.printf(
                "Valor original: "+ valorCompra+"\n"+
                "Valor poupado: " + valorPoupado+ "\n"+
                "Valor final: "+ valorTotal
        );
    }
}
