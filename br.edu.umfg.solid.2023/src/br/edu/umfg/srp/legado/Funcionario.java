package br.edu.umfg.srp.legado;

public class Funcionario {
    private String nome;
    private Double salario;
    private TipoFuncionario tipoFuncionario;

    public Funcionario (String nome, Double salario, TipoFuncionario tipoFuncionario){
        this.nome = nome;
        this.salario = salario;
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getSalario(){
        //Fere o princípio de responsabilidade única, pois uma mesma função está fazendo
        // o cálculo de salário de tipos funcionários diferentes
        if (TipoFuncionario.Estagiario.equals(this.tipoFuncionario)){

            return this.nome + " recebe um salário de: R$" + this.salario;
        }
        return this.nome + " recebe um salário de: R$" + (this.salario +  (this.salario * 0.10));
    }
}
