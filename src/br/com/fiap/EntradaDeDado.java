package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDado {
    public static void main(String[] args) {
        // Declaração e inicialização de variáveis e objetos
        int num1 = 0, num2 = 0, resultado = 0;
        Scanner scanner;

        try {
            scanner = new Scanner(System.in);  // instanciação
            System.out.println("Digite dois números inteiros:");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            resultado = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + resultado);
        }
        catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}
