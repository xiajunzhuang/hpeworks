package com.xiajunzhuang.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 某城市出租车计费问题：
 * 	每日06:00-21:00，起步价6元，当日22:00-次日05:00，起步价7元。
 * 	起步价包含2公里，超出部分按照每公里1.5元收费。
 * 	每次乘车加收1元的燃油附加税。
 * 输入打车的时间和距离，计算本次打车的费用。
 */

public class Demo3 {

    public static long timeToLong(SimpleDateFormat format, String time){

        Date inputTime = new Date();
        long longTime = 0;
        try {
            inputTime = format.parse(time);
            longTime = inputTime.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return longTime;
    }

    public static String getLongTime(SimpleDateFormat format, long longTime){
        Date date = new Date();
        date.setTime(longTime);
        String time = format.format(date);
        return time;
    }

    public static double dayMoney(double km){
        double dayPrice = 0;
        if(km<=2&&km>=0){
            dayPrice = 6 + 1;
        }else if(km>2){
            dayPrice = 6 + 1.5 * (km-2) + 1;
        }else {
            System.out.println("距离输入不正确");
        }
        return dayPrice;
    }

    public static double nightMoney(double km){
        double nightPrice = 0;
        if(km<=2&&km>=0){
            nightPrice = 7 + 1;
        }else if(km>2){
            nightPrice = 7 + 1.5 * (km-2) + 1;
        }else {
            System.out.println("距离输入不正确");
        }
        return nightPrice;
    }

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        final long DAYSTART = timeToLong(format,"06:00");
        final long DAYEND = timeToLong(format,"21:00");
        final long NIGHTSTART = timeToLong(format,"22:00");
        final long NIGHTEND = timeToLong(format,"05:00");
        final long LASTNIGHT = timeToLong(format,"23:59");
        final long STARTNIGHT = timeToLong(format,"00:00");
        System.out.println("请输入时间，例如：08:21");
        Scanner scanner = new Scanner(System.in);
        String time = scanner.next();
        System.out.println("请输入距离");
        double km = scanner.nextDouble();
        double totalMoney = 0;
        long takeTime = timeToLong(format,time);
        //判断如果时间时白天
        if(takeTime>=DAYSTART&&takeTime<DAYEND){
            totalMoney = dayMoney(km);
            System.out.println("乘车距离：" + km + "KM," + "总费用：" + totalMoney + "元");
        }else if((takeTime>=NIGHTSTART&&takeTime<LASTNIGHT)||(takeTime>=STARTNIGHT&&takeTime<NIGHTEND)) {
            totalMoney = nightMoney(km);
            System.out.println("乘车距离：" + km + "KM," + "总费用：" + totalMoney + "元");
        }else {
            System.out.println("不在营运范围");
        }

    }
}
