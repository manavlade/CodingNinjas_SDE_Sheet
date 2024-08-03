package Hard.DP;

import java.util.Arrays;

public class minMax {
    /*
     * Question
     * You are given a mathematical expression ‘exp’ consisting of only two
     * operators ‘+’ and ‘*’. You have to find the maximum and minimum value
     * possible of the expression by placing valid parentheses anywhere in the
     * expression.
     * For example:
     * You are given ‘exp’ = 1*2+4*5+3, here the minimum and maximum value of the
     * expression occurs when , (1*2) + (4*5) + 3 = 25, and 1*(2 + 4) *(5 + 3) = 48.
     * Hence the answer is [25, 48].
     * 
     * Sample Input 1:
     * 2
     * 1*2+4*5+3
     * 2*3+4+1*5
     * Sample Output 1:
     * 25 48
     * 15 80
     * Explanation:
     * For the first test case, ‘exp’ = 1*2+4*5+3, here the minimum and maximum
     * values of the expression occurs when , (1*2) + (4*5) + 3 = 25, and 1*(2 + 4)
     * *(5 + 3) = 48. Hence the answer is [25, 48]
     * 
     * For the second test case, ‘exp’ = 2*3+4+1*5, here the minimum and maximum
     * values of the expression occur when, (2*3) + 4 + (1*5) = 15, and 2*(3 + 4 +
     * 1)*5 = 80. Hence the answer is [15, 80].
     */
    public static int[] minMaxValue(String exp) {
        int n = exp.length();
        int[][] minVal = new int[n][n];
        int[][] maxVal = new int[n][n];

        for (int[] row : minVal) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        for (int[] col : maxVal) {
            Arrays.fill(col, Integer.MIN_VALUE);
        }

        for (int i = 0; i < n; i+=2) {
            minVal[i][i] = maxVal[i][i] = exp.charAt(i) - '0';
        }

        for(int length = 3; length <= n; length+=2){
            for (int i = 0; i <= n-length; i+=2) {
                int j = i + length -1;
                for(int k = i+1; k < j; k+=2){
                    char op = exp.charAt(k);
                    for (int a :  new int[]{minVal[i][k-1], maxVal[i][k-1]}) {
                        for (int b : new int[] {minVal[k+1][j], maxVal[k+1][j]}) {
                            int value;
                            if(op == '+'){
                                value = a + b;
                            }
                            else if(op == '*'){
                                value = a * b;
                            }
                            else {
                                continue;
                            }
                            minVal[i][j] = Math.min(minVal[i][j], value);
                            maxVal[i][j] = Math.max(maxVal[i][j], value);
                        }
                    }
                }
            }
        }
        return new int[] {minVal[0][n-1], maxVal[0][n-1]};
    }

}
