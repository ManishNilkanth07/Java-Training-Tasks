package InterThreadCommunication;

public class Consumer extends Thread{

    private final Company company;

    public Consumer(Company company)
    {
        this.company = company;
    }

    @Override
    public void run()
    {
        while (true)
        {
            try {
                company.consume_item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
