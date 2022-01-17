package com.self.datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    /**
     * This is a naive approach which takes O(N*h) time complexity
     * where h is the height of a tree
     */
    public String levelOrderTraversalRecursion(Node root) {
        int height = findHeight(root, 0);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<height; i++){
            findNodes(root, i, 0, sb);
        }
        return sb.toString();
    }

    public int findHeight(Node root, int height) {
        if(root == null){
            return height;
        }
       return Math.max(findHeight(root.left, height+1), findHeight(root.right, height+1));
    }

    public void findNodes(Node root, int k, int height, StringBuilder sb){
        if(root == null){
            return;
        }
        if(k==height){
            sb.append(root.data).append(" ");
        }
        findNodes(root.left, k, height+1, sb);
        findNodes(root.right, k, height+1, sb);
    }

    public String levelOrderTraversalUsingQueue(Node root){
        StringBuilder sb = new StringBuilder();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            sb.append(node.data).append(" ");
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return sb.toString();
    }
}
