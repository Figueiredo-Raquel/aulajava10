package aula10;


import java.util.Scanner;

//Crie um programa que leia um n�mero do teclado at� 
//que encontre um n�mero igual a zero. 
//No final, mostre a soma dos n�meros digitados.(DO...WHILE)

    public class ExercicioJava5 {
    public static void main(String[] args) {
		
	 Scanner ler = new Scanner(System.in);
		
		
		int numero=0, somanumero=0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			somanumero=somanumero+numero;
		}
		while(numero!=0);		
		
		
		System.out.printf("A soma de todos os numeros e igual �: %d",somanumero);
		
		
		 ler.close();	

	}

}