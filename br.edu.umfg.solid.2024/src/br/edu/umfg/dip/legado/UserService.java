package br.edu.umfg.dip.legado;

public class UserService {
    private final String DEFAULT_EMAIL = "minha.empresa@email.com";
    private EmailService emailService;

    /* A classe de alto nível UserService depende diretamente da classe de baixo nível EmailService. Isso cria um
    * acoplamento rígido e dificulta a substituição do EmailService por outra implementação.*/

    public UserService() {
       this.emailService = new EmailService(); //dependência direta
    }
    public void registrarUsuario (String email){
        String mensagem = "Bem Vindo! Você foi registrado!";
        emailService.enviarEmail(email,DEFAULT_EMAIL,mensagem);
    }
}
