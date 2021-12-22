package com.self.datastructures.tree;

/**
 * Height is maximum number of nodes from root to leaf
 *  Ex: For a binary tree with root as 10, left 20, right 30
 *  For 20, left is 40 and right is 50
 *  For 50, left is 70 and right is 80
 *  For 30, right is 60
 *  height is 4
 */
public class BinaryTreeHeight {

    /**
     * Time complexity: O(N) as constant amount of work is done on each node i.e call to left and call to right
     * Auxilary Space: O(h) is proportional to height of tree.
     * Because either left calls or right calls will be executing at any time and atmost calls will be height + 1
     */
    public int heightOfTree(Node node, int count){
        if(node == null){
            return count;
        }
        return Math.max(heightOfTree(node.left, count+1), heightOfTree(node.right, count+1));
    }
}
