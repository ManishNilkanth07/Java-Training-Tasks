package MultiThreading;

public class ThreadUsingThreadClass extends Thread{

    public ThreadUsingThreadClass(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        for(int i = 1; i <= 6; i++)
        {
            System.out.println(Thread.currentThread().getName() + " is running :"+ i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
