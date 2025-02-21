package br.com.fiap.praticando.entradadados;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        int anoAtual, anoDeNascimento, idade;
        Scanner scanner;
        try {
            scanner = new Scanner(System.in);

            System.out.println("Digite o ano atual:");
            anoAtual = scanner.nextInt();

            System.out.println("Digite o seu ano de nascimento:");
            anoDeNascimento = scanner.nextInt();

            idade = anoAtual - anoDeNascimento;

            System.out.println("Sua idade é: " + idade + " anos");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
