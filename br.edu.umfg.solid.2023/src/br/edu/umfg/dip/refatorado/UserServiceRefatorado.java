package br.edu.umfg.dip.refatorado;

public class UserServiceRefatorado {
    private IEmailService emailService;
    private final String DEFAULT_EMAIL = "minha.empresa@email.com";

    //Classe de alto nível
    public UserServiceRefatorado(IEmailService emailService) {
        this.emailService = emailService;
    }

    public void registrar (String email){
        String mensagem = "Bem vindo! Você foi registrado!";
        this.emailService.enviarEmail(email,DEFAULT_EMAIL, mensagem);
    }
}
