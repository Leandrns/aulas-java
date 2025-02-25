package br.com.fiap.praticando.entradadados;

import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {
        double baseMaior, baseMenor, altura, areaTrapezio;
        Scanner scanner;

        try {
            scanner= new Scanner(System.in);
            System.out.print("Digite o valor da base maior do trapézio:\n-> ");
            baseMaior = scanner.nextDouble();
            System.out.print("Digite o valor da base menor do trapézio:\n-> ");
            baseMenor = scanner.nextDouble();
            System.out.print("Digite o valor da altura do trapézio:\n-> ");
            altura = scanner.nextDouble();

            areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
            System.out.println("A área do trapézio é: " + areaTrapezio + " cm²");
        } catch (Exception e) {
            System.out.println("Formato de número inválido!");
        }
    }
}
