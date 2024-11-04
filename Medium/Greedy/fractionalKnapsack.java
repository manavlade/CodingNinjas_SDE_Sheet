package Medium.Greedy;

import java.util.ArrayList;
import java.util.List;


class Item {
    int value;
    int weight;
    double valuePerWeight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.valuePerWeight = (double) value / weight;
    }
}

public class fractionalKnapsack {
    /*
     * Question
     * Given two arrays value[] and weight[], you need to put these items in a
     * knapsack of capacity w to get the maximum total value in the knapsack. Return
     * a double value representing the maximum value in the knapsack, rounded to 6
     * decimal places.
     * 
     * Note: Unlike 0/1 knapsack, you are allowed to break the item here. The
     * details of structure/class is defined in the comments above the given
     * function.
     * 
     * Examples :
     * 
     * Input: values[] = [60, 100, 120], weights[] = [10, 20, 30], w = 50
     * Output: 240.000000
     * Explanation: Take the item with value 60 and weight 10, value 100 and weight
     * 20 and split the third item with value 120 and weight 30, to fit it into
     * weight 20. so it becomes (120/30)*20=80, so the total value becomes
     * 60+100+80.0=240.0 Thus, total maximum value of item we can have is 240.00
     * from the given capacity of sack.
     */
    double fractionalKnapsack(List<Integer> values, List<Integer> weights, int w) {
        int n = values.size();

        List<Item> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(new Item(values.get(i), weights.get(i)));
        }

        result.sort((a,b)-> Double.compare(b.valuePerWeight, a.valuePerWeight));

        double maxValue = 0.0;

        for (Item item : result) {
            
            if(w == 0) break;

            if(item.weight <= w){
                maxValue += item.value;
                w -= item.weight;
            }

            else {
                maxValue += item.valuePerWeight * w;
                w= 0;
            }
        }

        return Math.round(maxValue * 1e6) / 1e6;

    }
}
