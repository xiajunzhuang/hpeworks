package com.xiajunzhuang.example;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = scanner.nextInt();
        switch (score/10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
                break;
        }
    }
}