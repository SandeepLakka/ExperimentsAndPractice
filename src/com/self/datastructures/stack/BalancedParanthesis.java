package com.self.datastructures.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        System.out.println(isBalanced("[()]{}{[()()]()}"));
        System.out.println(isBalanced("[(])"));
    }

    public static boolean isBalanced(String input){
        char[] inputChars = input.toCharArray();
        ArrayDeque<Character> myStack = new ArrayDeque<>();
        for(char eachChar: inputChars){
            if(eachChar=='[' || eachChar=='(' || eachChar == '{'){
                myStack.push(eachChar);
                continue;
            }
            char top = myStack.pop();
            switch(eachChar){
                case ')':
                    if(top=='('){
                        break;
                    }
                    return false;
                case '}':
                    if(top=='{'){
                        break;
                    }
                    return false;
                case ']':
                    if(top=='['){
                        break;
                    }
                    return false;
            }
        }
        if(myStack.isEmpty()){
            return true;
        }
        return false;
    }
}
