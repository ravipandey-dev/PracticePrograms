package com.company;

public class LinkedListOperations {

    Node head;

    public boolean remove(int i) {
        Node node=head;

        if(node==null){
            return false;
        }
        //remove head node
        if(node.data==i){
            head=node.next;
            return true;
        }
        //remove any other node
        while(node.next!=null)
        {
            if(node.next.data==i){
                node.next=node.next.next;
                return true;
            }
            node=node.next;
        }
        return false;
    }

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

    public int findMiddleNode(){
        Node fastptr=head;
        Node slowptr=head;
        if(head!=null){
            while(fastptr!=null && fastptr.next!=null){
                fastptr=fastptr.next.next;
                slowptr=slowptr.next;
            }
            System.out.println("Middle Node is :" + slowptr.data);
            return slowptr.data;
        }
        return -1;
    }
}
