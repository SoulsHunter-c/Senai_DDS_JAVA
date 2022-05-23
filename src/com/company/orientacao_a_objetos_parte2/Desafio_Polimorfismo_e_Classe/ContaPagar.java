package com.company.orientacao_a_objetos_parte2.Desafio_Polimorfismo_e_Classe;

public class ContaPagar extends Conta {
    private Fornecedor fornecedor;

    public void relataConta() {
        System.out.println("===============================================");
        System.out.println("DESCRIÇÃO: " + this.getDescricao());
        System.out.println("DATA DE VENCIMENTO: " + this.getDataVencimento());
        System.out.println("FORNECEDOR: " + this.getFornecedor().getNome());
        System.out.println("SITUAÇÃO DA CONTA: " + this.getSituacaoConta());
        System.out.println("VALOR: " + this.getValor());
        System.out.println("===============================================");
    }

    public ContaPagar() {
    }
    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }
    public void pagar() {
        if (SituacaoConta.PAGA == this.getSituacaoConta()) {
            System.out.println("Não pode pagar uma conta que já está paga: " + this.getDescricao() + ".");
        }else {
            System.out.println("Pagando conta " + this.getDescricao() +
                    " no valor de " + this.getValor() + " e vencimento em " +
                    this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}

