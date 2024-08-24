package br.edu.umfg.lsp.legado;

public class AlunoEAD {
    private String ra;
    private String nome;
    private String email;
    private String senha;
    private Double notaFinal;

    public AlunoEAD(String ra, String nome, String email, String senha) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
