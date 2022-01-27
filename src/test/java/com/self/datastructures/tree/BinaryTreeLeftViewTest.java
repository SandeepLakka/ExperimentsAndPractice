package com.self.datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLeftViewTest {

    private Node root;

    @BeforeEach
    void setUp() {
        root = new Node(4);
        root.left = new Node(5);
        root.right = new Node(2);
        root.right.left = new Node(3);
        root.right.right = new Node(1);
        root.right.left.left = new Node(6);
        root.right.left.right = new Node(7);
    }

    @Test
    public void testLeftViewUsingRecursion(){
        BinaryTreeLeftView leftView = new BinaryTreeLeftView();
        assertEquals("4 5 3 6 ", leftView.leftViewUsingRecursion(root, 1, new StringBuilder()));
    }

    @Test
    public void testLeftViewUsingIteration(){
        BinaryTreeLeftView leftView = new BinaryTreeLeftView();
        assertEquals("4 5 3 6 ", leftView.leftViewUsingIteration(root));
    }
}