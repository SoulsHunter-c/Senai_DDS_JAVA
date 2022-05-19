package com.company.orientacao_a_objetos_parte2.heranca_e_modificador_protected;
public class Pessoa {
    String nome;
    protected int idade;
    public void seApresentar(){
        System.out.println("Olá, eu sou " + nome +
                ", e tenho " + idade + " anos.");
    }
}
