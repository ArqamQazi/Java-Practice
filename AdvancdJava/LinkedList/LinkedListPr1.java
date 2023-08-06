/*
Linked List: It is a collection of nodes that are made up of two parts, i.e., data element and
reference to the next node in the sequence.

The insertion & deletion can be done in constant time in Linked List,

 */
package AdvancdJava.LinkedList;

import java.util.LinkedList;

public class LinkedListPr1 {
    public static void main(String[] args) {
        // Creating Linked list
        LinkedList<Integer> l1 = new LinkedList<>();
        // 1. Adding elements to linked list
        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(77);
        l1.add(5, 77); // Inserts 77 at index 5
        System.out.println("L1 Linked list : " + l1);
        //2. Remove elements

        l1.remove(2); //removes element present at 2nd index
        System.out.println("L1 Linked list after: "  + l1);

        //3.Replaces the element at the specified position.
        l1.set(2,10);

        //4. Inserting an element :
        //add first
        l1.addFirst(0);

        //add last
        l1.addLast(100);

    }
}
