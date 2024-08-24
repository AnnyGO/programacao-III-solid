package br.edu.umfg.isp.refatorado;

public class ContaPoupancaRefatorada extends ContaAbstrata implements IContaRefatorada{
    public ContaPoupancaRefatorada(String nome, String documento) {
        super(nome, documento);
    }
}
