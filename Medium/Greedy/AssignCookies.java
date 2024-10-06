package Medium.Greedy;

import java.util.Arrays;

public class AssignCookies {
    /*
     * Question
     * Assume you are an awesome parent and want to give your children some cookies.
     * But, you should give each child at most one cookie.
     * 
     * Each child i has a greed factor g[i], which is the minimum size of a cookie
     * that the child will be content with; and each cookie j has a size s[j]. If
     * s[j] >= g[i], we can assign the cookie j to the child i, and the child i will
     * be content. Your goal is to maximize the number of your content children and
     * output the maximum number.
     */

       public int findContentChildren(int[] g, int[] s) {
        int cookie = s.length; 
        if(cookie == 0) return 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int maxNum = 0;
        int cIndex = cookie-1;
        int childIndex = g.length-1;

        while(cIndex >= 0 && childIndex >= 0){
            if(s[cIndex] >= g[childIndex]){
                maxNum++;
                cIndex--;
                childIndex--;
            }
            else {
                childIndex--;
            }
        }
        return maxNum;
    }
}
