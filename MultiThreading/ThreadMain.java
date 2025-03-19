package MultiThreading;

import javax.swing.plaf.TableHeaderUI;

public class ThreadMain {
    public static void main(String[] args)
    {
        // Thread using Thread Class
        ThreadUsingThreadClass thread1 = new ThreadUsingThreadClass("classThread 1");
        ThreadUsingThreadClass thread2 = new ThreadUsingThreadClass("classThread 2");

        ThreadUsingThreadClass thread3 = new ThreadUsingThreadClass("classThread 3");

        //setting the priority
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

        //thread using runnable interface

        ThreadUsingRunnableInterface thread4 = new ThreadUsingRunnableInterface();
        ThreadUsingRunnableInterface thread5 = new ThreadUsingRunnableInterface();

        Thread executeThread1 = new Thread(thread4);
        Thread executeThread2 = new Thread(thread5);

        executeThread1.setName("RunnableThread 1");
        executeThread2.setName("RunnableThread 2");

        executeThread1.start();
        executeThread2.start();
    }
}
