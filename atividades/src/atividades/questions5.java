package atividades;

import java.util.Scanner;

public class questions5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número qualquer: ");
		float num = sc.nextFloat();
		
		if (num >= 0 && num <= 25) {
			System.out.println("O número digitado está entre 0 e 25.");
		} else if (num > 25 && num <= 50) {
			System.out.println("O número digitado está entre 26 e 50.");
		} else if (num > 50 && num <= 75) {
			System.out.println("O número digitado está entre 51 e 75.");
		} else if (num > 75 && num <= 100) {
			System.out.println("O número digitado está entre 76 e 100.");
		} else {
			System.out.println("O número digitado não se encontra em nenhum destes intervalos.");
		}
		
		sc.close();
	}

}
