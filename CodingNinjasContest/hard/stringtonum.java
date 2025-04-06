package CodingNinjasContest.hard;

import java.util.Scanner;

public class stringtonum {
    public static int stringToNum(String s){
        int numberOfOne = 0;
        int numberOfTwo = 0;

        for (int i = 0; i < s.length(); i++) {
            int one = s.charAt(i) - 'A';
            System.out.println(one);
        }
    }
    
}
