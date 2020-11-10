package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyNode list = new SinglyNode();
        list = SinglyNode.insert(list, 2);
        list = SinglyNode.insert(list, 3);
        list = SinglyNode.insert(list, 4);
        list = SinglyNode.insert(list, 5);
        SinglyNode.printList(list);
        list = SinglyNode.delete(list, 4);
        System.out.println("After deletion: ");
        SinglyNode.printList(list);

    }
}
