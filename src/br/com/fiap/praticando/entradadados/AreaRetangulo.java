package br.com.fiap.praticando.entradadados;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        double base, altura, areaRetangulo;
        Scanner scanner;
         try {
             scanner = new Scanner(System.in);
             System.out.println("Digite o valor da base do retângulo:");
             base = scanner.nextDouble();
             System.out.println("Digite o valor da altura do retângulo:");
             altura = scanner.nextDouble();

             areaRetangulo = base * altura;
             System.out.println("A área do retângulo é: " + areaRetangulo + " cm²");
         } catch (Exception e) {
             System.out.println("Formato de número inválido!");
         }
    }
}
