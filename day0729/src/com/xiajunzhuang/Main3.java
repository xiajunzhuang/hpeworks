package com.xiajunzhuang;

/**
 *  定义两个变量并交换变量的值，打印交换前后的值
 */
public class Main3 {
    public static void main(String[] arg){
        int a = 20,b=100;
        System.out.println("交换前：a=" + a + ";" + "b=" + b + ";" );
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后：a=" + a + ";" + "b=" + b + ";" );
    }
}
