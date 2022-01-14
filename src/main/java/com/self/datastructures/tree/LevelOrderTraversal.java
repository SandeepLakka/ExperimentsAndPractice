package com.self.datastructures.tree;

public class LevelOrderTraversal {

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
}
