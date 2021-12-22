package com.self.datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeFindKthDistanceNodesTests {

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
    public void testFindKthDistanceNodesUsingRecursion() {
        BinaryTreeFindKthDistanceNodes kthDistanceNodes = new BinaryTreeFindKthDistanceNodes();
        StringBuilder sb = new StringBuilder();
        assertIterableEquals(Arrays.asList(40, 50, 60), kthDistanceNodes.findNodesAtKthDistance(root, 2, new ArrayList<>()));
    }

}