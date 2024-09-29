package Medium.Greedy;

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}

public class fractionalKnapsack {
    /*
     * Question
     * Given weights and values of n items, we need to put these items in a knapsack
     * of capacity w to get the maximum total value in the knapsack. Return a double
     * value representing the maximum value in knapsack.
     * Note: Unlike 0/1 knapsack, you are allowed to break the item here. The
     * details of structure/class is defined in the comments above the given
     * function.
     */
    double fractionalKnapsack(int w, Item arr[], int n) {
        double maxValue = 0;

        for(int i = 0; i < n; i++){
            if(maxValue < w){
                
            }
        }
    }
}
