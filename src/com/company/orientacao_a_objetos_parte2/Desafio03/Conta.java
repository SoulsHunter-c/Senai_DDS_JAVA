package com.company.orientacao_a_objetos_parte2.Desafio03;

public class Conta {
    
    private String descricao;
    private Double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;
    private SituacaoConta situacaoConta;

    public Conta(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor, SituacaoConta situacaoConta) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
        this.situacaoConta = situacaoConta;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Conta(){
        situacaoConta = SituacaoConta.PENDENTE;
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
        if(situacaoConta == SituacaoConta.PENDENTE){
            System.out.println("DESCRICAO: " + getDescricao() + "\n" + "VALOR: " + getValor() + "\n" + "DATA DE VENCIMENTO: " + getDataVencimento() + "\n" + "FORNECEDOR: " + getFornecedor().nome + "\n" +
                    "SITUAÇÃO: " + situacaoConta);
            situacaoConta = SituacaoConta.PAGA;
        }
        else{
            System.err.println("A conta " + descricao + " está: " + situacaoConta);
        }
    }

    public void cancelar() {
        if(situacaoConta == SituacaoConta.PENDENTE){
            System.out.println("A conta "+ descricao +" foi cancelada.");
            situacaoConta = SituacaoConta.CANCELADA;
        }
        else{
            System.err.println("A conta "+ descricao+" nao pode ser cancelada.");
        }
    }

    public void setCliente(Cliente atacadista) {
    }
}
