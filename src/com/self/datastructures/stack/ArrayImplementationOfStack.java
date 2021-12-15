package com.self.datastructures.stack;

public class ArrayImplementationOfStack {
    int capacity = 0;
    int top = -1;
    int[] arr;
    /*
    Need to implement using generics
    Need to handle overflow and underflow conditions
    Handle dynamic sizing (use arraylist or linkedlist)
     */
    public ArrayImplementationOfStack(int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
    }

    public void push(int element){
        arr[++top] = element;
    }

    public int pop(){
        return arr[top--];
    }

    public int peek(){
        return arr[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int size(){
        return top+1;
    }

    public static void main(String[] args) {
        ArrayImplementationOfStack myStack = new ArrayImplementationOfStack(20);
        myStack.push(10);
        myStack.push(20);
        System.out.println(myStack.size());
        myStack.pop();
        System.out.println(myStack.size());
    }
}
