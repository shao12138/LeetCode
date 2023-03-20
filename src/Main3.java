import java.util.*;


public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(subsets(nums).size());
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        for (int k = 2; k <= nums.length; k++) {
            dfs(nums, k, 0, path, res);
        }
        return res;
    }

    public static void dfs(int[] nums, int k, int begin, Deque<Integer> path, List<List<Integer>> res) {
        if (path.size() == k) {
            ArrayList<Integer> t = new ArrayList(path);
            if (t.get(1) % t.get(0) == 0) {
                int r = t.get(1) / t.get(0);
                for (int i = 2; i < t.size(); i++) {
                    if (t.get(i) % t.get(i - 1) != 0) {
                        return;
                    }
                    if (t.get(i) / t.get(i - 1) != r) {
                        return;
                    }
                }
                res.add(new ArrayList<>(path));
                return;
            }
            return;
        }
        for (int i = begin; i < nums.length; i++) {
            path.addLast(nums[i]);
            dfs(nums, k, i + 1, path, res);
            path.removeLast();
        }
    }
}
