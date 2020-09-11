package aula10;

import java.util.Scanner;

//Escrever um programa que receba vários números inteiros* no teclado. 
//E no final imprimir a média dos números múltiplos de 3.
//Para sair digitar 0(zero).(DO...WHILE)*


public class ExercicioJava6 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	
		double numero=0,soma=0,cont=0,media=0;
  
	
	do
	{
		System.out.println("Digite um numero inteiro: ");
		numero=ler.nextInt();
		
	   if(numero%3==0) 
	   {
		soma=soma+numero;
		cont=cont+1;
	   }
			
	}while(numero!=0);
	
	  media=soma/(cont-1);
     
	 
	 
	System.out.printf("A media dos numeros multiplos de 3 é: %.2f",media,"\n");
	
	
	ler.close();

	}

}
