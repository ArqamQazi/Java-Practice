package BaiscPractice.Thread;

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("This is just a simple Thread");
    }
}

class MyRunnableThr implements Runnable {
    @Override
    public void run() {
        System.out.println("This is my runnable thread.");
    }

}


public class Thread4_ConstructorAndMethods {
    public static void main(String[] args) {
        MyThr myThr = new MyThr("Arqam");
        MyRunnableThr obj1 = new MyRunnableThr();
        Thread t1 = new Thread(obj1, "Saad");
        myThr.start();
        t1.start();
        System.out.println("The id of myThr is " + myThr.threadId());
        System.out.println("The name of myThr is " + myThr.getName());

        System.out.println("The id of runnable thr " + t1.getName());
        System.out.println("The id of runnable thr " + t1.threadId());


    }
}
