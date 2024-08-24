package br.edu.umfg.ocp.refatorado;

public abstract class ImpostoEstadual {
    private String descricao;
    private Double aliquota;

    protected ImpostoEstadual(String descricao, Double aliquota) {
        this.descricao = descricao;
        this.aliquota = aliquota;
    }

    public abstract TipoEstado getTipoEstado();
    public String getDescricao() {
        return descricao;
    }
    public Double getAliquota() {
        return aliquota;
    }


}
