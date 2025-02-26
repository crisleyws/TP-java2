package org.example;

import java.util.Scanner;

//Crie um programa que solicite ao usuário seu salário bruto anual e calcule o imposto de renda a pagar com base em alíquotas definidas no código.
// Utilize faixas de renda progressivas para calcular o imposto.

// Dados do imposto de renda https://www.taxgroup.com.br/intelligence/tabela-irpf-2025-entenda-como-funciona-o-imposto-de-renda-da-pessoa-fisica/
public class EX7 {
    static double imposto;
    static double salario;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de imposto de renda.");
        System.out.print("Informe seu salario: ");
        salario = sc.nextDouble();

        impostoDeRenda(salario);

        System.out.printf("Imposto de Renda: R$%.2f ", imposto);

    }

    public static void impostoDeRenda(double salario) {
        if (salario <= 2259.20) {
            imposto = 0;
        } else if (salario <= 2826.65) {
            imposto = (salario - 2259.20) * 0.075;
        } else if (salario <= 3751.05) {
            imposto = (2826.65 - 2259.20) * 0.075 + (salario - 2826.65) * 0.15;
        } else if (salario <= 4664.68) {
            imposto = (2826.65 - 2259.20) * 0.075 + (3751.05 - 2826.65) * 0.15 + (salario - 3751.05) * 0.225;
        } else {
            imposto = (2826.65 - 2259.20) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (salario - 4664.68) * 0.275;
        }
    }


}
