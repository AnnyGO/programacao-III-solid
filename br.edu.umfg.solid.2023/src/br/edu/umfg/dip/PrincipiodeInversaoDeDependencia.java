package br.edu.umfg.dip;

import br.edu.umfg.dip.legado.UserService;
import br.edu.umfg.dip.refatorado.EmailServiceRefatorado;
import br.edu.umfg.dip.refatorado.IEmailService;
import br.edu.umfg.dip.refatorado.UserServiceRefatorado;

public class PrincipiodeInversaoDeDependencia {
    public static void executarLegado (){
        System.out.println("\nLEGADO");
        UserService userService = new UserService();
        userService.registrarUsuario("ana@gmail.com");
    }

    public static void executarRefatorado(){
        System.out.println("\nREFATORADO");
        /*A classe de alto nível UserServiceRefatorado depende de uma abstracao (interface IEmailService) em vez da
         * implementacao (classe concreta EmailServiceRefatorado
         *
         * A classe de baixo nível EmailServiceRefatorado implementa a abstracao (interface IEmailService), isso permite maior
         * flexibilidade e substituicao (por isso inversao de dependencia*/

        IEmailService emailService = new EmailServiceRefatorado();
        UserServiceRefatorado userServiceRefatorado = new UserServiceRefatorado(emailService);
        userServiceRefatorado.registrar("joao@gmail.com");
    }
}
