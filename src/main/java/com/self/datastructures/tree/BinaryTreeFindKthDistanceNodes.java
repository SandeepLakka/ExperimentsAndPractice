package com.self.datastructures.tree;

import java.util.List;

/**
 * Find Nodes at Kth distance in a binary tree
 * Ex: For a binary tree with root as 10, left 20, right 30
 * For 20, left is 40 and right is 50
 * For 50, left is 70 and right is 80
 * For 30, right is 60
 * If k is 2, output is 40,50,70
 */
public class BinaryTreeFindKthDistanceNodes {

    public List<Integer> findNodesAtKthDistance(Node node, int k, List<Integer> knodes){
        if(node == null){
            return null;
        }
        if( k == 0) {
            knodes.add(node.data);
        }
        findNodesAtKthDistance(node.left, k-1, knodes);
        findNodesAtKthDistance(node.right, k-1, knodes);
        return knodes;
    }
}
