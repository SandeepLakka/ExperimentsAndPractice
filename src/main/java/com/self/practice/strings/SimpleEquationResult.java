package com.self.practice.strings;

import java.util.Arrays;

public class SimpleEquationResult {
    //-x
    //-x+2
    //-x-2
    //-3x+3
    //2x+5

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
