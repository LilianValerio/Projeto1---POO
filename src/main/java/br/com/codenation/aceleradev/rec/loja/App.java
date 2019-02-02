package br.com.codenation.aceleradev.rec.loja;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu cpf:");
        while(sc.hasNext()){
          i++;
          cpf = sc.next();
        }
        
        
        sc.close(); 
      
    }    
    }
