package com.self.datastructures.tree.bst;

public class SearchInBinarySearchTree {

    public boolean searchUsingRecursion(Node node, int searchKey){
        if(node == null){
            return false;
        }
        else if(node.key == searchKey){
            return true;
        }
        else if(node.key > searchKey){
            return searchUsingRecursion(node.left, searchKey);
        }
        else if(node.key < searchKey){
            return searchUsingRecursion(node.right, searchKey);
        }
        return false;
    }

    public boolean searchUsingIteration(Node node, int searchKey){
        while(node != null){
            if(node.key == searchKey){
                return true;
            } else if(node.key > searchKey){
                node = node.left;
            } else if (node.key < searchKey) {
                node = node.right;
            }
        }
        return false;
    }
}
