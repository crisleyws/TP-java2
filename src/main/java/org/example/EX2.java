package org.example;

import java.util.Scanner;

//Desenvolva um programa que solicite ao usuário quatro notas bimestrais.
// O programa deve calcular a média e informar se o usuário foi aprovado (média >= 7), está em recuperação (média entre 5 e 6.9) ou foi reprovado (média < 5).

public class EX2 {
    static double media;
    static double notaBimestre1;
    static double notaBimestre2;
    static double notaBimestre3;
    static double notaBimestre4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Media Escolar.");
        System.out.print("Digite a Nota do 1º Bimestre: ");
        notaBimestre1 = sc.nextDouble();

        System.out.print("Digite a Nota do 2º Bimestre: ");
        notaBimestre2 = sc.nextDouble();

        System.out.print("Digite a Nota do 3º Bimestre: ");
        notaBimestre3 = sc.nextDouble();

        System.out.print("Digite a Nota do 4º Bimestre: ");
        notaBimestre4 = sc.nextDouble();
       calculoMedia();

        if ( media >= 7  ){
            System.out.println("O aluno passou de ano com a Media Escolar: " + media);
        } else if ( media >= 5 && media <= 6.9  ) {
            System.out.println("O aluno esta de recuperação com a Media Escolar: " + media);
        }else {
            System.out.println("O aluno esta reprovado com a Media Escolar: " + media);
        };

    }

    public static void calculoMedia() {
        media = (notaBimestre1 + notaBimestre2 + notaBimestre3 + notaBimestre4) / 4;

    }

}

