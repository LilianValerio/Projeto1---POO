package br.com.codenation.aceleradev.rec.loja;

import br.com.codenation.aceleradev.rec.loja.bean.User;
import br.com.codenation.aceleradev.rec.loja.business.UserBusiness;
import br.com.codenation.aceleradev.rec.loja.exceptions.CpfInvalidoException;
import br.com.codenation.aceleradev.rec.loja.interfaces.UserInterface;
import br.com.codenation.aceleradev.rec.loja.util.Const;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Projeto Codenation" );
        
        String entradaUsuario;
        Scanner scanner = new Scanner(System.in);

        boolean usuarioCriadoComSucesso = false;
        boolean usuarioDesistiu = false;
        while(!usuarioDesistiu && !usuarioCriadoComSucesso){
            System.out.print(">>>>>>>>>>>>>>>>>>>>>> Digite seu CPF para logar ou -1 para sair: <<<<<<<<<<<<<<<<<<<<<<<<<\n");
            entradaUsuario = scanner.nextLine();
            if(!entradaUsuario.equalsIgnoreCase(Const.FLAG_SAIDA)){
                try {
                    usuarioCriadoComSucesso = UserBusiness.validarCpf(entradaUsuario);
                }catch (CpfInvalidoException e){
                    System.out.println(e.getMessage());
                }

            }else{
                usuarioDesistiu = true;
            }
        }

        scanner.close();
      
    }    
}
