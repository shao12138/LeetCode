package JinDian;

public class Operations_70 {
    public Operations_70() {

    }

    public int minus(int a, int b) {
        a += (~b + 1); // b的相反数是反码+1
        return a;
    }

    public int multiply(int a, int b) {
        int d = b;
        int e = a;
        // 将a,b都转为负数，防止越界
        if (d > 0)
            b = (~b + 1);
        if (e > 0)
            a = (~a + 1);

        int sum = 0;
        int i = -1;
        while (b < 0) {
            //  取b最右边的1，注意这里取出来的数是正，所以c需要取负数
            int c = b & (~b + 1);
            if (c > 0)
                c = ~c + 1;
            // 这个地方的意思是，多大个a可以作为(b最右边的1 * a)
            while (i > c) {
                i += i;
                a += a;
            }
            // 我们加上这个a，然后去掉b最右边的那个1
            sum += a;
            b &= b + (~1 + 1);
        }
        // 最后判断一下，如果两个数相反则取负数
        if ((d > 0 && e < 0) || (d < 0 && e > 0)) {
            return ~sum + 1;
        }
        return sum;
    }

    public int divide(int a, int b) {
        int left_num = a;
        int right_num = b;
        // 下面全部转为负数，留着a,b是为了最后判断答案的正负数
        if (a > 0)
            left_num = ~left_num + 1;
        if (b > 0) {
            right_num = ~right_num + 1;
        }
        // 初始化result
        int result = 0;
        // 判断条件，每一次循环left_num都要减取(right_num * mul)，直到最后无法再减
        // 之所以是小于等于，因为是负数！
        while (left_num <= right_num) {
            int mul = 1;//乘数因子 重点：我们把除法结果看为一个二进制，不同位上的和，依次算每一位加起来即可！
            // 判断条件，如果right_num * mul * 2超过了left_num，那么可以退出循环，mul是结果的一部分
            while ((long) multiply(right_num, mul) + (long) multiply(right_num, mul) >= (left_num)) {
                // 这个地方如果mul为2的31次方都无法退出循环，意味着除数是1，被除数是2的32次方，直接返回a
                if (mul == 1073741824) {
                    return a;
                }
                // mul不停的迭代
                mul = multiply(mul, 2);
            }
            // 加上一部分结果
            result += mul;
            // left_num需要减掉一部分o.o
            left_num = left_num + (~multiply(right_num, mul) + 1);
        }
        // 判断结果的正负
        if ((a > 0 && b < 0) || (a < 0 && b > 0))
            return ~result + 1;
        return result;
    }
}
