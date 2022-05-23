package com.company.orientacao_a_objetos_parte2.Desafio_Polimorfismo_e_Classe;

public class ContaReceber extends Conta {
    private Cliente cliente;
    public void relataConta() {
        System.out.println("===============================================");
        System.out.println("DESCRICAÇÃO: " + this.getDescricao());
        System.out.println("DATA DE VENCIMENTO: " + this.getDataVencimento());
        System.out.println("CLIENTE: " + this.getCliente().getNome());
        System.out.println("SITUAÇÃO DA CONTA: " + this.getSituacaoConta());
        System.out.println("VALOR: " + this.getValor());
        System.out.println("===============================================");
    }
    public ContaReceber() {
    }
    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }
    public void cancelar() {
        if (this.getValor() > 50000d) {
            System.out.println("A conta " + this.getDescricao() + " nao pode ser cancelada.");
        } else {
            super.cancelar();
        }
    }
    public void receber() {
        if (SituacaoConta.PAGA == this.getSituacaoConta()) {
            System.out.println("Não pode receber conta: " + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA == this.getSituacaoConta()) {
            System.out.println("A conta " + this.getDescricao() + " ja esta cancelada");
        } else {
            System.out.println("Conta: " + this.getDescricao() + "\n Valor: " + this.getValor() + "\n Vencimento: " + this.getDataVencimento() +
                    "\n Cliente: " + this.getCliente().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}