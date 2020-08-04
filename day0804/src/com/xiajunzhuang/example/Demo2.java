package com.xiajunzhuang.example;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[10];
        System.out.println("请输入10个整型数字");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0],min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("数组中的最大值为：" + max);
        System.out.println("数组中的最小值为：" + min);
    }
}
