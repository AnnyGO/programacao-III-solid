package br.edu.umfg.dip.legado;

public class EmailService {
    //classe de baixo nível
    public void enviarEmail(String destinatario, String remetente, String mensagem){
        System.out.println("De: " + remetente + "\n" + "Para: " + destinatario + "\n" + "Mensagem: " + mensagem);
    }
}
