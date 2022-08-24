package SuanFa_800;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CanVisitAllRooms_841 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        ArrayList b = new ArrayList();
        b.add(2);
        ArrayList c = new ArrayList();
        c.add(3);
        ArrayList d = new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        canVisitAllRooms(arrayList);
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<List> queue = new LinkedList();
        boolean[] visited = new boolean[rooms.size()];
        queue.add(rooms.get(0));
        while (!queue.isEmpty()) {
            ArrayList<Integer> temp = (ArrayList) queue.poll();
            for (int i = 0; i < temp.size(); i++) {
                if (!visited[temp.get(i)]) {
                    queue.add(rooms.get(temp.get(i)));
                    visited[temp.get(i)]=true;
                }
            }
        }
        for (int i = 1; i < visited.length; i++) {
            if (visited[i] == false) {
                return false;
            }
        }
        return true;
    }
}
