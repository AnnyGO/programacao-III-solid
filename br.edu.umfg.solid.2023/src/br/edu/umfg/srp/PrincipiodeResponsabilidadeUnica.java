package br.edu.umfg.srp;

import br.edu.umfg.srp.legado.Funcionario;
import br.edu.umfg.srp.legado.TipoFuncionario;
import br.edu.umfg.srp.refatorado.Estagiario;
import br.edu.umfg.srp.refatorado.Vendedor;

public class PrincipiodeResponsabilidadeUnica {
    //Princípio de Responsabilidade Única: Cada classe deve ter um, e somente um, motivo para mudar.

    //Esse princípio declara que uma classe deve ser especializada em um único assunto e possuir apenas uma
    // responsabilidade dentro do software, ou seja, a classe deve ter uma única tarefa ou ação para executar.
    public static void executarLegado(){
        System.out.println("\nLEGADO");
        Funcionario estagiario = new Funcionario("João", 600.00, TipoFuncionario.Estagiario);
        Funcionario vendedor = new Funcionario("Ana", 2000.00, TipoFuncionario.Vendedor);

        System.out.println(estagiario.getSalario());
        System.out.println(vendedor.getSalario());
    }

    public static void executarRefatorado(){
        System.out.println("\nREFATORADO");
        Estagiario estagiario = new Estagiario("João", 700.00);
        Vendedor vendedor = new Vendedor("Ana", 3000.00);

        System.out.println(estagiario.getSalario());
        System.out.println(vendedor.getSalario());
    }
}
