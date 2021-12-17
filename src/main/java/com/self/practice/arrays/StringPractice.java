package com.self.practice.arrays;

import java.util.Optional;

public class StringPractice {

    // Reverse a string
    public String naiveSolution(String input) {

        return Optional.ofNullable(input).map(s -> {
            StringBuilder sb = new StringBuilder();
            for (int i = input.length(); i > 0; i--) {
                sb.append(input.substring(i - 1, i));
            }
            return sb.toString();
        }).orElseThrow(() -> new IllegalArgumentException("Please enter non-null string"));
    }

    // Reverse a string
    public String stringBuilderSolution(String input) {

        return Optional.ofNullable(input).map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .orElseThrow(IllegalArgumentException::new)
                .toString();
    }

}
