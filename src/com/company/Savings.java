package com.company;

import java.util.Scanner;

// 2020/09/07 16:20 ~ 17:10
public class Savings {

    int savings = 0;
    int dayCount = 0;

    public void DoubleSavings() {
        Scanner scan = new Scanner(System.in);
        System.out.print("初期残高：");
        int initialBalance = scan.nextInt();
        int sum = initialBalance + savings;
        if(initialBalance < 100000) {
            savings += 1;
        }

         while(sum < 100000) {
             System.out.println("" + String.format("%,d", dayCount) + "目までの合計金額  本日の貯金額：" + String.format("%,d", savings) + "円 貯金総額：" + String.format("%,d", sum) + "円");

             savings *= 2;
             sum += savings;
             dayCount++;
         }
        System.out.println("" + String.format("%,d", dayCount) + "目までの合計金額  本日の貯金額：" + String.format("%,d", savings) + "円 貯金総額：" + String.format("%,d", sum) + "円");
    }
}
