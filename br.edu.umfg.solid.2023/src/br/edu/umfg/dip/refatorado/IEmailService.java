package br.edu.umfg.dip.refatorado;

public interface IEmailService {
    void enviarEmail (String destinatario, String remetente, String mensagem);
}
