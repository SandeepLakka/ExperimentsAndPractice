package com.self.datastructures.tree.bst;

import com.self.datastructures.tree.BalancedBinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInBinarySearchTreeTest {

    private Node root;

    private SearchInBinarySearchTree binarySearchTree;
    @BeforeEach
    public void setup(){
        binarySearchTree = new SearchInBinarySearchTree();
        root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
        root.right.left.left = new Node(16);
    }

    @Test
    public void searchUsingRecursion(){
        assertTrue(binarySearchTree.searchUsingRecursion(root, 18));
        assertFalse(binarySearchTree.searchUsingRecursion(root, 25));
    }

    @Test
    public void searchUsingIteration(){
        assertTrue(binarySearchTree.searchUsingIteration(root, 16));
        assertFalse(binarySearchTree.searchUsingIteration(root, 25));
    }
}