package br.edu.umfg.ocp.refatorado;

public class ICMSParana extends ImpostoEstadual{
    public ICMSParana (){
        super("ICMS", 19.00);
    }
    @Override
    public TipoEstado getTipoEstado() {
        return TipoEstado.Parana;
    }
}
