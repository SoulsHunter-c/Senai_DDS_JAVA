package com.company.orientacao_a_objetos_parte2.construtores;
public class testeConstrutores {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João");
        System.out.println("Nome: " + p1.nome);
        Pessoa p2 = new Pessoa("Emanuel", 22);
        System.out.println("Nome: " + p2.nome + "  " + p2.idade + " Anos");
    }
}
