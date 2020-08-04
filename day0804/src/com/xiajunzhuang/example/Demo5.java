package com.xiajunzhuang.example;

public class Demo5 {
    public static void main(String[] args) {
        int[][] arr = { {11,12,13,14}, {21,22,23,24}, {31,32,33,34} };
        System.out.println("遍历结果为：");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ",");
            }
        }
    }
}
