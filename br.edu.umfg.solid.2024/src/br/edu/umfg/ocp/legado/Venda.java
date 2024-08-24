package br.edu.umfg.ocp.legado;

import java.util.ArrayList;

public class Venda {
    private TipoVenda tipoVenda;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Venda(TipoVenda tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removeProduto(Produto produto){
        this.produtos.remove(produto);
    }

    @Override
    public String toString(){
        String result = this.tipoVenda + "\n";
        for (Produto produto : this.produtos){
            result += produto.getDescricao() + " | R$" + produto.getValor() + "\n";
        }
        result += calcularTotalComImpostos();
        return result;
    }
    //
    private String calcularTotalComImpostos() {

        String result = "TOTAL COM IMPOSTOS: ";
        Double totalVenda = 0.0;

        for (Produto produto: this.produtos) {
            totalVenda += produto.getValor();
        }
        //Por causa da possibilidade de alteração de alíquota, esta estrutura fere o princípio aberto-fechado
        //Pois para adição de novas alíquotas, o código precisaria ser modificado.
        totalVenda += (totalVenda * 0.165);
        totalVenda += (totalVenda * 0.765);

        if (TipoVenda.Parana.equals(this.tipoVenda)){
            totalVenda += (totalVenda * 0.19);
        } else if (TipoVenda.SaoPaulo.equals(this.tipoVenda)){
            totalVenda += (totalVenda * 0.18);
        } else if (TipoVenda.SantaCatarina.equals(this.tipoVenda)) {
            totalVenda += (totalVenda * 0.17);
        }
        return result + totalVenda;
    }
}
