package br.com.fiap;

import javax.swing.*;

public class EntradaComJanela {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, resultado = 0;
        String auxiliar;

        try {
            // JOptionPane: cria janelas
            auxiliar = JOptionPane.showInputDialog("Digite um número inteiro");
            num1 = Integer.parseInt(auxiliar);  // converte String em Int

            auxiliar = JOptionPane.showInputDialog("Digite outro número inteiro");
            num2 = Integer.parseInt(auxiliar);  // converte String em Int

            resultado = num1 + num2;

            JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + resultado);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto!");
        }
    }
}
