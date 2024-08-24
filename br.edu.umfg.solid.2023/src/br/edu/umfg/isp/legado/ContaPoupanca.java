package br.edu.umfg.isp.legado;

public class ContaPoupanca implements IConta {
    private String documento;
    private String nome;

    private Double saldo = 0.0;

    public ContaPoupanca(String documento, String nome) {
        this.documento = documento;
        this.nome = nome;
    }

    @Override
    public void creditar(Double valor) {
        this.saldo += valor;
    }
    @Override
    public void debitar(Double valor) {
        this.saldo -= valor;
    }
    @Override
    public Double getSaldo() {
        return this.saldo;
    }
    @Override
    public void invertir(Double valor) {

    }
}
