package org.example;

import java.util.Scanner;
//Crie um programa em Java que solicite ao usuário seu nome completo, idade, nome da mãe e nome do pai.
// O programa deve exibir as informações de forma organizada e verificar se o nome do usuário tem mais letras que o nome da mãe ou do pai.

public class EX1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastro de Usuário");

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome da sua mãe: ");
        String nomeDaMae = sc.nextLine();

        System.out.println("Digite o nome do seu pai: ");
        String nomeDoPai = sc.nextLine();


        System.out.println("Seu Nome: " + nome);
        System.out.println("Seu Idade: " + idade);
        System.out.println("Nome Da Mae: " + nomeDaMae);
        System.out.println("Nome Do Pai: " + nomeDoPai);

        if (nomeDaMae.length() > nomeDoPai.length()) {
            System.out.println("O nome da sua Mãe é maior, ele contem: " + nomeDaMae.length() + " letras");
        } else {
            System.out.println("O nome do seu Pai é maior, ele contem: " + nomeDoPai.length() + " letras");
        }
        ;

    }
}