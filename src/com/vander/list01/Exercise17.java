package com.vander.list01;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {

		int A, B;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		A = scan.nextInt();

		System.out.println("Digite mais um número: ");
		B = scan.nextInt();

		scan.close();

		if (A > 10 || A + B == 20) {
			System.out.println("Número válido!");
		} else if (A == B) {
			System.out.println("A é igual a B");
		} else if (A != 10 && B != 10 && A < 10) {
			System.out.println("A é menor que 10");
		} else {
			System.out.println("Número não válido!");
		}
	}

}
