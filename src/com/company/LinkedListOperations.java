package com.company;

public class LinkedListOperations {

    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
        head=newNode;
        }else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    public void traverse(){
        Node node=head;
        while(node!=null){
            System.out.print(node.data + "-->");
            node=node.next;
        }
        System.out.print("END");
    }
}
