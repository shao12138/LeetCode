package SuanFa_1;

import java.util.*;
import java.util.stream.Collectors;

public class SubSetsWithDup_90 {
    public static void main(String[] args) {
        int num[] = new int[]{4, 4, 4, 1, 4};
        subsetsWithDup(num);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // 从 1 开始是题目的设定
        Deque<Integer> path = new ArrayDeque<>();
        for (int k = 0; k <= nums.length; k++) {
            dfs(nums, k, 0, path, res);
        }
        List<List<Integer>> listWithoutDuplicates = res.stream().distinct().collect(Collectors.toList());
        return listWithoutDuplicates;
    }

    public static void dfs(int[] nums, int k, int begin, Deque<Integer> path, List<List<Integer>> res) {
        // 递归终止条件是：path 的长度等于 k
        if (path.size() == k) {
            List a = new ArrayList<>(path);
            Collections.sort(a);
            res.add(a);
        }
        if (path.size() == nums.length) {
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

