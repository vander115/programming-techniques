package com.lists.list02;

public class Main {

    public static void main(String[] args) {

        int[] array01 = {20, 34, 76, 97};
        int[] array02 = {34, 56, 455, 97, 34, 20, 34};

        Utilities utils = new Utilities();

        int[] result = utils.decreaseArray(3);

        for (int element : result) {
            System.out.println(element);
        }

    }

}
