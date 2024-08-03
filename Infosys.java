import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Infosys {

    // Sample Question 1
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int n = sc.nextInt();
    // int e = sc.nextInt();

    // int monst[] = new int[n];
    // int bonus[] = new int[n];

    // for (int i = 0; i < n; i++) {
    // monst[i] = sc.nextInt();
    // }

    // for (int i = 0; i < n; i++) {
    // bonus[i] = sc.nextInt();
    // }

    // class Monster {
    // private final int power, bonus;

    // public Monster(int power, int bonus) {
    // this.power = power;
    // this.bonus = bonus;
    // }
    // }

    // Monster[] monster = new Monster[n];

    // for (int i = 0; i < n; i++) {
    // monster[i] = new Monster(monst[i], bonus[i]);
    // }

    // Arrays.sort(monster, Comparator.comparingInt(m -> m.power));
    // int count = 0;

    // for (Monster m : monster) {
    // if(e < m.power) break;

    // e += m.bonus;
    // ++count;
    // }

    // System.out.println(count);
    // }

    // public static int counter(int n, int k) {
    // int count = 0;

    // if (k == 1) {
    // return n;
    // }

    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n; j++) {
    // if (j % i == 0) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    // public static int countt(int n, int k) {
    // if (k == 1) {
    // return n;
    // }

    // if (k == 2) {
    // return counter(n, k);
    // }

    // int mid = k / 2;
    // int x = countt(n, k-mid);
    // int y = counter(n, mid);
    // return x + y -1;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int k = sc.nextInt();

    // System.out.println(countt(n, k));

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int [] A = new int[n];

    // for (int i = 0; i < n; i++) {
    // A[i] = sc.nextInt();
    // }
    // int maxLength = 0;

    // for (int i = 1; i < n; i++) {
    // for (int j = 0; j < i; j++) {
    // if(A[i] > A[j]){
    // if(A[i] + 1 > A[i]){
    // A[i] = A[i] + 1;
    // }
    // }
    // }
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int n = sc.nextInt();
    // int [] A = new int[n];
    // int count = n/2;
    // int dp [] = new int[count+1];
    // int maxXOR = 0;
    // for (int i = 0; i < n; i++) {
    // A[i] = sc.nextInt();
    // }
    // Arrays.sort(A);

    // for (int i = n; i>= 0; i--) {
    // maxXOR += A[i];
    // }
    // }

    // private static boolean checker(int m, int base){
    // int rem = m % base;

    // m = m / 2;

    // while (m >= base && (m % base == rem)) {
    // m = m / base;
    // }

    // if(m == rem){
    // return true;
    // }

    // return false;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int m = sc.nextInt();

    // int base = 2;

    // while (checker(m, base) != true) {
    // base++;
    // }

    // System.out.println(base);
    // }



    /*
     * Question
     * There are three piles of stones. The first pile contains a stones, the second
     * pile contains b stones and the third pile contains c stones. You must choose
     * one of the piles and split the stones from it to the other two piles;
     * specifically, if the chosen pile initially contained s stones, you should
     * choose an integer k (0≤k≤s), move k stones from the chosen pile onto one of
     * the remaining two piles and s−k stones onto the other remaining pile.
     * Determine if it is possible for the two remaining piles (in any order) to
     * contain x stones and y stones respectively after performing this action.
     * SAMPLE INPUT :
     * 
     * 4
     * 
     * 1 2 3 2 4
     * 
     * 3 2 5 6 5
     * 
     * 2 4 2 6 2
     * 
     * 6 5 2 12 1
     * 
     * SAMPLE OUTPUT :
     * 
     * YES
     * 
     * NO
     * 
     * YES
     * 
     * NO
     * 
     * 
     * 
     * Test case 1: You can take the two stones on the second pile, put one of them
     * on the first pile and the other one on the third pile.
     * 
     * Test case 2: You do not have enough stones.
     * 
     * Test case 3: You can choose the first pile and put all stones from it on the
     * second pile.
     */
    public static boolean canSplit(long a, long b, long c, long x, long y) {
        long totalStones = a + b + c;
        long requiredStones = x + y;

        if (totalStones < requiredStones) {
            return false;
        }

        else {
            long minPile = Math.min(a, Math.min(b, c));

            if(y < minPile || x < minPile){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long b = sc.nextInt();
            long c = sc.nextInt();
            long a = sc.nextInt();
            long x = sc.nextInt();
            long y = sc.nextInt();

            if(canSplit(a, b, c, x, y)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}