package com.self.datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeChildrenSumPropertyTest {

    private Node root;
    @BeforeEach
    public void setUp(){
        root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);
    }

    @Test
    public void testChildrenSumUsingRecursion(){
        BinaryTreeChildrenSumProperty childrenSumProperty = new BinaryTreeChildrenSumProperty();
        assertTrue(childrenSumProperty.childrenSumUsingRecursion(root));
    }
}