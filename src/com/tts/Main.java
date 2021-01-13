package com.tts;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] sumArr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int x : sumArr) {
            sum += x;
        }

        System.out.println(sum);

        double[] exampleArray = {1, 5, 6, 5, 4, 1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i < exampleArray.length; i++) {

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];

                index = i;

            }

        }
        System.out.println(index);

        double[] result = toPower(10, 2);
        System.out.println(Arrays.toString(result));
    }

    public static double[] toPower (int size, int power) {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
        result[i] = Math.pow(Double.valueOf(i), Double.valueOf(power));
    }
return result;

}

}