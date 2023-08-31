package com.vander.list01;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		int A, B;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		A = scan.nextInt();

		System.out.println("Digite mais um número: ");
		B = scan.nextInt();

		scan.close();

		if (A > 10) {
			System.out.println("A > 10");
		}

		if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Número não válido!");
		}

	}

}
