// Angela Mendon�a - T47
// Exerc�cio 02 - 03/03/22


package exercicios;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		double n1, n2, n3;
		
		System.out.println("Digite o primeiro n�mero:");
		n1 = leia.nextDouble();
		
		System.out.println(" Digite o segundo n�mero:");
		n2 = leia.nextDouble();
		
		System.out.println(" Digite o terceiro n�mero:");
		n3 = leia.nextDouble();
		
		if (n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente �: " + n1 + " " + " " + n2 + " " + n3);
		}
		
		else if (n2 <= n3 && n3 <= n1) {
			System.out.println("A ordem crescente �:" + n2 + " " + n3 + " " + n1);
		}
		
		else if (n3 <= n2 && n2 <= n1) {
			System.out.println("A ordem crescente �:" + n3 + " " + n2 + " " + n1);
		}
		
		else if (n1 <= n3 && n3 <= n2) {
			System.out.println("A ordem crescente �:" + n1 + " " + n3 + " " + n2);
		}
		
		else if (n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente �:" + n2 + " " + n1 + " " + n3);
		}
		
		else if (n3 <= n1 && n1 <= n2 ) {
			System.out.println("A ordem crescente �:" + n3 + " " + n1 + " " + n2);
		}
		
		leia.close(); 
		} 

	}


