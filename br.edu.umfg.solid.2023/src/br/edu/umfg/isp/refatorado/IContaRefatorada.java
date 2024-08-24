package br.edu.umfg.isp.refatorado;

public interface IContaRefatorada {
    void creditar(Double valor);
    void debitar(Double valor);
    Double getSaldo();

}
