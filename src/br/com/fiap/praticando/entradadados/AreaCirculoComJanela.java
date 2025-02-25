package br.com.fiap.praticando.entradadados;

import javax.swing.*;

public class AreaCirculoComJanela {
    public static void main(String[] args) {
        double raio, areaCirculo;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite o valor do raio do círculo:");
            raio = Double.parseDouble(aux);
            areaCirculo = Math.PI*(Math.pow(raio, 2));
            JOptionPane.showMessageDialog(null, "A área do círculo é: " + areaCirculo + "cm²");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto!");
        }
    }
}
