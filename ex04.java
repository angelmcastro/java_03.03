// Angela Mendonça - T47
// Exercício 04 - 03/03/22


package exercicios;

import java.util.Scanner;
import java.math.*;


public class ex04 {

	public static void main(String[] args) {
		// Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
				//ímpar exiba o número elevado ao quadrado.
		
		Scanner leia = new Scanner(System.in);
		int num1, calculo = 0;
		
		System.out.println("Digite aqui o número:");
		num1 = leia.nextInt();
		
		if (num1%2 == 0) {
			System.out.println("O Numero " +num1+ " é par");
			System.out.println("e sua raiz quadrada é: "+Math.sqrt(num1));
	}else
	{		
		calculo=num1*num1;
		System.out.println("O numero " + num1 + " é impar");
		System.out.println("E o resultado da potencia é: "+calculo);
		}
		
		leia.close();
		
		
		

	}

}
