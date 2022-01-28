package com.self.datastructures.tree;

public class BalancedBinaryTree {

    public boolean isBalancedUsingRecursion(Node node){
        if(node == null){
            return true;
        }
        int left = calculateHeight(node.left);
        int right = calculateHeight(node.right);
        if(Math.abs(left-right) <=1){
            return true && isBalancedUsingRecursion(node.left) && isBalancedUsingRecursion(node.right);
        }
        return false;
    }

    public int calculateHeight(Node node) {
      if(node == null){
          return 0;
      }
      return 1+Math.max(calculateHeight(node.left), calculateHeight(node.right));
    }
}
