package Medium.Reccursion;

import java.util.ArrayList;

public class subsetSum {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        reccursion(0, 0, arr, ans);

        return ans;

    }

    private static void reccursion(int index, int currentSum, ArrayList<Integer> arr, ArrayList<Integer> ans) {
        if(index ==  arr.size()){
            ans.add(currentSum);
            return;
        }

        reccursion(index + 1, currentSum + arr.get(index), arr, ans);

        reccursion(index + 1, currentSum, arr, ans);
    }
    
}
