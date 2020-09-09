package com.company;

import java.util.Scanner;

// 2020/09/04 11:30 ~14:15
public class MinutesToTimeAndDay {

    public void ConvertMinute() {
        try {
            Scanner scan = new Scanner(System.in);
            long minutes = scan.nextLong();

            while (minutes < 0 || 100000 <= minutes) {
                System.out.println("値は0 ~ 99999の整数で入力してください。");
                continue;
            }

            CalcurateTimes(minutes);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CalcurateTimes(long minutes) {
        long minute = minutes;
        long days = Long.parseLong(String.format("%.0f", Math.floor(minutes / 1440)));
        minute -= (days * 1440);
        long hours = Long.parseLong(String.format("%.0f", Math.floor(minute / 60)));
        minute -= (hours * 60);

        System.out.println("入力値 " + minutes);
        String outputResult = "出力：";
        if (days > 0) {
            outputResult += days + "日";
        }

        if (hours > 0){
            outputResult += hours + "時間";
        }

        if(((days > 0 || hours > 0) && minute > 0)
        || (days == 0 && hours == 0)) {
            outputResult += minute + "分";
        }

        System.out.println(outputResult);
    }

}
