package Java_Oops.Abstract;

public class Pig extends Animal{
    public void animalSound()
    {
        System.out.println("The pig says: wee wee");
    }

    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();  // Calls the inherited method sleep()
    }
}
