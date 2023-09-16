package com.lists.list02;

public class Utilities {

	// Question01
	public int sum(int arrayOfNumbers[]) {

		int sum = 0;

		for (int number : arrayOfNumbers) {
			sum += number;
		}

		return sum;
	};

	// Question02
	public void showEvenNumbers(int initialNumber, int lastNumber) {

		for (int i = initialNumber; i <= lastNumber; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

	// Question03
	public double avaregeOfArrays(int array01[], int array02[]) {

		int sum = sum(array01) + sum(array02);
		int length = array01.length + array02.length;

		double avarage = (double) sum / length;

		return avarage;
	};

	public int countElement(int array01[], int array02[], int element) {

		int counter = 0;

		for (int numberOfArray : array01) {
			if (numberOfArray == element) {
				counter++;
			}
		}
		for (int numberOfArray : array02) {
			if (numberOfArray == element) {
				counter++;
			}
		}

		return counter;
	}

	public int[] duplicateArray(int array[]) {

		int duplicatedArray[] = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			duplicatedArray[i] = array[i];
		}

		return duplicatedArray;

	}

	public int[] sortInAscending(int array[]) {

		int organizedArray[] = array;

		int n = organizedArray.length;
		int pivot;
		boolean wasChanged;

		do {
			wasChanged = false;

			for (int i = 0; i < n - 1; i++) {

				if (organizedArray[i] > organizedArray[i + 1]) {

					pivot = organizedArray[i];
					organizedArray[i] = organizedArray[i + 1];
					organizedArray[i + 1] = pivot;
					wasChanged = true;

				}

			}

		} while (wasChanged);

		return organizedArray;
	}

	public int[] sortInDescending(int array[]) {

		int organizedArray[] = array;

		int n = organizedArray.length;
		int pivot;
		boolean wasChanged;

		do {
			wasChanged = false;

			for (int i = 0; i < n - 1; i++) {

				if (organizedArray[i] < organizedArray[i + 1]) {

					pivot = organizedArray[i];
					organizedArray[i] = organizedArray[i + 1];
					organizedArray[i + 1] = pivot;
					wasChanged = true;

				}

			}

		} while (wasChanged);

		return organizedArray;
	}

	public boolean checkOrderArray(int array[]) {

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] > array[i + 1]) {
				return false;
			}

		}

		return true;
	}

	public int getKGreatestNumber(int array[], int k) {
		int pivotArray[] = sortInDescending(array);

		if (k > array.length) {
			return 0;
		} else {
			return pivotArray[k - 1];
		}

	}

	public int getKSmallestNumber(int array[], int k) {

		int pivotArray[] = sortInAscending(array);

		if (k > array.length) {
			return 0;
		} else {
			return pivotArray[k - 1];
		}

	}

	public boolean checkEquality(int array01[], int array02[]) {

		if (array01.length != array02.length) {
			return false;
		}

		for (int i = 0; i < array01.length; i++) {
			if (array01[i] != array02[i]) {
				return false;
			}
		}

		return true;
	}

	public int potentiation(int base, int exponent) {
		int result = 1;

		if (exponent == 0) {
			return result;
		}

		for (int i = 0; i < exponent; i++) {
			result *= base;
		}

		return result;
	}

	public boolean checkIsPrimeNumber(int number) {

		if (number <= 1) {
			return false;
		}

		// Verifica se o número é divisível por algum número inteiro de 2 até a raiz
		// quadrada do número
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				// O número é divisível por um número além de 1 e ele mesmo, portanto não é
				// primo
				return false;
			}
		}

		// Se nenhum divisor foi encontrado, o número é primo
		return true;
	}

//	public int[] getOccurrences(int array01[], int array02[]) {
//		int minimumSize = Math.min(array01.length, array02.length);
//		
//		
//		
//		return;
//	}

	public int[] removeElement(int array[], int element) {
		int elementOccurrences = 0;

		for (int arrayElement : array) {
			if (arrayElement == element) {
				elementOccurrences++;
			}
		}

		if (elementOccurrences == 0) {
			return array;
		}

		int newArrayLength = array.length - elementOccurrences;

		int updatedArray[] = new int[newArrayLength];

		int i = 0;
		for (int arrayElement : array) {
			if (arrayElement != element) {
				updatedArray[i] = arrayElement;
				i++;
			}
		}

		return updatedArray;
	}

	public boolean checkIsPalindrome(String string) {

		String transformedString = string.toLowerCase();

		int left = 0;
		int right = string.length() - 1;

		while (left < right) {
			if (transformedString.charAt(left) != transformedString.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public String invertString(String string) {
		char[] convertedString = string.toCharArray();

		char[] invertedString = new char[convertedString.length];
		int j = convertedString.length - 1;

		for (int i = 0; i < convertedString.length; i++) {
			invertedString[i] = convertedString[j];
			j--;
		}

		return new String(invertedString);
	}

}
