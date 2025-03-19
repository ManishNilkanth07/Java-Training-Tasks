package ObjectClass;

public class Main {
    public static void main(String[] args)
    {
        // toString(), equals() and hashCode() method uses
        ObjectClass objectClass = new ObjectClass("My Object class");
        ObjectClass objectClass1 = new ObjectClass("My Object class");
        System.out.println(objectClass.toString());
        System.out.println(objectClass.equals(objectClass1));
        System.out.println(objectClass.hashCode());
        System.out.println(objectClass1.hashCode());

        // clone() method uses
        CloneObject original = new CloneObject("Shikhu","Khandwa");
        CloneObject clonedObject = original.clone();
        System.out.println(original.getName());
        System.out.println(clonedObject.getName());
        System.out.println(original.hashCode());
        System.out.println(clonedObject.hashCode());
        System.out.println(original.equals(clonedObject));  //clone method uses deep copy

    }
}
