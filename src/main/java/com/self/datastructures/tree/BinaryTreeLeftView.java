package com.self.datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLeftView {

    private int maxLevel = 0;

    public String leftViewUsingRecursion(Node node, int level, StringBuilder result){
        if(node!=null) {
            if (maxLevel < level) {
                result.append(node.data).append(" ");
                maxLevel++;
            }
            leftViewUsingRecursion(node.left, level + 1, result);
            leftViewUsingRecursion(node.right, level + 1, result);
        }
        return result.toString();
    }

    public String leftViewUsingIteration(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()){
            int count = queue.size();
            for(int i=0; i<count; i++){
                Node currentNode = queue.poll();
                if(currentNode.left!=null) queue.add(currentNode.left);
                if(currentNode.right!=null) queue.add(currentNode.right);
                if(i==0) {
                    sb.append(currentNode.data).append(" ");
                    continue;
                }
            }
        }
        return sb.toString();
    }
}
