// Creating thread using Runnable interface
package BaiscPractice.Thread;

class t1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am thread1");
            i++;
        }
    }
}

class t2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am thread2......");
            i++;
        }
    }
}


public class Thread3_UsingRunnableInterface {
    public static void main(String[] args) {
        t1 obj1 = new t1();
        Thread newThread = new Thread(obj1);

        t2 obj2 = new t2();
        Thread newThread2 = new Thread(obj2);

        newThread.start();
        newThread2.start();
    }
}
