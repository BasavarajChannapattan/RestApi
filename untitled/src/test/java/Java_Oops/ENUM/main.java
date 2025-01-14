package Java_Oops.ENUM;

public class main {

    public static void main(String[] args) {
        //Level myVar = Level.MEDIUM;
        //System.out.println(myVar);

        for(Level myVar: Level.values())
        {
            System.out.println(myVar);
        }
    }
}
