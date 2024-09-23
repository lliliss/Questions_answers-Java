package atividades;

import java.util.Scanner;

public class questions2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite qualquer número: "); //Caso de números decimais, utilizar a vírgula.
		float num = sc.nextFloat();
		
		if (num % 2 == 0) {
			System.out.println("O número digitado é par!");
		} else {
			System.out.println("O número digitado é ímpar!");
		}
		sc.close();
	}

}
