package br.com.codenation.aceleradev.rec.loja;

import br.com.codenation.aceleradev.rec.loja.business.UserBusiness;
import br.com.codenation.aceleradev.rec.loja.interfaces.UserInterface;

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
        
        String cpf = "";
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu cpf:");
        cpf = scanner.nextLine();
        /*while(scanner.hasNext()){
          i++;
          cpf = scanner.next();
        }*/

        System.out.println(UserBusiness.validarCpf(cpf));
        
        scanner.close();
      
    }    
    }
