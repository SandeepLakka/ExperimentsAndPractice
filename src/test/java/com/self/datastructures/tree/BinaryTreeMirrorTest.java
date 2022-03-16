package com.self.datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMirrorTest {

    private Node root;
    private int height;
    private BinaryTreeMirror underTest;

    @BeforeEach
    public void initTree() {
        underTest = new BinaryTreeMirror();
        //Initialize a random tree
        height = new Random().nextInt(5);
        root = getTreeOfHeight(height);

    }

    @RepeatedTest(5)
    public void test() {
        System.out.println("height : " + height);
        System.out.println("Input Tree---------------------");
        printBinaryTree(root, height);
        root = underTest.getMirrorOfTree(root);
        System.out.println("Output Tree---------------------");
        printBinaryTree(root, height);
        System.out.println("-------------xxxxx--------------");

    }

    //Helper
    private Node getTreeOfHeight(int height) {
        if (height == 0) return null;
        int val = 1;
        Node root = new Node(1);
        height--;
        Node pointer = root;
        while (height > 0) {
            boolean isLeft = Math.random() * 10 > 5;
            boolean isRightAsWell = Math.random() * 10 < 5;
            if (isLeft && isRightAsWell && height > 1) {
                pointer.left = new Node(++val);
                pointer.right = new Node(++val);
            } else if (isLeft) {
                pointer.left = new Node(++val);
                pointer = pointer.left;
            } else {
                pointer.right = new Node(++val);
                pointer = pointer.right;
            }
            height--;
        }
        return root;
    }


    //courtesy of SO
    public static void printBinaryTree(Node root, int height) {
        LinkedList<Node> treeLevel = new LinkedList<>();
        treeLevel.add(root);
        LinkedList<Node> temp = new LinkedList<>();
        int counter = 0;
        //System.out.println(height);
        double numberOfElements = (Math.pow(2, (height + 1)) - 1);
        //System.out.println(numberOfElements);
        while (counter <= height) {
            Node removed = treeLevel.removeFirst();
            if (temp.isEmpty()) {
                printSpace(numberOfElements / Math.pow(2, counter + 1), removed);
            } else {
                printSpace(numberOfElements / Math.pow(2, counter), removed);
            }
            if (removed == null) {
                temp.add(null);
                temp.add(null);
            } else {
                temp.add(removed.left);
                temp.add(removed.right);
            }

            if (treeLevel.isEmpty()) {
                System.out.println();
                System.out.println();
                treeLevel = temp;
                temp = new LinkedList<>();
                counter++;
            }
        }
    }

    public static void printSpace(double n, Node removed) {
        for (; n > 0; n--) {
            System.out.print("\t");
        }
        if (removed == null) {
            System.out.print(" ");
        } else {
            System.out.print(removed.data);
        }
    }

}