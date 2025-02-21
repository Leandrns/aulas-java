package br.com.fiap.praticando;

import javax.swing.*;

public class IdadeComJanela {
    public static void main(String[] args) {
        int anoAtual, anoDeNascimento, idade;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite o ano atual:");
            anoAtual = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o seu ano de nascimento:");
            anoDeNascimento = Integer.parseInt(auxiliar);

            idade = anoAtual - anoDeNascimento;

            JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto!");
        }
    }
}
