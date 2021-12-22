package com.self.datastructures.stack;

import java.util.OptionalInt;
import java.util.Stack;

/**
 * Problem Statement :  Write a function which returns true if the brackets are correctly matched,
 * False otherwise.
 * <p>
 * Examples:
 * Input   :   "((hello)(world)"   --->    Output: False
 * Input   :   "hel(lo)(wor)ld"    --->    Output: True
 * Input   :   "()()()"            --->    Output: True
 * Input   :   "())(()"            --->    Output: False
 */
public class BracketMatcher {

    private final String VALID_BRACKETS = "()";
    private int index = 0;

    Character getNextBracket(String input) {
        OptionalInt val = input.chars().filter(value -> VALID_BRACKETS.indexOf(value) != -1).skip(index++).findFirst();
        return val.isPresent() ? (char) val.getAsInt() : null;
    }


    String getBracketString(String input) {
        if (input == null) return null;
        String bracketStr = "";

        for (char ch : input.toCharArray()) {
            if (VALID_BRACKETS.indexOf(ch) != -1) {
                bracketStr = bracketStr.concat(String.valueOf(ch));
            }
        }

        return bracketStr;
    }

    public boolean matchBracketV1(String input) {
        index = 0;
        if (input == null) return false;
        Character character;
        Stack<Character> stack = new Stack<>();
        while ((character = getNextBracket(input)) != null) {
            if (character == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else {
                stack.push(character);
            }
        }
        return stack.isEmpty();
    }


    public boolean matchBracketV2(String input) {
        if (input == null) return false;

        String filteredInput = getBracketString(input);

        Stack<Character> stack = new Stack<>();
        for (char character : filteredInput.toCharArray()) {
            if (character == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else {
                stack.push(character);
            }
        }
        return stack.isEmpty();
    }
}
