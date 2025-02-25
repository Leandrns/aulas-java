package br.com.fiap.praticando.entradadados;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        double base, altura, areaTriangulo;
        Scanner scanner;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Digite o valor da base do triângulo:");
            base = scanner.nextDouble();
            System.out.println("Digite o valor da altura do triângulo:");
            altura = scanner.nextDouble();

            areaTriangulo = (base * altura) / 2;
            System.out.println("A área do triângulo é: " + areaTriangulo + " cm²");
        } catch (Exception e) {
            System.out.println("Formato de número inválido!");
        }
    }
}
