package br.com.fiap.praticando.entradadados;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner scanner;

        try {
            scanner = new Scanner(System.in);
            System.out.print("Digite o valor de a:\n-> ");
            a = scanner.nextDouble();
            System.out.print("Digite o valor de b:\n-> ");
            b = scanner.nextDouble();
            System.out.print("Digite o valor de c:\n-> ");
            c = scanner.nextDouble();

            delta = Math.pow(b, 2) - 4 * a * c;

            x1 = ((-b) + Math.sqrt(delta)) / 2*a;
            x2 = ((-b) - Math.sqrt(delta)) / 2*a;

            System.out.println("O valor de x1 é: " + x1);
            System.out.println("O valor de x2 é: " + x2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
