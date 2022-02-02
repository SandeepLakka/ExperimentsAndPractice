package com.self.datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeCousinsTest {
    private Node root;

    @BeforeEach
    void setUp() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }

    @Test
    public void testCousins(){
//        assertIterableEquals(Arrays.asList(4,5), new BinaryTreeCousins().binaryTreeCousins(root, new Node(6)));
        assertIterableEquals(Arrays.asList(), new BinaryTreeCousins().binaryTreeCousins(root, new Node(2)));
    }
}