package com.self.datastructures.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BinaryTreeWidth {

    public int findWidthOfTree(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int width = 0;
        while (!queue.isEmpty()){
            int count = queue.size();
            width = Math.max(count, width);
            for(int i=0; i< count; i++){
                Node currNode = queue.poll();
                if(currNode.left != null) queue.add(currNode.left);
                if(currNode.right != null) queue.add(currNode.right);
            }
        }
        return width;
    }
}
