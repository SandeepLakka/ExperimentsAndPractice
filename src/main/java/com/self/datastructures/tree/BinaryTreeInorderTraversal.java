package com.self.datastructures.tree;

/**
 * Inorder traversal first traverses left section of tree, then root and then right portion
 *  Ex: For a binary tree with root as 10, left 20, right 30
 *  For 20, left is 40 and right is 50
 *  For 50, left is 70 and right is 80
 *  For 30, right is 60
 *  output of inorder traversal is 40,20,70,50,80,10,30,60
 */
public class BinaryTreeInorderTraversal {

    /**
     * Time complexity: O(N) as constant amount of work is done on each node i.e call to left and call to right
     * Auxilary Space: O(h) is proportional to height of tree.
     * Because either left calls or right calls will be executing at any time and atmost calls will be height + 1
     */
    public void inOrderTraversalUsingRecursion(Node node, StringBuilder sb){
        if(node == null) {
            return;
        }
        inOrderTraversalUsingRecursion(node.left, sb);
        sb.append(node.data).append(" ");
        inOrderTraversalUsingRecursion(node.right, sb);
    }

    //Todo Iterative approach
}

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}
