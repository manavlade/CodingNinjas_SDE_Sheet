package Easy.Arrays;

import java.util.Arrays;

public class AssignCookies {
    /*
     * Question
     * There are ‘N’ children and ‘M’ cookies.
     *  You are given two arrays, ‘SIZE’, and ‘GREED’, where ‘GREED[i]’ is the greed
     * of ‘ith’ children and ‘SIZE[j]’ is the size of the ‘jth’ cookie.
     * You must assign ‘jth’ cookie to ‘ith’ child such that the greed of maximum
     * children is satisfied. A child's greed is satisfied if the size of the cookie
     * assigned to him is greater than or equal to his greed.
     * You must return the maximum number of children whose greed can be satisfied.
     */
      public static int assignCookie(int []greed, int []size) {
        Arrays.sort(greed);
        Arrays.sort(size);
        int count = 0;
        int i = 0;
        int j = 0;

        while(i < greed.length && j < size.length){
            if( size[j] >= greed[i] ){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
