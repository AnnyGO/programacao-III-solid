import br.edu.umfg.dip.PrincipiodeInversaoDeDependencia;
import br.edu.umfg.isp.PrincipioDaSegregacaodeInterface;
import br.edu.umfg.lsp.PrincipioDeSubstituicaodeLiskov;
import br.edu.umfg.ocp.PrincipioAbertoFechado;
import br.edu.umfg.srp.PrincipiodeResponsabilidadeUnica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n<>--------- S.O.L.I.D ---------<>\n");
        System.out.println("1. SRP - Princípio de Responsabilidade Única");
        System.out.println("2. OCP - Princípio Aberto-Fechado");
        System.out.println("3. LSP - Princípio de Substituição de Liskov");
        System.out.println("4. ISP - Princípio de Segregação de Interface");
        System.out.println("5. DIP - Princípio de Inversão de Dependência");
        System.out.print("\nOpção: ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("\n<>--------- Executando SRP ---------<>");
                PrincipiodeResponsabilidadeUnica.executarLegado();
                PrincipiodeResponsabilidadeUnica.executarRefatorado();
                break;
            case 2:
                System.out.println("<>--------- Executando OCP ---------<>");
                PrincipioAbertoFechado.executarLegado();
                PrincipioAbertoFechado.executarRefatorado();
                break;
            case 3:
                System.out.println("<>--------- Executando LSP ---------<>");
                PrincipioDeSubstituicaodeLiskov.executarLegado();
                PrincipioDeSubstituicaodeLiskov.executarRefatorado();
                break;
            case 4:
                System.out.println("<>--------- Executando ISP ---------<>");
                PrincipioDaSegregacaodeInterface.executarLegado();
                PrincipioDaSegregacaodeInterface.executarRefatorado();
                break;
            case 5:
                System.out.println("<>--------- Executando DIP ---------<>");
                PrincipiodeInversaoDeDependencia.executarLegado();
                PrincipiodeInversaoDeDependencia.executarRefatorado();
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }
}
