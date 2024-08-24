package br.edu.umfg.srp.refatorado;

public class Vendedor extends AbstractFuncionario{
    public Vendedor(String nome, Double salario) {
        super(nome, salario);
    }
    @Override
    public String getSalario(){
        return this.nome + " recebe um salário de R$: " + (this.salario + (this.salario * 0.10));
    }
}
