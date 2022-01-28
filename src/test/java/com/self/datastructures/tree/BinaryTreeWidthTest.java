package com.self.datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeWidthTest {

    private Node root;

    @BeforeEach
    public void setup(){
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
    }

    @Test
    public void testWidthOfBinaryTree(){
        assertEquals(3, new BinaryTreeWidth().findWidthOfTree(root));
    }
}