package AdvancdJava.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Practice {
    public static void main(String[] args) {
        // Array list is like modified array
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(6);
        l1.add(8);
        l1.add(2);
        l1.add(0, 5);
        l1.set(0, 10);

//        l1.clear();
        System.out.println("Index of element 2 is : " + l1.indexOf(2));
        System.out.println("Last index of element 2 is : " + l1.lastIndexOf(2));
        l1.remove(0);
        for (Integer integer : l1) {
            System.out.print(integer);
            System.out.print(", ");
        }
    }
}
