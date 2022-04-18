package com.test;

import java.util.Arrays;

/*文字描述：
1.依次比较数组中相邻两个元素大小，若a[j]>a[j+1],则交换两个元素，两两都比较一遍称为一轮冒泡，结果是让最大的元素排至最后
* 2.重复以上步骤，直到整个数组有序
优化方式：
每轮冒泡时，最后一次交换索引可以作为下一轮冒泡的比较次数，如果这个值为0，表示整个数组有序，直接退出外层循环即可

*/

public class BubbleSort {
    public static void main(String[] args) {
//        int [] a ={5,9,7,4,1,3,2,8};
        int [] a ={1,2,3,4,5,6,7,9};
//        int [] a ={5,2,7,4,1,3,8,9};
//        bubble(a);
        bubble_v2(a);
    }

    private static void bubble_v2(int[] a) {
        int n = a.length-1;
        while (true) {
            //表示最后一次交换索引位置
            int last = 0;
            for (int i = 0; i <n; i++) {
                System.out.println("比较次数" + i);
                if (a[i] > a[i+1]) {
                    swap(a,i,i+1);
                    last = i;
                }
            }
            n = last;
            System.out.println("第"+"轮冒泡"+ Arrays.toString(a));
            if (n==0) {
                break;
            }
        }

    }


    private static void bubble(int[] a) {
        for (int j = 0; j <a.length-1 ; j++) {
            //一轮冒泡
            //是否发生了交换
            boolean swapped = false;
            for (int i = 0; i < a.length-1-j; i++) {
                System.out.println("比较次数" + i);
                if (a[i] > a[i+1]) {
                    swap(a,i,i+1);
                    swapped = true;
                }
            }
            System.out.println("第"+j+"轮冒泡"+ Arrays.toString(a));
            if (!swapped){
                break;
            }
        }


    }

    public static void swap (int[] a,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
