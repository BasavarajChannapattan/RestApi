//package Java_Oops.BasicPrograms;
//
//import java.sql.SQLOutput;
//import java.util.HashSet;
//
//public class Duplicate_Problem_01 {
//
//
////    public static void main(String[] args) {
////        String name ="Programming is fun";
////        name.toLowerCase();
////
////        HashSet<Character> set = new HashSet<>();
////        HashSet<Character> duplicate = new HashSet<>();
////
////        for(char ch: name.toCharArray())
////        {
////            if(!ch.equals(" "))
////            {
//////                if(!set.add(ch))
////                {
////                    duplicate.add(ch);
////                }
////            }
////        }
////    }

package Java_Oops.BasicPrograms;
import java.util.HashSet;
    public class Duplicate_Problem_01 {
        public static void main(String[] args) {
            String name = "Programming is fun";
            name = name.toLowerCase();

            HashSet<Character> set = new HashSet<>();
            HashSet<Character> duplicate = new HashSet<>();

            for (char ch : name.toCharArray()) {
                if (ch != ' ') {
                    if (!set.add(ch)) {
                        duplicate.add(ch);
                    }
                }
            }

            // Output duplicate characters
            System.out.println("Duplicate characters: " + duplicate);
        }
    }

