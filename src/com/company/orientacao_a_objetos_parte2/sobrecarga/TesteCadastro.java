package com.company.orientacao_a_objetos_parte2.sobrecarga;
public class TesteCadastro {
    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("José",32);
        cadastro.cadastrar(pessoa);
    }
}
