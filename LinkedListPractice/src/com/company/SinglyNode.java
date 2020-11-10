package com.company;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class SinglyNode {
    Node head;
   static class Node{
       int data;
       Node next;

       public Node(int data) {
           this.data = data;
           this.next = null;
       }

   }
   public static SinglyNode insert(SinglyNode list, int data){
       Node new_node = new SinglyNode.Node(data);
       if(list.head == null) {
           list.head = new_node;
       } else {
           Node last = list.head;
           while (last.next != null) {
               last = last.next;
           }
           last.next = new Node(data);
       }
       return list;
   }

   public static SinglyNode delete(SinglyNode list, int data) {
       Node last  = list.head;
       Node prev = null;
       if(last != null && last.data == data){
//           System.out.println("last.data: " + list.head);
           list.head = last.next;
//           System.out.println("last.next.data: " + last);
       } else {
           while(last != null && last.data != data) {
               prev = last;
               last = last.next;
           }
           prev.next = last.next;
       }
       return list;
   }

   public static SinglyNode deleteAtPosition(SinglyNode list, int position){
       Node currNode = list.head;

       
   }

   public static void printList(SinglyNode list){
       Node currNode = list.head;
       System.out.println("Linked List is:");
       while (currNode != null) {
           System.out.print(" " + currNode.data);
           currNode = currNode.next;
       }
   }

}
