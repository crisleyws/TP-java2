package org.example;

import java.util.Scanner;
//Crie um programa que peça ao usuário um valor em reais e uma moeda de destino (dólar, euro ou libra).
// O programa deve converter o valor informado na moeda escolhida com base em taxas de câmbio pré-definidas no código.


public class EX3 {
    static String moeda;
    static double valor;
    static double valorConvertido;
    static double dolar = 0.17;
    static double euro = 0.16;
    static double libra = 0.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de Moedas");
        System.out.print("Digite o valor em reais: ");
        valor = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a moeda de destino (dolar, euro, libra): ");
        moeda = sc.nextLine().toLowerCase();

        Conversor(moeda);

        System.out.printf("Valor do Moeda: %.2f , %s%n", valorConvertido, moeda);
    }

    public static void Conversor(String moeda) {
        if (moeda.equals("dolar")) {
            valorConvertido = valor * dolar;
        } else if (moeda.equals("euro")) {
            valorConvertido = valor * euro;
        } else if (moeda.equals("libra")) {
            valorConvertido = valor * libra;
        }


    }

    ;
};