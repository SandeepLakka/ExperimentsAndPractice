package com.self.datastructures.tree;

/*
Given a random binary tree, return a mirror of it.

example1:
         1				         1
       /   \                   /   \
      2     3     --->        3     2
    /  \   /  \             /  \   /  \
   4    5  6   7           7    6  5   4

example2:
         1				        1
       /                		 \
      2                 		  2
    /  \          --->     		/  \
   4    5               	   5    4
	     \              	  /		
	      6             	 6		 
 */
public class BinaryTreeMirror {

    public Node getMirrorOfTree(Node node) {
        if (node == null) return node;
        Node temp = node.left;
        node.left = getMirrorOfTree(node.right);
        node.right = getMirrorOfTree(temp);
        return node;
    }
}
