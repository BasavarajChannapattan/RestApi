package Java_Oops.BasicPrograms;

public class ReverseString {


    public static void main(String[] args) {
        String name ="Basava";
        String reverse="";

        for(int i=name.length()-1; i>=0; i--)
        {
            reverse+=name.charAt(i);
        }
        System.out.println(reverse);

    }


}
