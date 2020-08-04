package com.xiajunzhuang.example;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] a ={4,2,0,-1,-8,23,9};
        int max = 0,min = 100, sum = 0;
        double avg = 0;
        for(int i = 0 ; i < a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
            sum += a[i];
        }
        avg = sum / (a.length);

        for (int i = 0; i<a.length/2;i++){
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
        System.out.println("数组中的最大值为：" + max);
        System.out.println("数组中的最小值为：" + min);
        System.out.println("数组中的平均值为：" + avg);
        System.out.println("数组中数据的和为：" + sum);
        System.out.print("数组反转后为：");

        for (int v : a) {
            System.out.print(v + ",");
        }

    }
}
