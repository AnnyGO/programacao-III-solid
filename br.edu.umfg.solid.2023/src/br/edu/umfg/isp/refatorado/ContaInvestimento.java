package br.edu.umfg.isp.refatorado;

public class ContaInvestimento extends ContaAbstrata implements IContaInvestimento, IContaRefatorada{
    private Double investimento = 0.0;
    public ContaInvestimento(String nome, String documento) {
        super(nome, documento);
    }

    @Override
    public void investir(Double valor) {
        debitar(valor);
        this.investimento += valor;
    }

    @Override
    public Double getSaldo() {
        return super.getSaldo() + this.investimento;
    }
}
