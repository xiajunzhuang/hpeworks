package com.xiajunzhuang.example;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] arg){
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        double first = scanner.nextDouble();
        System.out.println("请输入运算符");
        String operator = scanner.next();
        System.out.println("请输入第一个数");
        double second = scanner.nextDouble();
        if(operator.equals("+")){
            result = first + second;
            System.out.println(first + operator + second + "=" + result);
        }else if(operator.equals("-")){
            result = first - second;
            System.out.println(first + operator + second + "=" + result);
        }else if(operator.equals("*")){
            result = first * second;
            System.out.println(first + operator + second + "=" + result);
        }else if(operator.equals("/")){
            result = first / second;
            System.out.println(first + operator + second + "=" + result);
        }else {
            System.out.println("操作符只能未+、-、*、/、");
        }
    }
}
