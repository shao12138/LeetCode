package SuanFa_1500;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class RangeSum_1508 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        rangeSum(a, 4, 1, 5);
    }

    public static int rangeSum(int[] nums, int n, int left, int right) {
        List res = new ArrayList<>();
        // 从 1 开始是题目的设定
        Deque<Integer> path = new ArrayDeque<>();
        for (int k = 1; k <= nums.length; k++) {
            dfs(nums, k, 0, path, res);
        }
        return 1;
    }

    public static void dfs(int[] nums, int k, int begin, Deque<Integer> path, List res) {
        // 递归终止条件是：path 的长度等于 k
        if (path.size() == k) {
//            int sum = 0;
//            while (!path.isEmpty()) {
//                sum += path.pop();
//            }
            res.add(new ArrayList<>(path));
            return;
        }
        // 遍历可能的搜索起点
        for (int i = begin; i < nums.length; i++) {
            // 向路径变量里添加一个数
            path.addLast(nums[i]);
            // 下一轮搜索，设置的搜索起点要加 1，因为组合数理不允许出现重复的元素
            dfs(nums, k, i + 1, path, res);
            // 重点理解这里：深度优先遍历有回头的过程，因此递归之前做了什么，递归之后需要做相同操作的逆向操作
           path.removeLast();
        }
    }
}
