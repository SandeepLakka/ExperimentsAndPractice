package com.self.datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeHeightTests {

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
    public void testHeightUsingRecursion() {
        BinaryTreeHeight calculateHeight = new BinaryTreeHeight();
        assertEquals(4 , calculateHeight.heightOfTree(root, 0));
        assertEquals(0 , calculateHeight.heightOfTree(null, 0));
        assertEquals(1 , calculateHeight.heightOfTree(new Node(10), 0));
    }
}