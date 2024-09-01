public class RecursionPrac {
    public static void towerOfHinoi(int n, String src, String helper, String dest){
        if(n == 0){
            System.out.println("Mo disk to be moved");
        }
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHinoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHinoi(n-1, helper, src, dest);
    }

    public static void reverseString(String s, int n){
        if(n == 0){
            System.out.println(s.charAt(n));
            return;
        }

        System.out.println(s.charAt(n));
        reverseString(s, n-1);
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        // int n = 3;
        // towerOfHinoi(n, "S", "H", "D");

        String s = "abcde";

        reverseString(s, s.length()-1);
    }
}
