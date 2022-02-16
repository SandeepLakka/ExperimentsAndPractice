package com.self.datastructures.list;

public class Node<T> {

    T data;
    Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }


    public Node(T data) {
        this.data = data;
    }
}