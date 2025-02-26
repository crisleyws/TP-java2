package org.example;

import java.util.Scanner;

public class EX5 {
    static double valorComDesconto;
    static double desconto;

    public static void main(String[] args) {
        double valor;

        Scanner entrada = new Scanner(System.in);
        System.out.println(" Calculadora de Descontos Progressivos");
        System.out.print("Digite o valor do produto: ");
        valor = entrada.nextDouble();

        desconto(valor);

        System.out.printf("O valor do Produto com desconto fica R$%.2f, valor original R$%.2f, o valor do desconto foi de R$%.2f", valorComDesconto, valor, desconto);
    }

    public static void desconto(double valor) {
        if (valor >= 1000) {
             desconto = valor * 0.10;
            valorComDesconto = valor - desconto ;
        } else if (valor >= 500) {
            desconto = valor * 0.05;
            valorComDesconto =   valor - desconto ;
        } else {
            valorComDesconto = valor;
        }
    }
}
