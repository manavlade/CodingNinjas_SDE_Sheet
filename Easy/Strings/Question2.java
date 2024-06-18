package Easy.Strings;

public class Question2 {
    /*
     * Question
     * You are given a string 'str' of length 'N'.
     * Your task is to reverse the original string word by word.
     * There can be multiple spaces between two words and there can be leading or
     * trailing spaces but in the output reversed string you need to put a single
     * space between two words, and your reversed string should not contain leading
     * or trailing spaces.
     * Example :
     * If the given input string is "Welcome to Coding Ninjas", then you should
     * return "Ninjas Coding to Welcome" as the reversed string has only a single
     * space between two words and there is no leading or trailing space.
     */
    public static String reverseString(String str) {
        String[] arr = str.trim().split("\\s+");
        // After above code string "Hello World" would become "Hello", "world"
        int s = 0;
        int e = arr.length - 1;
        String temp = "";

        while (s < e) {
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        String ans = String.join(" ",arr);
        return ans;
    }
}
