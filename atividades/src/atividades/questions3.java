package atividades;

import java.util.Scanner;

public class questions3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		if (num1 % num2 == 0) {
			System.out.println(num1 + " é múltiplo de " + num2 + "!");
		} else if (num2 % num1 == 0){
			System.out.println(num2 + " é múltiplo de " + num1 + "!");
		} else {
			System.out.println("Os números digitados não são múltiplos!");
		}
		sc.close();
	}

}
