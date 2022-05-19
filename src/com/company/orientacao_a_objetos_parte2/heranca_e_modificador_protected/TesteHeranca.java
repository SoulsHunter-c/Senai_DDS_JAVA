package com.company.orientacao_a_objetos_parte2.heranca_e_modificador_protected;
public class TesteHeranca {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        j.nome = "Ronaldo";
        j.idade = 33;
        j.seApresentar();
        j.dizerSeAindaJoga();
    }
}