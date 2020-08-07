package com.xiajunzhuang.example06;

import java.util.Scanner;

public class Main {
    private static String[] orders = {"退出","添加","删除","修改","查询所有","根据用户名查询"};

    public static void showTitle(){
        System.out.println("---------------电话本管理系统----------------");
        for(int i = 0; i< orders.length;i++){
            System.out.print(i + "." + orders[i] + "\t");
        }
        System.out.println("\n---------------电话本管理系统----------------");
        System.out.println("请输入操作指令");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        do {
            showTitle();
            int order = scanner.nextInt();
            switch (order){
                case 0:
                    System.out.println("----------" + orders[0] + "----------");

                    return;
                case 1:
                    System.out.println("----------" + orders[1] + "----------");
                    phoneBook.addPhone();
                    break;
                case 2:
                    System.out.println("----------" + orders[2] + "----------");
                    phoneBook.deletePhone();
                    break;
                case 3:
                    int index = phoneBook.selectByName();
                    phoneBook.updatePhone(index);
                    System.out.println("----------" + orders[3] + "----------");
                    break;
                case 4:
                    System.out.println("----------" + orders[4] + "----------");
                    phoneBook.selectAll();
                    break;
                case 5:
                    System.out.println("----------" + orders[5] + "----------");
                    phoneBook.selectByName();
                    break;
                default:
                    System.out.println("指令不正确");
                    break;
            }

        }while (true);

    }
}
