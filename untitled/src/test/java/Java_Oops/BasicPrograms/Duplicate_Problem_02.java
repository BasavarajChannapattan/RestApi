package Java_Oops.BasicPrograms;

import java.util.HashSet;

public class Duplicate_Problem_02 {


    public static void main(String[] args) {


        String name = "Programming";
        name = name.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>();

        for(int i = 0; i<name.length(); i++){

            if(!set.add(name.charAt(i))){
                duplicate.add(name.charAt(i));
            }
        }

        System.out.println("Duplicate characters: " + duplicate);
    }
}
