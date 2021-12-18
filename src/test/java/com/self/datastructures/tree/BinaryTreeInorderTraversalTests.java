package com.self.datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTests {

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
    public void testInorderTraversalUsingRecursion() {
        BinaryTreeInorderTraversal inorderTraversal = new BinaryTreeInorderTraversal();
        StringBuilder sb = new StringBuilder();
        inorderTraversal.inOrderTraversalUsingRecursion(root, sb);
        assertEquals("40 20 70 50 80 10 30 60 ", sb.toString());
    }
}