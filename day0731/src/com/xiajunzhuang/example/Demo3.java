package com.xiajunzhuang.example;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        String username,password;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名");
            username = scanner.next();
            System.out.println("请输入密码");
            password = scanner.next();
            if(username.equals("admin")&&password.equals("1111")){
                System.out.println("登录成功");
                return;
            }else {
                System.out.println("用户名或密码不正确，请重新输入");

            }
        }while (!username.equals("admin")||!password.equals("111"));
    }
}
