package com.self.datastructures.tree;

/**
 * Postorder traversal first traverses left section of tree and then right portion then root
 *  Ex: For a binary tree with root as 10, left 20, right 30
 *  For 20, left is 40 and right is 50
 *  For 50, left is 70 and right is 80
 *  For 30, right is 60
 *  output of postorder traversal is 40,70,80,50,20,60,30,10
 */
public class BinaryTreePostorderTraversal {

    /**
     * Time complexity: O(N) as constant amount of work is done on each node i.e call to left and call to right
     * Auxilary Space: O(h) is proportional to height of tree. (number of recursion calls)
     * Because either left calls or right calls will be executing at any time and atmost calls will be height + 1
     */
    public void postOrderTraversalUsingRecursion(Node node, StringBuilder sb){
        if(node == null) {
            return;
        }
        postOrderTraversalUsingRecursion(node.left, sb);
        postOrderTraversalUsingRecursion(node.right, sb);
        sb.append(node.data).append(" ");
    }

    //Todo Iterative approach
}

