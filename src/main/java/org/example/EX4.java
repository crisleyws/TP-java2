package org.example;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
//Escreva um programa que solicite a data de nascimento do usuário (dia, mês e ano) e calcule sua idade em dias.

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia de nascimento (DD): ");
        int dia = sc.nextInt();

        System.out.print("Digite o mês de nascimento (MM): ");
        int mes = sc.nextInt();

        System.out.print("Digite o ano de nascimento (AAAA): ");
        int ano = sc.nextInt();

       LocalDate dataAtual = LocalDate.now();
       LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

       long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        System.out.println("Idade em dia: " + idadeEmDias);

    }
}
