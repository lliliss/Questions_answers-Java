package atividades;

import java.util.Scanner;

public class questions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: "); //Caso de números decimais, utilizar a vírgula.
		float num = sc.nextFloat();
		
		if (num >= 0) {
			System.out.println("O número digitado é positivo!");
		} else {
			System.out.print("O número digitado é negativo!");
		}
		sc.close();
	}

}
