// Angela Mendon�a - T47
// Exerc�cio 04 - 03/03/22


package exercicios;

import java.util.Scanner;
import java.math.*;


public class ex04 {

	public static void main(String[] args) {
		// Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
				//�mpar exiba o n�mero elevado ao quadrado.
		
		Scanner leia = new Scanner(System.in);
		int num1, calculo = 0;
		
		System.out.println("Digite aqui o n�mero:");
		num1 = leia.nextInt();
		
		if (num1%2 == 0) {
			System.out.println("O Numero " +num1+ " � par");
			System.out.println("e sua raiz quadrada �: "+Math.sqrt(num1));
	}else
	{		
		calculo=num1*num1;
		System.out.println("O numero " + num1 + " � impar");
		System.out.println("E o resultado da potencia �: "+calculo);
		}
		
		leia.close();
		
		
		

	}

}
