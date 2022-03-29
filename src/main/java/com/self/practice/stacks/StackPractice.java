package com.self.practice.stacks;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class StackPractice {

    private Stack<String> stringStack = new Stack<>();

    {
        try {
            Class cls = getClass();
            System.out.println("class name : " + cls.getName());
            String pkgName = cls.getName().substring(0, cls.getName().lastIndexOf("."));
            System.out.println("Package : " + pkgName);
            Constructor constructor = cls.getConstructor();
            System.out.println("constructor is : " + constructor.getName());
            System.out.println("The public methods of class are : ");
            Method[] methods = cls.getMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
            System.out.println(Arrays.toString(cls.getDeclaredMethods()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public Stack<String> getStringStack() {
        return stringStack;
    }

    public static void main(String[] args) {
        StackPractice stackPractice = new StackPractice();
        System.out.println("\n-------Initial state of stack : " + stackPractice.getStringStack());
        System.out.println("\n-------Pushing items into stack");
        stackPractice.pushIntoStack(new String[]{"one", "two", "three", "four", "five"});
        System.out.println("\n-------Current state of stack : " + stackPractice.getStringStack());
        final int noOfItemsToPop = 3;
        System.out.println("\n-------Popping " + noOfItemsToPop + " items from stack");
        stackPractice.popFromStack(noOfItemsToPop);
        System.out.println("\n-------Current state of stack : " + stackPractice.getStringStack());
        System.out.println("\n-------Peeking the stack ");
        stackPractice.peekAtStack();
        System.out.println("\n-------Current state of stack : " + stackPractice.getStringStack());
        System.out.println("\n-------Searching item 'three' in stack");
        stackPractice.searchInStack("three");
        System.out.println("\n-------Searching item 'one' in stack");
        stackPractice.searchInStack("one");
        System.out.println("\n-------Current state of stack : " + stackPractice.getStringStack());

    }

    private void pushIntoStack(String[] arr) {
        for (String value : arr) {
            stringStack.push(value);
        }
    }

    private void popFromStack(int noOfElements) {
        if (stringStack.size() < noOfElements) {
            throw new IllegalArgumentException("noOfElements must be less than the stack size of " + stringStack.size());
        }
        IntStream.range(0, noOfElements).mapToObj(val -> stringStack.pop()).forEach(System.out::println);
    }

    private void peekAtStack() {
        if (stringStack.isEmpty()) {
            System.out.println("Stack is empty");
        }
        System.out.println("stack size before peek: " + stringStack.size());
        System.out.println("Peek value : " + stringStack.peek());
        System.out.println("stack size after peek : " + stringStack.size());
    }

    private void searchInStack(String element) {
        int idx = stringStack.search(element);
        if (idx == -1) {
            System.out.println("Element '" + element + "' not found in stack");
        } else {
            System.out.println("Element '" + element + "' is found at index: " + idx);
        }
    }

}
