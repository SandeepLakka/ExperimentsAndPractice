package com.self.practice.strings;

import java.util.Arrays;

/*
 * Problem Statement:
 * Given a simple equation and a value , return output of it
 *
 * Examples:
 * (3x+2, 3) --> 11         // 3*3 + 2 => 9 + 2 => 11
 * (x-1, 4) --> 3           // 4  - 1 => 3
 * (2, 4 ) --> 2            // input is constant so we will return the same
 *
 */
public class SimpleEquationResult {

    //Weird/Lazy implementation
    public long getResult(String equation, int value) {

        return Arrays.stream(equation.replace("-", "+-").split("\\+"))
                .filter(s -> !s.isEmpty())          //for cases like -3x +2, we'll have "","-3x","+2" (empty initial val)
                .map(s -> (s.startsWith("x") || s.startsWith("-x")) ?
                        s.replace("x", "1*" + value) :
                        s.replace("x", "*" + value)
                ).mapToLong(s -> s.contains("*") ?
                        Long.parseLong(s.split("\\*")[0]) * Long.parseLong(s.split("\\*")[1]) :
                        Long.parseLong(s)
                ).sum();
    }
}
