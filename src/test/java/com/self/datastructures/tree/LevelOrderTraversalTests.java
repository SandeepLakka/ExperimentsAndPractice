package com.self.datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LevelOrderTraversalTests {

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
    public void testLevelOrderTraversalUsingRecursion() {
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        assertEquals("10 20 30 40 50 60 70 80 ", levelOrderTraversal.levelOrderTraversalRecursion(root));
    }

    @Test
    public void testLevelOrderTraversalUsingQueue(){
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        assertEquals("10 20 30 40 50 60 70 80 ", levelOrderTraversal.levelOrderTraversalUsingQueue(root));
    }
}