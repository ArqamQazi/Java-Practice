package BaiscPractice.Thread;

public class MultiThreading {
    public static void main(String[] args) {

    }
}

//    Multiprocessing and multithreading both are used to achieve multitasking

//    threads use shared memory area
//        threads = faster content switching
//    A thread is light-weight where a process is heavyweight
//        for example = Aword processor can have one thread running in foreground as an editor
//        and another in the background auto saving the document !
/*
   Flow of control in java
   Without  threading
   main() -> func1() -> func2 -->end

   With threading :
   main() -->  -->
   fnc1() -->    End
                ^
   fnc2() --> ---

There are two ways to create a thread in java

By extending thread class
By implementing Runnable interface

 */
