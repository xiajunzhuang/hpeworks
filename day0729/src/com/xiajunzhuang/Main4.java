package com.xiajunzhuang;

/**
 * 从控制台中输入圆的半径，计算对应圆的面积并打印
 */

import java.util.Scanner;

public class Main4 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("半径为" + radius + "的圆的面积为：" + area);
    }
}
