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
        if (days > 0) {
            System.out.print("出力：" + days + "日");
            if (hours > 0 && minute > 0) {
                System.out.println(" " + hours + "時間" + minute + "分");
            } else if (hours > 0 && minute == 0) {
                System.out.println(" " + hours + "時間");
            } else if (hours == 0 && minute > 0) {
                System.out.println(" " + minute + "分");
            }
        } else {
            if (hours > 0 && minute > 0) {
                System.out.println("出力：" + hours + "時間" + minute + "分");
            } else if (hours > 0 && minute == 0) {
                System.out.println("出力：" + hours + "時間");
            } else if (hours == 0 && minute > 0) {
                System.out.println("出力：" + minute + "分");
            } else {
                System.out.println("出力：" + minute + "分");
            }
        }
    }

}
