package ru.yagunova.massiveone._main;

import ru.yagunova.massiveone.entity.ArrayGenerator;
import ru.yagunova.massiveone.util.Calculation;

import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
        int[] random = ArrayGenerator.random();
        System.out.println(Arrays.toString(random));
        System.out.println(Calculation.evenCount(random));
        System.out.println(Calculation.unevenCount(random));
        System.out.println(Calculation.primeCount(random));
        System.out.println(Calculation.summution(random));
        System.out.println(Calculation.differenceSum(random));
        System.out.println(Calculation.zeroCount(random));
    }
}
