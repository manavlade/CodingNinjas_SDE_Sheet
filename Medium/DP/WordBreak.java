package Medium.DP;

import java.util.HashMap;

public class WordBreak {
    /*
     * Question
     * You are given a list of “N” strings A. Your task is to check whether you can
     * form a given target string using a combination of one or more strings of A.
     * 
     * Note :
     * You can use any string of A multiple times.
     * Examples :
     * A =[“coding”, ”ninjas”, “is”, “awesome”] target = “codingninjas”
     * Ans = true as we use “coding” and “ninjas” to form “codingninjas”
     */
    public static Boolean wordBreak(String[] arr, int n, String target) {
        HashMap<Character, Boolean> map = new HashMap<>();

        for (int i = 0; i < target.length(); i++) {
            map.put(target.charAt(i), false);
        }

        for (int i = 0; i < arr.length; i++) {
            if(target.contains(arr[i] + "")){
                for (int j = 0; j < arr[i].length(); j++) {
                    map.put(arr[i].charAt(j), true);
                }
            }
        }
        for (Boolean b : map.values()) {
            if(b == false){
                return false;
            }
        }
        return true;
    }
}
