package Easy.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        for (int i = 0; i < numRows-1; i++) {
            List<Integer> list = new ArrayList<>();

            list.add(0);
            list.addAll(result.get(result.size() -1));
            list.add(0);

            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < list.size()-1; j++) {
                row.add(list.get(j) + list.get(j+1));
            }

            result.add(row);
        }
        return result;
    }
}
