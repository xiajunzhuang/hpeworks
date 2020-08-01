package com.xiajunzhuang.example;

import java.util.Scanner;

public class Demo6 {

    public static void rectangleArea(){
        System.out.println("你选择了矩形");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入矩形的长");
        double length = scanner.nextDouble();
        System.out.println("请输入矩形的宽");
        double width = scanner.nextDouble();
        Double area = length * width;
        System.out.println("矩形的面积为：" + area);
    }

    public static void triangleArea(){
        System.out.println("你选择了三角形");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形的底");
        double length = scanner.nextDouble();
        System.out.println("请输入三角形的高");
        double width = scanner.nextDouble();
        Double area = length * width /2;
        System.out.println("三角形的面积为：" + area);
    }

    public static void circularArea(){
        System.out.println("你选择了圆形");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆形的半径");
        double radius = scanner.nextDouble();
        Double area = 3.14 * radius * radius;
        System.out.println("圆形的面积为：" + area);
    }
    public static void main(String[] args) {
        do {
            System.out.println("计算面积");
            System.out.println("1.矩形\t2.三角形\t3.圆\t4.退出");
            System.out.println("请输入数字选择相应的指令:");
            Scanner scanner = new Scanner(System.in);
            String order = scanner.next();
            if(order.equals("1")){
                rectangleArea();
            }else if(order.equals("2")){
                triangleArea();
            }else if(order.equals("3")){
                circularArea();
            }else if(order.equals("4")){
                System.out.println("系统退出");
                return;
            }else {
                System.out.println("输入指令不存在");
            }
        }while (true);
    }
}
