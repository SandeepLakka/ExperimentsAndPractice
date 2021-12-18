package com.self.datastructures.tree;

/**
 * Binary tree is a non-linear datastructures. A node in a binary tree can have atmost 2 children
 * It can be traversed using breadth first traversal or depth first traversal.
 * Depth First traversal can be done in 3 ways Inorder, Preorder and Postorder.
 * will be implementing these traversal algorithms soon.
 */
public class BinaryTree {

    /**
     * Only implementing binary tree. Traversal would be implemented in different class
     */
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);;
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
    }
}

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}


