package br.edu.umfg.ocp;

import br.edu.umfg.ocp.legado.Produto;
import br.edu.umfg.ocp.legado.TipoVenda;
import br.edu.umfg.ocp.legado.Venda;
import br.edu.umfg.ocp.refatorado.*;

import java.util.ArrayList;

public class PrincipioAbertoFechado {
    //Princípio Aberto-Fechado: Objetos ou entidades devem estar abertos para extensão, mas fechados para modificação.

    //Quando novos comportamentos e recursos precisam ser adicionados nosoftware, devemos estender e não alterar o
    // código fonte original.
    public static void executarLegado(){
        System.out.println("\nLEGADO");
        //Dica: Ao lidar com cadastro, manter as strings de caixa alta e remover caracteres especiais
        Produto cocaCola = new Produto("COCA COLA 350ML", 7.50);
        Produto batataFrita = new Produto("BATATA FRITA 400GR", 25.90);

        Venda vendaUM = new Venda(TipoVenda.Parana);
        vendaUM.addProduto(cocaCola);
        vendaUM.addProduto(batataFrita);

        System.out.println(vendaUM.toString());
    }

    public static void executarRefatorado(){
        System.out.println("\nREFATORADO");
        PIS pis = new PIS();
        ICMSParana icmsParana = new ICMSParana();
        ICMSSantaCatarina icmsSantaCatarina = new ICMSSantaCatarina();

        ArrayList<ImpostoFederal> impostosFederais = new ArrayList<ImpostoFederal>();
        impostosFederais.add(pis);
        ArrayList<ImpostoEstadual> impostosEstaduais = new ArrayList<ImpostoEstadual>();
        impostosEstaduais.add(icmsParana);
        impostosEstaduais.add(icmsSantaCatarina);

        ProdutoRefatorado cocaCola = new ProdutoRefatorado("COCA-COLA 350ML", 7.49,
                impostosFederais, impostosEstaduais);
        ProdutoRefatorado batataFrita = new ProdutoRefatorado("BATATA-FRITA 400GR", 25.90,
                impostosFederais,impostosEstaduais);

        VendaRefatorada venda = new VendaRefatorada(TipoEstado.Parana);
        venda.addProduto(cocaCola);
        venda.addProduto(batataFrita);

        System.out.println(venda.toString());
    }
}
