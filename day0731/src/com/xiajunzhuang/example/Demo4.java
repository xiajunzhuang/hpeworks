package com.xiajunzhuang.example;

public class Demo4 {
    public static void main(String[] args) {
        for(int i = 1900;i<=2050;i++){
            if(i % 4 == 0 && i % 100 != 0){
                System.out.println(i + "是闰年");
            }else if(i % 400 == 0){
                System.out.println(i + "是闰年");
            }
        }
    }
}
