package AdvancdJava.Hashing;

import java.util.HashSet;

public class HashSeEX1 {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will not be added

        System.out.println(myHashSet);

        System.out.println("myHashSet before removing any element : " + myHashSet);
        myHashSet.remove(11); //deletes 3 from the hashset
        System.out.println("myHashSet after removing a element : " + myHashSet);

        HashSet<Integer> myHashSet2 = new HashSet<>();

        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet2.isEmpty());

//        Removing all the elements from the HashSet :
//        clear() method is used to remove all the elements from the HashSet at once.
//        size() method is used to get the size of the HashSet

        System.out.println("The size of myHashSet is : " + myHashSet.size());

        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println("myHashSet after  deleting elements: " + myHashSet);
    }
}
