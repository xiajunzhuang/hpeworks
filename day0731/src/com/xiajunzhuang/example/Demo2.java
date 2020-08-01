package com.xiajunzhuang.example;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int i = 1,sum = 0,age;
        double avg = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第" + + i + "个人的年龄");
            age = scanner.nextInt();
            if(age <0||age>130){
                System.out.println("年龄不能为负数或超过130岁");
                return;
            }else {
                sum += age;
                i++;
                avg = sum/(i-1);

            }

        }while(i<=5);
        System.out.println(i-1+"个人的平均年龄为"+avg+"岁");
    }
}
