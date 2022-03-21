package com.self.practice.lists;

import java.util.ArrayList;
import java.util.List;

/*
Given a linked list of random order, sort it
1 -> 5 -> 4 -> 3   ====> 1 -> 3 -> 4 -> 5
 */
public class SortList {

    public static void main(String[] args) {
        SortList underTest = new SortList();
        //underTest.printList(underTest.createListFromArray(new int[]{1,2,3,4}));
        ListNode listNode = new ListNode(2);
        ListNode secNode = new ListNode(4);
        listNode.setNext(secNode);
        ListNode thrdNode = new ListNode(5);
        secNode.setNext(thrdNode);
        ListNode frthNode = new ListNode(3);
        thrdNode.setNext(frthNode);
        ListNode fifthNode = new ListNode(1);
        frthNode.setNext(fifthNode);
        ListNode sixthNode = new ListNode(6);
        fifthNode.setNext(sixthNode);
        ListNode seventhNode = new ListNode(7);
        sixthNode.setNext(seventhNode);

        underTest.printList(listNode);
        underTest.printList(underTest.sortList(listNode, 7));
        /*
         * 2 -> 4 -> 5 -> 3 -> 1 -> 6 -> 7
         * 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
         *
         */
    }

    //TODO impl
    public ListNode createListFromArray(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        if (arr.length == 1) return new ListNode(arr[0]);
        ListNode element = new ListNode(arr[0]);
        ListNode pointer = element;
        for (int i = 0; i < arr.length - 1; i++) {
            pointer.setNext(new ListNode(arr[i + 1]));
            pointer = pointer.getNext();
        }
        return element;
    }


    public void printList(ListNode root) {
        List<String> elements = new ArrayList<>();
        do {
            elements.add(Integer.toString(root.getValue()));
        } while ((root = root.getNext()) != null);
        System.out.println(String.join(" -> ", elements));
    }

    public ListNode sortList(ListNode list, int length) {
        //     1 3 6 2
        //   1 3      6 2
        //  1    3   6    2
        //   1 3      2 6
        //     1 2 3 6
        if (length <= 1) return list;
        int mid = length / 2;
        ListNode left, right;
        ListNode pointer = list;
        left = new ListNode(pointer.getValue());
        pointer = pointer.getNext();
        ListNode iter = left;
        for (int i = 1; i < mid; i++) {
            ListNode node = new ListNode(pointer.getValue());
            iter.setNext(node);
            iter = iter.getNext();
            pointer = pointer.getNext();
        }
        right = new ListNode(pointer.getValue());
        pointer = pointer.getNext();
        iter = right;
        for (int i = mid + 1; i < length; i++) {
            ListNode node = new ListNode(pointer.getValue());
            iter.setNext(node);
            iter = iter.getNext();
            pointer = pointer.getNext();
        }
        ListNode sortedLeft = sortList(left, mid);
        ListNode sortedRight = sortList(right, length - mid);
        int leftCounter = 0, rightCounter = 0;
        ListNode node = new ListNode();
        ListNode resultNode = node;
        ListNode leftNode = sortedLeft;
        ListNode rightNode = sortedRight;
        while (leftCounter < mid && rightCounter < (length - mid)) {
            if (leftNode.getValue() <= rightNode.getValue()) {
                node.setValue(leftNode.getValue());
                node.setNext(new ListNode());
                node = node.getNext();
                leftNode = leftNode.getNext();
                leftCounter++;
            } else {
                node.setValue(rightNode.getValue());
                node.setNext(new ListNode());
                node = node.getNext();
                rightNode = rightNode.getNext();
                rightCounter++;
            }
        }
        while (leftCounter < mid) {
            node.setValue(leftNode.getValue());
            node.setNext(new ListNode());
            node = node.getNext();
            leftNode = leftNode.getNext();
            leftCounter++;
        }
        while (rightCounter < (length - mid)) {
            node.setValue(rightNode.getValue());
            node.setNext(new ListNode());
            node = node.getNext();
            rightNode = rightNode.getNext();
            rightCounter++;
        }
        node = resultNode;
        for (int i = 0; i < length - 1; i++) {
            node = node.getNext();
        }
        node.setNext(null);
        return resultNode;
    }
}


// Node representation/contract for above Linked List

class ListNode {
    private int value;
    private ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}