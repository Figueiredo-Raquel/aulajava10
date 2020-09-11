package aula10;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

import java.util.*;

public class ExercicioJava2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);

        int numero, par=0, impar=0, contador=0;
        final int limite=4;

        for(contador = 0; contador < limite ;contador ++)
        {
        	
            System.out.printf(" Digite o %d numero inteiro: ",contador+1);
            numero = ler.nextInt();
            
            if((numero%2)==0) 
            {
                par = par + 1;
            }
            else 
            {
                impar = impar +1;
            }

        }
         
           if(par==1 ) 
           {
        	   System.out.printf("\nExiste %d um numero PAR.",par);
           }
           else 
           {
        	   System.out.printf("\nExiste %d um numeros PARES.",par);
           }
           if(impar==1 ) 
           {
       	       System.out.printf("\nExiste %d um numero IMPARES.",impar);
          }
          else 
          {
       	       System.out.printf("\nExiste %d um numeros IMPARES.",impar);
          }
          
         
         


         ler.close();
    }

}