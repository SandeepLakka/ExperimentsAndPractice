package com.self.datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {

    private Node root;

    @BeforeEach
    public void setup(){
        root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.right.left = new Node(15);
        root.right.right = new Node(20);
    }

    @Test
    public void testIsBalancedUsingRecursion(){
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        assertTrue(balancedBinaryTree.isBalancedUsingRecursion(root));
    }
}