// Angela Mendon�a - T47
// exerc�cio 1 - 03/03/22


package exercicios;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
	
		Scanner leia = new Scanner(System.in);
		double n1, n2, n3;
		
		System.out.println("Digite o primeiro n�mero:");
		n1 = leia.nextDouble();
		
		System.out.println(" Digite o segundo n�mero:");
		n2 = leia.nextDouble();
		
		System.out.println(" Digite o terceiro n�mero:");
		n3 = leia.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
		System.out.println(" O n�mero 1 � o n�mero maior");
		}
		
		else if(n2 > n1 && n2 > n3){
		System.out.println(" O n�mero 2 � o n�mero maior");
		}
		
		else if(n3 > n2 && n3 > n1){
		System.out.println(" O n�mero 3 � o n�mero maior");
		}
		
		leia.close();
		}
	
	
	

} 
