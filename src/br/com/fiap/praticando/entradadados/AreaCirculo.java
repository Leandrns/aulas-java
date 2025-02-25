package br.com.fiap.praticando.entradadados;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        // final double PI = 3.1415;
        double raio, areaCirculo;
        Scanner scanner;

        try {
            scanner = new Scanner(System.in);
            System.out.println("Digite o raio do círculo:");
            raio = scanner.nextDouble();
            // areaCirculo = PI*(raio*raio);
            areaCirculo = Math.PI * (Math.pow(raio, 2));

            System.out.println("A área do círculo é: " + areaCirculo + " cm²");
        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }

}
