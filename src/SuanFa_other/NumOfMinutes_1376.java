package SuanFa_other;

import java.util.*;

public class NumOfMinutes_1376 {
    int max = 0;

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        // 建图部分代码
        // 题中给的条件是树，但是树也是一种特殊的图，直接建图也没毛病
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int from = manager[i];
            int to = i;
            if (from == -1) continue;
            graph[from].add(to);
        }
        // dfs部分代码
        dfs(graph, informTime, headID, 0);
        return max;
    }

    // graph：所建的图
    // informTime：传播消息时间
    // cur：当前节点
    // sum：消息传播到自己已经花了多久时间
    public void dfs(List<Integer>[] graph, int[] informTime, int cur, int sum) {
        // 取决于最久的传播时间
        max = Math.max(max, sum);
        // 遍历当前节点的每一个邻居
        for (int neb : graph[cur]) {
            // 递归计算到邻居的邻居的时间
            dfs(graph, informTime, neb, sum + informTime[cur]);
        }
    }
}
