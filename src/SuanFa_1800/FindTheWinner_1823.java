package SuanFa_1800;

import java.util.LinkedList;

public class FindTheWinner_1823 {
    public static void main(String[] args) {
        findTheWinner(5,5);
    }

    public static int findTheWinner(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {        //给顺序表赋值，A,B,C,D,E
            list.add(i+1);
        }
        int i = 0;
        while (list.size() > 1) {        //开始执行循环，直到剩余一个人
            i = (i + k - 1) % (list.size());    //从start开始，每次增加距离distance
            list.remove(i);            //移除执行处决的人
        }
        return list.get(0);
    }
}
