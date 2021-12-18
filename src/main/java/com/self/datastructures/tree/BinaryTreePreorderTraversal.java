package com.self.datastructures.tree;

/**
 * Preorder traversal first traverses root then left section of tree and then right portion
 *  Ex: For a binary tree with root as 10, left 20, right 30
 *  For 20, left is 40 and right is 50
 *  For 50, left is 70 and right is 80
 *  For 30, right is 60
 *  output of preorder traversal is 10,20,40,50,70,80,30,60
 */
public class BinaryTreePreorderTraversal {

    /**
     * Time complexity: O(N) as constant amount of work is done on each node i.e call to left and call to right
     * Auxilary Space: O(h) is proportional to height of tree. (number of recursion calls)
     * Because either left calls or right calls will be executing at any time and atmost calls will be height + 1
     */
    public void preOrderTraversalUsingRecursion(Node node, StringBuilder sb){
        if(node == null) {
            return;
        }
        sb.append(node.data).append(" ");
        preOrderTraversalUsingRecursion(node.left, sb);
        preOrderTraversalUsingRecursion(node.right, sb);
    }

    //Todo Iterative approach
}

