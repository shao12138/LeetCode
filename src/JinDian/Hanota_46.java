package JinDian;

import java.util.List;

public class Hanota_46 {
    public void move(List<Integer> x, int n, List<Integer> z) {
        int index = x.size() - 1;
        z.add(x.get(index));
        x.remove(x.size() - 1);
        System.out.println(n + "号圆盘，" + x + "->" + z);
    }

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        hanoi(A.size(), A, B, C);
    }

    public void hanoi(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n == 1) {
            move(A, 1, C); // 将编号为1的圆盘从x移到z
        } else {
            hanoi(n - 1, A, C, B);// 将x上编号为1至n-1的圆盘移到y，z作辅助塔
            move(A, n, C);// 将编号为n的圆盘从x移到z
            hanoi(n - 1, B, A, C);// 将y上编号为1至n-1的圆盘移到z，x作辅助塔
        }
    }
}
