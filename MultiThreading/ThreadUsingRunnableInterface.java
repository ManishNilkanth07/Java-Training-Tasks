package MultiThreading;

public class ThreadUsingRunnableInterface implements Runnable{


    @Override
    public void run()
    {
        for(int i = 0; i < 8; i++)
        {
            System.out.println(Thread.currentThread().getName() + "(runnable) is running " + i);
            Thread.yield();

            try{
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
