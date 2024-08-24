package br.edu.umfg.isp.refatorado;

public class ContaCorrenteRefatorada extends ContaAbstrata implements IContaRefatorada{
    public ContaCorrenteRefatorada(String nome, String documento) {
        super(nome, documento);
    }
}
