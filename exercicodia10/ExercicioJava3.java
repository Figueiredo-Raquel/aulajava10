package aula10;

import java.util.Scanner;

//Solicitar a idade* de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)


public class ExercicioJava3 {

	public static void main(String[] args) {
		

		Scanner ler = new Scanner (System.in);
		
		int idade=0, pessoas21=0, pessoas50=0;
		
		while(idade!=-99)
		{
			System.out.print("Digite sua idade: ");
			idade=ler.nextInt();
			
			if(idade<21)
			{
				pessoas21=pessoas21+1;	
			}
			else if(idade>50)
			{
				pessoas50=pessoas50+1;
			}
			
		}
		
		System.out.printf("\nNumero de pessoas menores de 21 anos: %d",pessoas21-1);
		System.out.printf("\nNumero de pessoas maiores de 50 anos: %d",pessoas50);
		
		
		
		ler.close();	
	}

}
