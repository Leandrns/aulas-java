package br.com.fiap.praticando;

import javax.swing.*;

public class MediaProvasComJanela {
    public static void main(String[] args) {
        double prova1, prova2, prova3, prova4, media;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite a nota da prova 1:");
            prova1 = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a nota da prova 2:");
            prova2 = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a nota da prova 3:");
            prova3 = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a nota da prova 4:");
            prova4 = Double.parseDouble(auxiliar);

            media = (prova1 + prova2 + prova3 + prova4) / 4;

            JOptionPane.showMessageDialog(null, "A média das provas é: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto!");
        }
    }
}
