package com.lists.list02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Utilities {

    // Question01
    public int sumWithoutBorders(int[] arrayOfNumbers) {

        int sum = 0;

        for (int i = 2; i < arrayOfNumbers.length - 2; i++) {
            sum += arrayOfNumbers[i];
        }

        return sum;
    }

    ;

    // Question02
    public void showEvenNumbers(int initialNumber, int lastNumber) {

        for (int i = initialNumber; i <= lastNumber; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public int sum(int[] arrayOfNumber) {
        int sum = 0;

        for (int number : arrayOfNumber) {
            sum += number;
        }

        return sum;
    }

    // Question03
    public double avaregeOfArrays(int[] array01, int[] array02) {

        int sum = sum(array01) + sum(array02);
        int length = array01.length + array02.length;

        double avarage = (double) sum / length;

        return avarage;
    }

    ;

    // Question 05
    public int countElement(int[] array01, int[] array02, int element) {

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

    // Question 06
    public int[] duplicateArray(int[] array) {

        int[] duplicatedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            duplicatedArray[i] = array[i];
        }

        return duplicatedArray;

    }

    // Question 07
    public int[] sortInAscending(int[] array) {

        int[] organizedArray = array;

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


    // Question 08
    public boolean checkOrderArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                return false;
            }

        }

        return true;
    }

    // Question 09
    public int getKGreatestNumber(int[] array, int k) {
        int[] pivotArray = sortInDescending(array);

        if (k > array.length) {
            return 0;
        } else {
            return pivotArray[k - 1];
        }

    }

    // Complement of Question 10
    public int[] sortInDescending(int[] array) {

        int[] organizedArray = array;

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

    // Question 10
    public int getKSmallestNumber(int[] array, int k) {

        int[] pivotArray = sortInAscending(array);

        if (k > array.length) {
            return 0;
        } else {
            return pivotArray[k - 1];
        }

    }

    // Question 11
    public boolean checkEquality(int[] array01, int[] array02) {

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

    // Question 12
    public double potentiation(double base, int exponent) {
        double result = 1.0;

        if (exponent == 0) {
            return result;
        }

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    // Question 13 / Question 17
    public boolean checkIsPrimeNumber(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {

                return false;
            }
        }

        return true;
    }

    public int[] getOccurrences(int[] array01, int[] array02) {
        Set<Integer> occurrencesSet = new HashSet<>();
        List<Integer> occurrencesList = new ArrayList<>();

        for (int element1 : array01) {
            for (int element2 : array02) {
                if (element1 == element2 && !occurrencesSet.contains(element1)) {
                    occurrencesSet.add(element1);
                    occurrencesList.add(element1);
                    break;
                }
            }
        }

        int[] commonOccurrences = new int[occurrencesList.size()];
        for (int i = 0; i < occurrencesList.size(); i++) {
            commonOccurrences[i] = occurrencesList.get(i);
        }

        return commonOccurrences;
    }

    // Question 15
    public int[] removeElement(int[] array, int element) {
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

        int[] updatedArray = new int[newArrayLength];

        int i = 0;
        for (int arrayElement : array) {
            if (arrayElement != element) {
                updatedArray[i] = arrayElement;
                i++;
            }
        }

        return updatedArray;
    }

    // Question 16
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

    // Question 18
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

    // Question 19
    public double calculateCompoundInterest(double capital, double interestRate, int period) {
        return (capital * potentiation((1 + interestRate), period));
    }

    // Question 20
    public boolean checkIsPerfectNumber(int number) {

        if (number <= 0) {
            return false;
        }

        int sumOfDividers = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\n" + sumOfDividers);

        return sumOfDividers == number;

    }

    public int[] decreaseArray(int initialSize) {
        int currentSize = initialSize;
        int[] array = new int[initialSize];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        while (currentSize > 1) {
            currentSize--;
            int[] newArray = new int[currentSize];

            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = i + 1;
            }

            array = newArray;
        }

        return array;
    }
}
