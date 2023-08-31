package com.vander.list01;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {

		int A, B;
		boolean isGreaterThan = false, isEqual = false;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		A = scan.nextInt();

		System.out.println("Digite mais um número: ");
		B = scan.nextInt();

		scan.close();

		if (A < 10) {
			System.out.println("A < 10");
			isGreaterThan = true;
		}

		if (A + B == 20) {
			System.out.println("A + B == 20");
			isEqual = true;
		}

		if (!isGreaterThan && !isEqual) {
			System.out.println("Número não válido!");
		}

	}

}
