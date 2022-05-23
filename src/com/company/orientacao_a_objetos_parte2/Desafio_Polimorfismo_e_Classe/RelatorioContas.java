package com.company.orientacao_a_objetos_parte2.Desafio_Polimorfismo_e_Classe;
public class RelatorioContas {
    public void exibirListagem(Conta[] contas) {
        for(int i = 0; i < contas.length ; i++){
            contas[i].relataConta();
        }
    }
}
