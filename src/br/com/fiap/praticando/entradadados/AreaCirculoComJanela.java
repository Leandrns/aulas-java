package br.com.fiap.praticando.entradadados;

import javax.swing.*;

public class AreaCirculoComJanela {
    public static void main(String[] args) {
        final float PI = 3.14f;
        float raio, areaCirculo;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite o valor do raio do círculo:");
            raio = Float.parseFloat(aux);
            areaCirculo = PI*(raio*raio);
            JOptionPane.showMessageDialog(null, "A área do círculo é: " + areaCirculo + "cm²");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto!");
        }
    }
}
