package br.edu.umfg.ocp.refatorado;

public abstract class ImpostoFederal {
    private String descricao;
    private Double aliquota;

    public ImpostoFederal(String descricao, Double aliquota) {
        this.descricao = descricao;
        this.aliquota = aliquota;
    }

    public Double getAliquota() {
        return aliquota;
    }
}
