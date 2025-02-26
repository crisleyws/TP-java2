package org.example;
import java.util.Scanner;

//Crie um programa que solicite ao usuário que cadastre uma senha e, em seguida, peça a senha novamente até que seja digitada corretamente.
public class EX9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        String confirmaSenha;

        System.out.println("Validador de Senha");
        System.out.print("Digite sua senha: ");
        senha = sc.nextLine();
        System.out.print("Digite sua senha novamente: ");
        confirmaSenha = sc.nextLine();

        while (!confirmaSenha.equals(senha)) {
            System.out.println("Senha incorreta!");
            System.out.print("Digite sua senha: ");
            confirmaSenha = sc.nextLine();
        }
        System.out.println("Senha salva com sucesso!");
    }
}
