package ru.yagunova.massiveone.util;

public class Calculation {

    public static int evenCount(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int unevenCount(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int primeCount(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (isSimple(ints[i])) {
                count++;
            }
        }
        return count;
    }

    public static int summution(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum++;
        }
        return sum;
    }

    public static int differenceSum(int[] ints) {
        int sumEvenInd = 0;
        int sumUnevenInd = 0;
        for (int i = 0; i < ints.length; i++) {
            if (i % 2 == 0) {
                sumEvenInd = +ints[i];
            } else {
                sumUnevenInd = +ints[i];
            }
        }
        return sumEvenInd - sumUnevenInd;
    }

    public static int zeroCount(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                count++;
            }
        }
        return count;
    }

    private static boolean isSimple(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
