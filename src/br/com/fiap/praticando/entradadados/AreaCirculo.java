package br.com.fiap.praticando.entradadados;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        final float PI = 3.14f;
        float raio, areaCirculo;
        Scanner scanner;

        try {
            scanner = new Scanner(System.in);
            System.out.println("Digite o raio do círculo:");
            raio = scanner.nextFloat();
            areaCirculo = PI*(raio*raio);

            System.out.println("A área do círculo é: " + areaCirculo + " cm²");
        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }

}
