package InterThreadCommunication;

public class Producer extends Thread{

    private final Company company;

    public Producer(Company company)
    {
        this.company = company;
    }

    @Override
    public void run()
    {
        int i = 1;
        while(true)
        {
            try {
                company.produce_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
