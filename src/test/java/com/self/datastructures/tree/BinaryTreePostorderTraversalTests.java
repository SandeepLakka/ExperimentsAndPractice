package com.self.datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreePostorderTraversalTests {

    private Node root;

    @BeforeEach
    void setUp() {
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(70);
        root.left.right.right = new Node(80);
        root.right.right = new Node(60);
    }

    @Test
    public void testPostorderTraversalUsingRecursion() {
        BinaryTreePostorderTraversal postOrderTraversal = new BinaryTreePostorderTraversal();
        StringBuilder sb = new StringBuilder();
        postOrderTraversal.postOrderTraversalUsingRecursion(root, sb);
        assertEquals("40 70 80 50 20 60 30 10 ", sb.toString());
    }
}