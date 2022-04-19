package com.algorithm;
/*
* 前提：
* 1.有已排序数组A(假设已经做好)
* 2.定义左边界L、右边界R，确定搜索范围，循环执行二分查找（3、4两步）
* 3.获取中间索引的值A[M]=Floor((L+R)/2)
* 4.中间索引值A[M]与待搜索的值T进行比较
* a.A[M]=T表示找到，返回中间索引
* b.A[M]>T,中间值右侧的其它元素都大于T，无需比较，中间索引左边去找，M-1设置为右边界，重新查找
* c.A[M]>T,中间值左侧的其它元素都小于T，无需比较，中间索引右边去找，M-1设置为右边界，重新查找
* 5.当L>R时，表示没有找到，应结束循环*/
public class BinarySearch {
    /*奇数二分取中间
    * 偶数二分取中间靠左*/
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
//            m = (l+r)/2;
            /*右移算法*/
            m = (l+r) >>> 1;
            System.out.println((l+r)/2);
            System.out.println((l+r) >>> 1);
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
