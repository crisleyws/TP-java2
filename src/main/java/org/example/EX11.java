package org.example;
import java.util.Scanner;

//Escreva um programa que solicite dois números ao usuário: um valor inicial e um incremento.
// O programa deve exibir uma sequência numérica a partir do valor inicial, aumentando de acordo com o incremento até ultrapassar 100.
public class EX11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorInicial;
        int valorDeIncremento;

        System.out.println(" Sequência Numérica Personalizada Enunciado");
        System.out.print("Digite um valor inicial: ");
        valorInicial = sc.nextInt();
        System.out.println("Digite um valor de incremento: ");
        valorDeIncremento = sc.nextInt();

        for (int i = valorInicial; i <= 100; i += valorDeIncremento ) {
            System.out.println(i);
        }
    }
}
