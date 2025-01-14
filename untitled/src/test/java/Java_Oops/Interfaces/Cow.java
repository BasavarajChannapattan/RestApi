package Java_Oops.Interfaces;

public class Cow implements Animal{
    public void animalSound()
    {
        System.out.println("Cow says: Moo");
    }
    public void eat()
    {
        System.out.println("Cow eats grass");
    }

    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.animalSound();
        cow.eat();
    }
}
