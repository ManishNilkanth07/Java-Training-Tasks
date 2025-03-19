package ObjectClass;

public class CloneObject implements Cloneable{

    private final String name;
    private final String city;

    public CloneObject(String name,String city)
    {
        this.city = city;
        this.name = name;
    }
    @Override
    public CloneObject clone() {
        try
        {
            return (CloneObject) super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    public String getName()
    {
        return this.name;
    }
    public String getCity()
    {
        return this.city;
    }
}
