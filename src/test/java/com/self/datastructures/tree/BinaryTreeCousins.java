package com.self.datastructures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
         1
       /   \
      2     3
    /  \   /  \
   4    5  6   7
 */
public class BinaryTreeCousins {

    public List<Integer> binaryTreeCousins(Node root, Node node) {
        int level = findHeight(root, node, 0);
        Queue<Node> queue = new LinkedList<>();
        if(root != null) {
            queue.add(root);
            queue.add(null);
        } else {
            return null;
        }
        int currentLevel = 0;
        List<Integer> list = new ArrayList<>();
        while (queue.size() > 1) {

            Node node1 = queue.poll();
            if(node1 == null){
                queue.add(null);
                continue;
            }
            if(node1.left != null){
                queue.add(node1.left);
                if(currentLevel == level-1 && !(node1.left.data==node.data || node1.right.data == node.data)){
                    list.add(node1.left.data);
                }
            }
            if(node1.right != null){
                queue.add(node1.right);
                if(currentLevel == level-1 && !(node1.right.data==node.data || node1.left.data == node.data)){
                    list.add(node1.right.data);
                }
            }
            currentLevel++;
        }
        return list;
    }

    public int findHeight(Node root, Node node, int height){
        if(root == null){
            return 0;
        }
        if(root.data == node.data){
            return height;
        }
        int leftHeight = findHeight(root.left, node, height+1);
        int rightHeight = findHeight(root.right, node, height+1);
        return leftHeight == 0 ? rightHeight : leftHeight;
    }
}
