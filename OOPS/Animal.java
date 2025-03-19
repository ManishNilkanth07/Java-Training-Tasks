package OOPS;

public class Animal {
    private String name;

    public Animal()
    {

    }
    public Animal(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void sound()
    {
        System.out.println("sound");
    }
}

