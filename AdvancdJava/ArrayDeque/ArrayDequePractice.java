/*
ArrayDeque = Resizable array + Deque interface.
ArrayDeque implements the Queue & Deque interface.
There are no capacity restrictions for ArrayDeque, and it provides us the facility to add or remove any element from both sides of the queue.
Also known as Array Double Ended Queue.
It is faster than Linked list and stack.
 */
package AdvancdJava.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequePractice {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        // 1. Inserting an element :
        //Insertion at front : add(), offerFirst() and addFirst() methods are used to insert an element at front of an array deque.
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println(ad1);
        // 2. Insertion At End: addLast() and offerLast() methods are used to insert
        // an element at the end of the array deque.
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addLast(5);
        ad1.offerLast(10);

        System.out.println(ad1);
        // 3. Accessing an element from the head of the deque array: getFirst() & peekFirst()
        // methods are used to get the first element of the deque array.

        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());

        //3. Accessing the last element: getLast() or peekLast() methods are used to print the last element of the deque array.
        //Removing the first element: removeFirst() & pollFirst() methods are used to delete an element from the head of the queue.
        //removeFirst() throws an exception if the queue is empty.
        //pollFirst() returns null if the queue is empty.

        ad1.pollFirst();  // remove 10
        ad1.removeFirst(); // remove 5
        System.out.println(ad1);

        //4. Removing the last element: removeLast() & pollLast() methods are used to delete an element from the tail of the queue.

        ad1.pollLast(); //remove 10
        ad1.removeLast(); // remove 5
        System.out.println(ad1);

    }
}



















