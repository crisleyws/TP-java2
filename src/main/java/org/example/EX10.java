package org.example;

import java.util.Random;
import java.util.Scanner;

public class EX10 {

        public static void main(String[] args) {

            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem vindo ao jogo da adivinhação");

            int numero = random.nextInt(100);
            int chute = -1;
            int tentativas = 10;

            System.out.println("Você tem 10 tentativas para acertar!");

            for (int i = 0; i < tentativas; i++) {
                System.out.printf("Tentativa %d: Digite um número: ", i + 1);
                chute = scanner.nextInt();

                if (chute == numero) {
                    System.out.println("Parabéns, você acertou!");
                    break;
                } else if (chute > numero) {
                    System.out.println("Tente um número menor.");
                } else {
                    System.out.println("Tente um número maior.");
                }
            }

            if (chute != numero) {
                System.out.printf("Que pena, você não acertou! O número era %d.\n", numero);
            }
        }
    }

