//Advantages of Generics :
//Bugs can be detected at compile-time.
//Type-casting not required.



package AdvancdJava.JavaGenerics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);  //Integer value
        myArrayList.add("Arqam"); //String value
        myArrayList.add(20.4); //Double value
        System.out.println();
//        we can store any type of object in a collection without Generics.
//        But, this is not the case with the Generics. It allows us to store only one type of object
//        int x = myArrayList.get(0);
//        System.out.println(x);
//        Output:
//        java: incompatible types: java.lang.Object cannot be converted to int
//        The above code produces an error because we've not typed cast the object into the integer type

//        int y = (int) myArrayList.get(0); //b=object type cast into integer
//        System.out.println(y);


        ArrayList<Integer> myArrayList2 = new ArrayList<>();
        myArrayList2.add(10);
        myArrayList2.add(20);
        myArrayList2.add(30);
        myArrayList2.add(40);

        int x = myArrayList2.get(0);
        System.out.println(x);
    }
}
