package br.edu.umfg.ocp.refatorado;

public class PIS extends ImpostoFederal{

    public PIS(){
        super("PIS", 1.65);
    }
    @Override
    public Double getAliquota() {
        return super.getAliquota();
    }
}
