import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {
      
        if(str1.length() != str2.length()){
            return false;
        }

        int [] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for(int val: count){
            if(val != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String values");
        String str1 = "racecar";
        String str2 = "carrace";

        System.out.println(isAnagram(str1, str2));

        
    }
}
