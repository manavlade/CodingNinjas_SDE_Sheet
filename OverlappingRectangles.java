public class OverlappingRectangles {
    /*
     * Question
     * Given two rectangles, find if the given two rectangles overlap or not. A
     * rectangle is denoted by providing the x and y coordinates of two points: the
     * left top corner and the right bottom corner of the rectangle. Two rectangles
     * sharing a side are considered overlapping. (L1 and R1 are the extreme points
     * of the first rectangle and L2 and R2 are the extreme points of the second
     * rectangle).
     * 
     * Note: It may be assumed that the rectangles are parallel to the coordinate
     * axis
     * Input:
     * L1=(0,10)
     * R1=(10,0)
     * L2=(5,5)
     * R2=(15,0)
     * Output:
     * 1
     * Explanation:
     * The rectangles overlap.
     */
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        if (L1[0] > R2[0] || L2[0] > R1[0]) {
            return 0;
        }

        if (R1[1] > L2[1] || R2[1] > L1[1]) {
            return 0;
        }
        return 1;
    }
}
