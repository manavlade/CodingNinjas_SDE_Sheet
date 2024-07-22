import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

 class Infosys {

    // Sample Question 1
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    //     int e = sc.nextInt();

    //     int monst[] = new int[n];
    //     int bonus[] = new int[n];

    //     for (int i = 0; i < n; i++) {
    //         monst[i] = sc.nextInt();
    //     }

    //     for (int i = 0; i < n; i++) {
    //         bonus[i] = sc.nextInt();
    //     }

    //     class Monster {
    //         private final int power, bonus;

    //         public Monster(int power, int bonus) {
    //             this.power = power;
    //             this.bonus = bonus;
    //         }
    //     }

    //     Monster[] monster = new Monster[n];

    //     for (int i = 0; i < n; i++) {
    //         monster[i] = new Monster(monst[i], bonus[i]);
    //     }

    //     Arrays.sort(monster, Comparator.comparingInt(m -> m.power));
    //     int count = 0;

    //     for (Monster m : monster) {
    //         if(e < m.power) break;

    //         e += m.bonus;
    //         ++count;
    //     }

    //     System.out.println(count);
    // }

    public static int counter(int n, int k) {
        int count = 0;

        if (k == 1) {
            return n;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % i == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countt(int n, int k) {
        if (k == 1) {
            return n;
        }

        if (k == 2) {
            return counter(n, k);
        }

        int mid = k / 2;
        int x = countt(n, k-mid);
        int y = counter(n, mid);
        return x + y -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
       
        System.out.println(countt(n, k));
        
    }  
    
}