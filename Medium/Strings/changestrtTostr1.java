package Medium.Strings;
public class changestrtTostr1 {
    /*
     * Question
     * You are given two strings 'str1' and 'str2'. Find the minimum operations
     * required to convert str1 into str2.
     * 
     * An Operation is defined as:
     * A character from an index of a string(str1) is put at the end of it, is
     * defined as a single operation.
     */
    
    public static int minCostToGivenString(String str1, String str2) {
        if (str1.length() < str2.length())
            return -1;

        int count = 0;
        int index1 = 0;
        int index2 = 0;

        while (index1 < str1.length() && index2 < str2.length()) {
            if (str1.charAt(index1) == str2.charAt(index2)) {
                index1++;
                index2++;
            } else {
                index1++;
                count++;
            }
        }
        return count;
    }
}
