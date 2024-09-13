package Medium.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class mergeIntervals {
    /*
     * Question
     * You are given N number of intervals, where each interval contains two
     * integers denoting the start time and the end time for the interval.
     * The task is to merge all the overlapping intervals and return the list of
     * merged intervals sorted by increasing order of their start time.
     * Two intervals [A,B] and [C,D] are said to be overlapping with each other if
     * there is at least one integer that is covered by both of them.
     * For example:
     * For the given 5 intervals - [1, 4], [3, 5], [6, 8], [10, 12], [8, 9].
     * Since intervals [1, 4] and [3, 5] overlap with each other, we will merge them
     * into a single interval as [1, 5].
     * Similarly, [6, 8] and [8, 9] overlap, merge them into [6,9].
     * Interval [10, 12] does not overlap with any interval.
     * Final List after merging overlapping intervals: [1, 5], [6, 9], [10, 12].
     *
     * DRY RUN 
     * teration and Merging
     * Initial State:
     * currentInterval = [1, 3]
     * merged = []
     * Iteration 1 (i = 1):
     * 
     * nextInterval = [3, 5]
     * Check Overlap: currentInterval.end (3) >= nextInterval.start (3) → They
     * overlap.
     * Merge: Set currentInterval.end = max(3, 5) = 5.
     * New currentInterval: [1, 5]
     * Iteration 2 (i = 2):
     * 
     * nextInterval = [6, 8]
     * Check Overlap: currentInterval.end (5) < nextInterval.start (6) → No overlap.
     * Action: Add currentInterval = [1, 5] to merged.
     * Update: Set currentInterval = [6, 8].
     * merged = [[1, 5]]
     * Iteration 3 (i = 3):
     * 
     * nextInterval = [8, 9]
     * Check Overlap: currentInterval.end (8) >= nextInterval.start (8) → They
     * overlap.
     * Merge: Set currentInterval.end = max(8, 9) = 9.
     * New currentInterval: [6, 9]
     * Iteration 4 (i = 4):
     * 
     * nextInterval = [10, 12]
     * Check Overlap: currentInterval.end (9) < nextInterval.start (10) → No
     * overlap.
     * Action: Add currentInterval = [6, 9] to merged.
     * Update: Set currentInterval = [10, 12].
     * merged = [[1, 5], [6, 9]]
     * After Iteration Ends:
     * 
     * Add the final currentInterval = [10, 12] to merged.
     * merged = [[1, 5], [6, 9], [10, 12]]
     */
    public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval l1, Interval l2) {
                return Integer.compare(l1.start, l2.start);
            }
        });

        ArrayList<Interval> merged = new ArrayList<>();

        Interval currentInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval nextInterval = intervals.get(i);

            if (currentInterval.end >= nextInterval.start) {
                currentInterval.end = Math.max(currentInterval.end, nextInterval.end);
            } else {
                merged.add(currentInterval);

                currentInterval = nextInterval;
            }
        }
        merged.add(currentInterval);
        return merged;

    }

}
