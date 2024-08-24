package br.edu.umfg.ocp.refatorado;

public class ICMSSantaCatarina extends ImpostoEstadual {
    public ICMSSantaCatarina() {
        super("ICMS", 17.00);
    }

    @Override
    public TipoEstado getTipoEstado() {
        return TipoEstado.SantaCatarina;
    }
}
