package br.edu.umfg.ocp.refatorado;

import java.util.ArrayList;

public class ProdutoRefatorado {
    private String descricao;
    private Double valor;
    private ArrayList<ImpostoFederal> impostosFederais = new ArrayList<ImpostoFederal>();
    private ArrayList<ImpostoEstadual> impostosEstaduais = new ArrayList<ImpostoEstadual>();

    public ProdutoRefatorado(String descricao, Double valor, ArrayList<ImpostoFederal> impostosFederais,
                             ArrayList<ImpostoEstadual> impostosEstaduais) {
        this.descricao = descricao;
        this.valor = valor;
        this.impostosFederais.addAll(impostosFederais);
        this.impostosEstaduais.addAll(impostosEstaduais);
    }

    public String getDescricao() {
        return descricao;
    }
    public Double getValor() {
        return valor;
    }
    public Double getValorImpostoFederal(){
        //Declarando variável para armazenar os valores
       final Double[] resultado = {0.0};

       //Acessando lista de impostos
        //Expressão lambda
       this.impostosFederais.stream().forEach(x -> {resultado[0] +=(getValor()/100) * x.getAliquota();});
       return resultado[0];
    }

    public Double getValorImpostoEstadual(TipoEstado tipoEstado){
       final Double[] resultado = {0.0};

       this.impostosEstaduais.stream().filter(x-> tipoEstado.equals(x.getTipoEstado())).forEach(y->{resultado[0] += (getValor()/100) * y.getAliquota();});
        return resultado[0];
    }
}
