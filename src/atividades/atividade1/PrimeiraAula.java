package atividades.atividade1;

import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args) {
        String nome;
        int idade;
        float altura;
        String cargo;
        String periodo;

        System.out.println("Qual o seu nome?");
        Scanner entrada1 = new Scanner(System.in);
        nome = entrada1.nextLine();
        System.out.println("Qual a sua idade");
        Scanner entrada2 = new Scanner(System.in);
        idade = Integer.parseInt(entrada2.nextLine());
        System.out.println("Qual a sua altura?");
        Scanner entrada3 = new Scanner(System.in);
        altura = Float.parseFloat(entrada3.nextLine());
        System.out.println("Qual o seu cargo?");
        Scanner entrada4 = new Scanner(System.in);
        cargo = entrada4.nextLine();
        System.out.println("Qual período você frequenta o SENAI?");
        Scanner entrada5 = new Scanner(System.in);
        periodo = entrada5.nextLine();




        System.out.println("Suas informações: \n"+"Nome: "+nome+"\n" +"Idade: "+idade+"\n"+"Altura: "+altura+"\n"+"Cargo: " + cargo+"\n"+"Período: "+ periodo);
    }
}
