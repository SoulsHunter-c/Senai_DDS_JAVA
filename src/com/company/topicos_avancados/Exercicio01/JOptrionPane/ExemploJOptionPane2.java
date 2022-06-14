package com.company.topicos_avancados.Exercicio01.JOptrionPane;

import javax.swing.*;
import java.net.URL;

public class ExemploJOptionPane2 {
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null,"Seu cadastro foi realizado cm sucesso!");
        JOptionPane.showMessageDialog(null,"Atençao - email nao informado", "Atencao", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "Favor informar o CPF", "Erro", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);

        URL url = ExemploJOptionPane2.class.getResource("teste.png");

        Icon icone = new ImageIcon(url);

        JOptionPane.showMessageDialog(null,"Obrigado por escolher o SENAI", "SENAI", JOptionPane.INFORMATION_MESSAGE, icone);

    }
}
