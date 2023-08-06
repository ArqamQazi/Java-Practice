package AdvancdJava.ArrayList;

import java.util.ArrayList;

public class ArrayList_Practice {
    public static void main(String[] args) {
        // Array list is like modified array
        ArrayList<Integer> l1 = new ArrayList<>();
        // Creates ArrayList object of integer type

        // 1. Adding element
        l1.add(2);
        l1.add(6);
        l1.add(8);
        l1.add(2);
        l1.add(4,5); // Insert 5 at 4 index
        System.out.println(l1);

        // 2. Removing an Element :

        l1.remove(0);
        System.out.println("ArrayList after removing the value at index 0 :" + l1);

        // 3. Checking if an ArrayList contains a specific value or not :
        System.out.println("Array list : "+ l1);
        System.out.println("L1 list contains 7 : " + l1.contains(6));
        System.out.println("L1 list contains 4 : " + l1.contains(4));
        // 4. Finding the first and last occurrence of a specified number in the ArrayList :
        System.out.println("Index of element 2 is : " + l1.indexOf(2));
        System.out.println("Last index of element 2 is : " + l1.lastIndexOf(2));
        // 5.Removes all the elements from this list.
        l1.clear();

//        l1.remove(0);
        // All methods are available on official documentation:
        // https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/ArrayList.html

        System.out.println(l1);
    }
}
