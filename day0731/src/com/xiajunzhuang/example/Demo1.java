package com.xiajunzhuang.example;

public class Demo1 {
    public static void main(String[] args) {
        int h = 6;

        for (int i = 1; i <= h; i++) {
            for (int g = 0; g <= h-i; g++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((i * 2) -1); j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
