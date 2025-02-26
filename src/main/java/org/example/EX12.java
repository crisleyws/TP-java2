package org.example;

import java.util.Scanner;

//Crie um programa que solicite ao usuário uma frase e conte quantas palavras a frase contém.

public class EX12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String[] palavras;
        int contador = 0;
        System.out.println("Contagem de Palavras Enunciado");
        System.out.print("Digite uma frase: ");
        frase = sc.nextLine().trim();

        palavras = frase.split(" ");

        for (int i = 0; i < palavras.length; i++) {
            contador++;
        }

        System.out.println("numero de palavras: " + contador);
    }
}
