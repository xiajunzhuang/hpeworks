package com.xiajunzhuang;

/**
 * 计算208653秒对应的天数、小时数、分钟数、秒数
 */
public class Main5 {
    public static void main(String[] arg){
        //定义1分钟对应秒数的常量
        final int ANMINUTE = 60;
        //定义1小时对应秒数的常量
        final int ANHOUR = 60 * 60;
        //定义1天对应秒数的常量
        final int ANDAY = 60 * 60 * 24;
        //总秒数
        int totalTime = 208653;
        //计算天数：总秒数对一天对应秒数整除
        int day = totalTime / (60 * 60 * 24);
        //计算小时数：（总秒数-天数*一天对应秒数整除）/ 1小时对应秒数
        int hour = (totalTime - day * ANDAY) / ANHOUR;
        //计算分钟数：.....
        int minute = (totalTime - day * ANDAY - hour * ANHOUR) / ANMINUTE;
        //计算秒数：总秒数对分钟取余
        int second = totalTime % ANMINUTE;
        //打印结果
        System.out.println("208653秒为" + day + "天，" + hour + "小时，" + minute + "分钟，" + second + "秒");
    }
}
