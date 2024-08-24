package br.edu.umfg.isp;

import br.edu.umfg.isp.legado.ContaCorrente;
import br.edu.umfg.isp.legado.ContaPoupanca;
import br.edu.umfg.isp.refatorado.*;

import java.util.ArrayList;

public class PrincipioDaSegregacaodeInterface {
    //Princípio da Segregação de Interface: Uma classe não deve ser forçada a implementar interfaces e métodos que não irá utilizar.
    // Este princípio declara que interfaces grandes e genéricas devem ser divididas em interfaces menores e mais específicas.
    // Isso permite que as classes implementem apenas as funcionalidades necessárias, reduzindo a complexidade e o acoplamento.
    public static void executarLegado(){
        System.out.println("\nLEGADO");
        ContaCorrente contaCorrente = new ContaCorrente("0001", "Simon");
        contaCorrente.creditar(1000.00);
        contaCorrente.debitar(500.00);

        ContaPoupanca contaPoupanca = new ContaPoupanca("0002", "Eloise");
        contaPoupanca.creditar(2000.00);
        contaPoupanca.debitar(1000.00);

        System.out.println("SALDO CONTA CORRENTE: R$" + contaCorrente.getSaldo());
        System.out.println("SALDO CONTA POUPANÇA: R$" + contaPoupanca.getSaldo());
    }

    public static void executarRefatorado(){
        System.out.println("\nREFATORADO");
        ContaCorrenteRefatorada contaCorrenteRefatorada = new ContaCorrenteRefatorada("Kate", "0003");
        contaCorrenteRefatorada.creditar(1000.00);
        contaCorrenteRefatorada.debitar(100.00);

        ContaPoupancaRefatorada contaPoupancaRefatorada = new ContaPoupancaRefatorada("Anthony", "0004");
        contaPoupancaRefatorada.creditar(5000.00);
        contaPoupancaRefatorada.debitar(1000.00);

        ContaInvestimento contaInvestimento = new ContaInvestimento("Benedict","0005");
        contaInvestimento.creditar(300.00);
        contaInvestimento.debitar(50.00);
        contaInvestimento.investir(100.00);

        ArrayList<IContaRefatorada> contas = new ArrayList<IContaRefatorada>();
        contas.add(contaCorrenteRefatorada);
        contas.add(contaPoupancaRefatorada);
        contas.add(contaInvestimento);
        imprimir(contas);
    }

    public static void imprimir (ArrayList<IContaRefatorada> contas){
        contas.stream().forEach(x-> {
            System.out.println("SALDO: R$" + x.getSaldo());
        });
    }
}
