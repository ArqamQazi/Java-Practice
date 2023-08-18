// Thread using extending thread class
package BaiscPractice.Thread;

class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("This is my first Thread.");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("This is my second thread running");
            i++;
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

    }
}
