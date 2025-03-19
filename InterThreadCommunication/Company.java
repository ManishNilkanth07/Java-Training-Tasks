package InterThreadCommunication;

public class Company {
    private int count;

    private boolean flag = true;

    synchronized public void produce_item(int count) throws InterruptedException {
        if(!flag)
        {
            wait();
        }
        this.count = count;
        System.out.println("Produced item :"+ count);
        flag = false;
        notify();
    }

    synchronized public void consume_item() throws InterruptedException {
        if(flag)
        {
            wait();
        }
        System.out.println("Consumed item :" + count);
        flag = true;
        notify();
    }
}
