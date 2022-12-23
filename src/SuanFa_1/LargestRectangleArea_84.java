package SuanFa_1;

public class LargestRectangleArea_84 {
    public static void main(String[] args) {
        int[] heights = new int[]{9, 8, 4, 9, 2, 6, 9, 0, 5, 4, 9, 5, 3, 8, 2, 9};
        largestRectangleArea(heights);
    }

    public static int largestRectangleArea(int[] heights) {
        if (heights.length == 1) {
            return heights[0];
        }
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            if (i != 0 & heights[i] == heights[i - 1]) {
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
