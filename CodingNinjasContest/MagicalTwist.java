package CodingNinjasContest;

public class MagicalTwist {
    /*
     * Question
     * You are given a string ‘S’ of length ‘N’ made up of only two types of magical
     * digits ‘1’ and ‘2’. The magical twist is that these digits have the ability
     * to transform into the English words “one”, and “two”, and they can appear in
     * various forms, considering the use of both lowercase and uppercase letters.
     * 
     * 
     * 
     * For instance, ‘1’ can be expressed as “one”, “One”, “ONe”, and more, while
     * ‘2’ can take on the form of “two” with different capitalizations. You have to
     * count the number of distinct strings you can make from the given string ‘S’.
     * You have to tell the number of distinct strings made from the given
     * string and return it.
     * Example:
     * ‘N’ = 1
     * ‘S’ = “2”
     * Here, the different strings made from the given string ‘S’ are: “2”, “two”,
     * “Two”, “tWo”, “twO”, “TWo”, “TwO”, “tWO”, “TWO”.
     * So, the total count is equal to ‘9’
     * 
     * For each character '1':
     * There are 8 possible transformations: ["one", "One", "ONe", "oNe", "onE",
     * "ONe", "ONe", "ONE"].
     * Why Multiply by 9:
     * Actually, the correct factor should be 8 (not 9), because there are 8
     * possible combinations of case transformations for each '1' or '2'. However,
     * if we consider the digit itself also as a possible representation (just '1'
     * or '2' without any transformation), then the total number of possibilities
     * would be 9.
     */
    
    public static long magicalTwist(int n, String s) {
        long result = 1;

        for (int i = 0; i < n; i++) {
            result *= 9;
        }
        return result;
    }
}
