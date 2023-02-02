package com.stasih;

public class LinkedList1 {
    Node head;

    class Node {
        int value;
        Node next;

        Node (int data){
            value = data;
            next = null;
        }
    }
    // Insert Node at head
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert Node after a given node
    public void insert(Node prevNode, int data){
        if (prevNode == null){
            System.out.println("Previous node cannot be null.");
        }
        else {
            Node newNode = new Node(data);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }
    // Add node at the end
    public void addAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while (last != null){
            last = last.next;
        }
        last.next = newNode;
        return;
    }

    // Search for element
    public boolean search(int data){
        Node current = head;
        while (current != null){
            if (current.value == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
