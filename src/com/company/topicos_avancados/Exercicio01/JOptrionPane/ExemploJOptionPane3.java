package com.company.topicos_avancados.Exercicio01.JOptrionPane;

import javax.swing.*;

public class ExemploJOptionPane3 {
    public static void main(String[] args)  throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] opcoes = {"Sim", "Nao", "Sim, com e-mail"};

        int opcao = JOptionPane.showOptionDialog(null,"Voce gostario de finalizar o cadastro?",
                "Confirmação",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[2]);

        System.out.println("Opcao selecionada: " + opcao);

        if(opcao == 1){

        }
    }
}
