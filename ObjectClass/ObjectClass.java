package ObjectClass;

public class ObjectClass {

    private final String name;

    public ObjectClass(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        System.out.println("class name is :" + name);
        return name;
    }

    @Override
    public boolean equals(Object object)
    {
        if(this == object)
        {
            return true;
        }
        // getClass() returns the class object of an instance
        if(object == null || getClass() != object.getClass())
        {
            return false;
        }
        // Typecasting into base class object
        ObjectClass objectClass = (ObjectClass) object;

        return this.name.equals(objectClass.name);
    }

    @Override
    public int hashCode()
    {
        return this.name.hashCode();
    }
}
