package com.xiajunzhuang.example;

import java.util.Scanner;

public class Demo5 {

    public static void adminLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();
        if(username.equals("admin")&&password.equals("1111")){
            System.out.println("登录成功");
            return;
        }else {
            System.out.println("用户名或密码不正确，请重新输入");
        }
    }
    public static void main(String[] args) {
        String order = null;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("******************");
            System.out.println("1.管理员\t2.顾客\t3.退出");
            order = scanner.next();
            if(order.equals("1")){
                System.out.println("管理员登录");
                adminLogin();
            }else if(order.equals("2")){
                System.out.println("顾客登录");
            }else if(order.equals("3")){
                System.out.println("系统退出");
                return;
            }else {
                System.out.println("命令错误");
                return;
            }
        }while(true);
    }
}
