package com.xiajunzhuang;

/**
 * 从控制台中输入姓名、性别、年龄、专业并输出
 */

import java.util.Scanner;

public class Main2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入性别");
        String gender = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入专业");
        String major = sc.next();
        System.out.println("姓名：" + name + " 性别：" + gender + " 年龄：" + age + " 专业：" + major);

    }
}
