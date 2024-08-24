package br.edu.umfg.lsp.refatorado;

public class AlunoEADRefatorado extends AlunoAbstrato {
    private String email;
    private String senha;

    public AlunoEADRefatorado(String ra, String nome, Double notaFinal, String email, String senha) {
        super(ra, nome, notaFinal);
        this.email = email;
        this.senha = senha;
    }
}
