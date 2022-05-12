package com.company.orientacao_a_objetos_parte2.Desafio03;
public class ContaPagar {
    private String descricao;
    private Double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ContaPagar(){

    }
    public ContaPagar(Fornecedor fornecedor,String descricao, Double valor, String dataVencimento){
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    void pagar(){
        System.out.println("DESCRICAO: " + getDescricao() + "\n" + "VALOR: " + getValor() + "\n" + "DATA DE VENCIMENTO: " + getDataVencimento() + "\n" + "FORNECEDOR: " + getFornecedor().nome);
    }

}
