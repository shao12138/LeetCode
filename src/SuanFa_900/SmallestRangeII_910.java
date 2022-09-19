package SuanFa_900;

import java.util.Arrays;

public class SmallestRangeII_910 {
    public int smallestRangeII(int[] A, int K) {
        if(A==null||A.length==0){
            return 0;
        }
        Arrays.sort(A);//排序
        int ans=A[A.length-1]-A[0];
        int min,max;
        for(int i=1;i<A.length;i++){//每次划分将A[i]前面的数全部+K,A[i]后面的数全部-K
            min=Math.min(A[0]+K,A[i]-K);//最小值可能是第一个值+K,也可能是划分后右边第一个数-K
            max=Math.max(A[A.length-1]-K,A[i-1]+K);//最大值同理
            ans=Math.min(ans,max-min);
        }
        return ans;
    }
}
