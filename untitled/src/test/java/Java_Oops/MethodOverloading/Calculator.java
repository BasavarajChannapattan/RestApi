package Java_Oops.MethodOverloading;

public class Calculator {
    public int add(int a, int b)
    {
        return a + b;
    }

    public double add(double a, double b)
    {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("add " +  c.add(5,5));
        System.out.println("add " +  c.add(10.9,9.765));
    }
}
