package JinDian;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class FindWhetherExistsPath_24 {
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        Set<Integer>[] adjacentArr = new Set[n];
        for (int i = 0; i < n; i++) {
            adjacentArr[i] = new HashSet<Integer>();
        }
        for (int[] edge : graph) {
            if (edge[0] != edge[1]) {
                adjacentArr[edge[0]].add(edge[1]);
            }
        }
        boolean[] visited = new boolean[n];
        visited[start] = true;
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.offer(start);
        while (!queue.isEmpty() && !visited[target]) {
            int vertex = queue.poll();
            Set<Integer> adjacent = adjacentArr[vertex];
            for (int next : adjacent) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
        return visited[target];
    }
}
