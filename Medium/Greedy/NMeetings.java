package Medium.Greedy;

import java.util.Arrays;

public class NMeetings {
    /*
     * Question
     * You are given timings of n meetings in the form of (start[i], end[i]) where
     * start[i] is the start time of meeting i and end[i] is the finish time of
     * meeting i. Return the maximum number of meetings that can be accommodated in
     * a single meeting room, when only one meeting can be held in the meeting room
     * at a particular time.
     * 
     * Note: The start time of one chosen meeting can't be equal to the end time of
     * the other chosen meeting.
     */
    public int maxMeetings(int n, int start[], int end[]) {
        int meetings[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }

        Arrays.sort(meetings, (a, b) -> a[1] - b[1]);

        int lastEndTime = meetings[0][1];
        int numberOfMeetings = 1;

        for (int i = 1; i < n; i++) {
            if (meetings[i][0] > lastEndTime) {
                numberOfMeetings++;
                lastEndTime = meetings[i][1];
            }
        }
        return numberOfMeetings;
    }
}
