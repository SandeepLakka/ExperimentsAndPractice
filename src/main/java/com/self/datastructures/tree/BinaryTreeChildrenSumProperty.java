package com.self.datastructures.tree;

/**
 * sum of values of children should be equal to the value of parent
 */
public class BinaryTreeChildrenSumProperty {

    public boolean childrenSumUsingRecursion(Node node){
        if(node == null) {
            return true;
        }
        if(node.left == null && node.right == null){
            return true; // for leaf nodes
        }
        int leftSum = node.left == null ? 0 : node.left.data;
        int rightSum = node.right == null ? 0 : node.right.data;
        if(node.data == (leftSum+rightSum)){
            return true && childrenSumUsingRecursion(node.left) && childrenSumUsingRecursion(node.right);
        }
        return false;
    }
}
