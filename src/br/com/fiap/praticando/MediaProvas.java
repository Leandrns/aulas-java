package br.com.fiap.praticando;

import java.util.Scanner;

public class MediaProvas {
    public static void main(String[] args) {
        double prova1, prova2, prova3, prova4, media;
        Scanner scanner;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Digite a nota da prova 1: ");
            prova1 = scanner.nextDouble();
            System.out.println("Digite a nota da prova 2: ");
            prova2 = scanner.nextDouble();
            System.out.println("Digite a nota da prova 3: ");
            prova3 = scanner.nextDouble();
            System.out.println("Digite a nota da prova 4: ");
            prova4 = scanner.nextDouble();

            media = (prova1 + prova2 + prova3 + prova4)/4;
            System.out.println("A média das provas é: " + media);
        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}
