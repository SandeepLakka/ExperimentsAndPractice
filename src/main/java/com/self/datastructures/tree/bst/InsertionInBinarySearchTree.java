package com.self.datastructures.tree.bst;

public class InsertionInBinarySearchTree {

    public Node insertUsingRecursion(Node node, int insertKey){
        if(node == null){
            return new Node(insertKey);
        }
        if(node.key > insertKey){
            node.left = insertUsingRecursion(node.left, insertKey);
        } else if (node.key < insertKey){
            node.right = insertUsingRecursion(node.right, insertKey);
        }
        return node;
    }

    public Node insertUsingIteration(Node node, int insertKey){
        Node prev = null;
        while (node != null){
            if(node.key > insertKey){
                node = node.left;
            } else if (node.key < insertKey){
                node = node.right;
            } else if (node.key == insertKey){
                return node;
            }
            if(node != null){
                prev = node;
            }
        }
        Node insertNode = new Node(insertKey);
        if(prev != null){
            if(insertKey > prev.key){
                prev.right = insertNode;
            } else {
                prev.left = insertNode;
            }
        }
        return insertNode;
    }
}
