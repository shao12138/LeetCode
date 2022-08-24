package SuanFa_other;

import java.util.ArrayList;
import java.util.List;

public class FindSmallestSetOfVertices_1557 {
    public static void main(String[] args) {

    }
    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        ArrayList result = new ArrayList();
        ArrayList result2 = new ArrayList();
        for (int i = 0; i < edges.size(); i++) {
            int out = edges.get(i).get(0);
            if (!result.contains(out)) {
                result.add(out);
            }
        }
        for (int i = 0; i < n; i++) {
            if (!result.contains(i)) {
                result2.add(i);
            }
        }
        return result2;
    }
}
