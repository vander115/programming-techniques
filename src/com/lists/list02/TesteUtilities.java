package com.lists.list02;

public class TesteUtilities {

	public static void main(String[] args) {
		Utilities utilidades = new Utilities();

		int array01[] = { 1, 2, 2, 2, 3, 3 };
		int array03[] = { 1, 2, 2, 2, 3, 4 };
		int array02[] = { 40, 500, 6, 2, 3, 1, 7, 20, 44, 80, 234 };

		int testArray[] = utilidades.sortInDescending(array02);

		System.out.println(utilidades.potentiation(15, 10));
	}

}
