package com.self.practice.arrays;

import java.util.Optional;

/**
 * Problem Statement : Reverse an array in place.
 * <p>
 * Example:
 * Input : arr[] = {1, 2, 3}       --->    Output : arr[] = {3, 2, 1}
 * <p>
 * Input :  arr[] = {4, 5, 1, 2}    --->    Output : arr[] = {2, 1, 5, 4}
 * For invalid inputs (nulls), throw IllegalArgumentException
 * <p>
 * Bonus: Implement it using generics to pass any datatype array
 * <p>
 * <p>
 * Note: Comment about the time and space complexities as comments over your
 * methods
 */


public class ArrayReverse {


    public String naiveSolution(String input) {

        return Optional.ofNullable(input).map(s -> {
            StringBuilder sb = new StringBuilder();
            for (int i = input.length(); i > 0; i--) {
                sb.append(input.substring(i - 1, i));
            }
            return sb.toString();
        }).orElseThrow(() -> new IllegalArgumentException("Please enter non-null string"));
    }

    public String stringBuilderSolution(String input) {

        return Optional.ofNullable(input).map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .orElseThrow(IllegalArgumentException::new)
                .toString();

    }


}
