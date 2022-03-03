// Angela Mendonça - T47
// exercício 1 - 03/03/22


package exercicios;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		// Faça um programa que receba três inteiros e diga qual deles é o maior.
		
	
		Scanner leia = new Scanner(System.in);
		double n1, n2, n3;
		
		System.out.println("Digite o primeiro número:");
		n1 = leia.nextDouble();
		
		System.out.println(" Digite o segundo número:");
		n2 = leia.nextDouble();
		
		System.out.println(" Digite o terceiro número:");
		n3 = leia.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
		System.out.println(" O número 1 é o número maior");
		}
		
		else if(n2 > n1 && n2 > n3){
		System.out.println(" O número 2 é o número maior");
		}
		
		else if(n3 > n2 && n3 > n1){
		System.out.println(" O número 3 é o número maior");
		}
		
		leia.close();
		}
	
	
	

} 
