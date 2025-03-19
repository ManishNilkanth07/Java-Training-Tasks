package OOPS;

public class OOPs {
    public static void main(String[] args)
    {
        Cat cat = new Cat("Sisu");
        System.out.println(cat.getName());
        cat.sound();

        Dog dog = new Dog("Rembo");
        System.out.println(dog.getName());
        dog.sound();
    }
}
