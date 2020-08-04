package com.xiajunzhuang.example;

public class Demo4 {
    public static void main(String[] args) {
        int [] numbers = {10,9,1,0,3,100,60};
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length - i - 1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.print("从小到大顺序为：");
        for (int a : numbers) {
            System.out.print(a + ",");
        }
    }
}
