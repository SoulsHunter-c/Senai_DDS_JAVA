package com.company.orientacao_a_objetos_parte2.Desafio_Excessoes;

public class Conta {
    String descricao;
    Double valor;
    String dataVencimento;
    Fornecedor fornecedor;
    SituacaoConta situacaoConta;


    public Conta() {
    }

    public Conta(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor, SituacaoConta situacaoConta) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
        this.situacaoConta = situacaoConta;
    }

    void pagar() throws OperacaoContaException {
        if (situacaoConta == SituacaoConta.PENDENTE) {
            System.out.println("DESCRICAO: " + getDescricao() + "\n" + "VALOR: " + getValor() + "\n" + "DATA DE VENCIMENTO: " + getDataVencimento() + "\n" + "FORNECEDOR: " + getFornecedor().nome + "\n" +
                    "SITUAÇÃO: " + situacaoConta);
            situacaoConta = SituacaoConta.PAGA;
        } else {
            System.err.println("A conta " + descricao + " está: " + situacaoConta);
        }
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public void setSituacaoConta(SituacaoConta situacaoConta) {
        this.situacaoConta = situacaoConta;
    }

    public void cancelar() throws OperacaoContaException {
        if(situacaoConta == SituacaoConta.PENDENTE){
            System.out.println("A conta "+ descricao +" foi cancelada.");
            situacaoConta = SituacaoConta.CANCELADA;
        }
        else{
            throw new OperacaoContaException("A conta "+ descricao+" nao pode ser cancelada.");
        }
    }
}