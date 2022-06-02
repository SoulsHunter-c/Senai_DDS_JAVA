package com.company.orientacao_a_objetos_parte2.Desafio_Excessoes;

public class ContaReceber extends Conta {
    private Cliente cliente;
    public ContaReceber() {
    }
    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }
    public void cancelar() throws OperacaoContaException {
        if (this.getValor() > 50000d) {
            throw new OperacaoContaException("A conta " + this.getDescricao() + " nao pode ser cancelada.");
        } else {
            super.cancelar();
        }
    }
    public void receber() throws OperacaoContaException {
        if (SituacaoConta.PAGA == this.getSituacaoConta()) {
            throw new OperacaoContaException("Não pode receber conta: " + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA == this.getSituacaoConta()) {
            throw new OperacaoContaException("A conta " + this.getDescricao() + " ja esta cancelada");
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