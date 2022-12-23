package Offer;

public class MaximalRectangle_40 {
    public int maximalRectangle(char[][] matrix) {
        return 1;
    }

    public int largestRectangleArea(int[] heights) {

        if (heights.length == 1) {
            return heights[0];
        }
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            if (i != 0 && heights[i] == heights[i - 1]) {
                continue;
            }
            int left = i;
            int right = i;
            while (left > 0 && heights[i] <= heights[left - 1]) {
                left--;
            }
            while (right < heights.length - 1 && heights[i] <= heights[right + 1]) {
                right++;
            }
            area = Math.max(area, (right - left + 1) * heights[i]);
        }
        return area;
    }
}
