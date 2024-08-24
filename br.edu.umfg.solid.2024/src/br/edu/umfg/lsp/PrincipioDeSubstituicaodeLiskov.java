package br.edu.umfg.lsp;
import br.edu.umfg.lsp.legado.Aluno;
import br.edu.umfg.lsp.legado.AlunoEAD;
import br.edu.umfg.lsp.refatorado.AlunoAbstrato;
import br.edu.umfg.lsp.refatorado.AlunoEADRefatorado;
import br.edu.umfg.lsp.refatorado.AlunoPresencial;

public class PrincipioDeSubstituicaodeLiskov {
    //Princípio de Substituição de Liskov: Uma classe derivada deve ser substituível por sua classe base.

    //Este princípio declara que que uma classe derivada deve ser capaz de substituir a classe base
    // sem que o comportamento esperado mude. Para seguir esse princípio, subclasses devem
    // respeitar o contrato definido pela classe base.
    public static void executarLegado(){
        System.out.println("\nLEGADO");
        Aluno aluno1 = new Aluno("1", "Claudinho");
        AlunoEAD aluno2 = new AlunoEAD("2", "Otavinho", "otavinho@gmail", "otavinhodopneu");

        aluno2.setNotaFinal(6.1);
        System.out.println("RA | NOME | NOTA FINAL");
        System.out.println(aluno1.getRa() + " | " + aluno1.getNome() + " | " + aluno1.getNotaFinal());
        System.out.println(aluno2.getRa() + " | " + aluno2.getNome() + " | " + aluno2.getNotaFinal());
    }

    public static void executarRefatorado(){
        System.out.println("\nREFATORADO");
        AlunoPresencial aluno3 = new AlunoPresencial("3", "Luizinho", 9.8);
        AlunoEADRefatorado aluno4 = new AlunoEADRefatorado("4", "Zézinho", 6.7,"ze@email.com","zedamanga");
        System.out.println("RA | NOME | NOTA FINAL");
        imprimir(aluno3);
        imprimir(aluno4);
    }

    private static void imprimir (AlunoAbstrato aluno){
        System.out.println(aluno.getRa() + " | " + aluno.getNome() + " | " + aluno.getNotaFinal());
    }
}
