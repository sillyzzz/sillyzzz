package com.test;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,8,11,19,22,31,35,40,45,48,49,50};
        int target = 40;
        int idx = binarySerch(arr,target);
        System.out.println(idx);
    }

    /**
     * 二分查找
     * @author:曾佳惠
     * @date: 2022-04-18
     * @param: [a, t]
     * @return int
     */
    private static int binarySerch(int[] a, int t) {
        /*1.定义左右边界及中间索引*/
        int l = 0,r=a.length-1,m;
        /*左边界小于右边界*/
        while (l <= r) {
            m = (l+r)/2;
            System.out.println((l+r));
            System.out.println((l+r)/2);
            if(a[m] == t){
                return m;
            }else if(a[m]>t){
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return -1;
    }
}
