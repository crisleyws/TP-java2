package org.example;
import java.util.Scanner;
//Escreva um programa que solicite ao usuário os comprimentos de três lados de um triângulo e determine se ele é equilátero, isósceles ou escaleno.
public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo de triangulo");
        System.out.println("Digite o tamanho do 1º lado do triangulo");
        double tamanho1 = sc.nextInt();
        System.out.println("Digite o tamanho do 2º lado do triangulo");
        double tamanho2 = sc.nextInt();
        System.out.println("Digite o tamanho do 3º lado do triangulo");
        double tamanho3 = sc.nextInt();

        if ( tamanho1 != tamanho2 && tamanho1 != tamanho3 && tamanho2 != tamanho3 ){
            System.out.println("triangulo escaleno");
        } else if (tamanho1 == tamanho2 && tamanho1 == tamanho3){
            System.out.println("triangulo equilátero");
        } else{
            System.out.println("triangulo isósceles");
        }
    }
}
