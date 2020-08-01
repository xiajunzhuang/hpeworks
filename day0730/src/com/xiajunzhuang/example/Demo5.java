package com.xiajunzhuang.example;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个数字");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num1<num2){
            if(num3<num1){
                System.out.println("从小到大的顺序为:"+ num3 + " " + num1 + " " + num2);
            }else if(num3>num2) {
                System.out.println("从小到大的顺序为:"+ num1 + " " + num2 + " " + num3);
            }else {
                System.out.println("从小到大的顺序为:"+ num1 + " " + num3 + " " + num2);
            }

        }else {
            if(num3<num2){
                System.out.println("从小到大的顺序为:"+ num3 + " " + num2 + " " + num1);
            }else if(num3>num1){
                System.out.println("从小到大的顺序为:"+ num2 + " " + num1 + " " + num3);
            }else {
                System.out.println("从小到大的顺序为:"+ num2 + " " + num3 + " " + num1);
            }
        }
    }
}
