package com.self.datastructures.tree.bst;

public class DeleteInBinarySearchTree {

    public Node deleteUsingRecursion(Node node, int deleteKey){
        if(node.key > deleteKey){
            node.left = deleteUsingRecursion(node.left, deleteKey);
        } else if (node.key < deleteKey){
            node.right = deleteUsingRecursion(node.right, deleteKey);
        } else {
            if(node.right == null && node.left==null){
                return null;
            } else if (node.right == null){
                return node.left;
            } else if (node.left == null){
                return node.right;
            } else {
                Node next = getNext(node);
                node.key = next.key;
                node.right = deleteUsingRecursion(node.right, next.key);
            }
        }
        return node;
    }

    public Node getNext(Node node){
        Node cNode = node.right;
        while(cNode != null && cNode.left != null){
            cNode = cNode.left;
        }
        return cNode;
    }
}
