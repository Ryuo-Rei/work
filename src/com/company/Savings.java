package com.company;

import java.util.Scanner;

// 2020/09/07 16:20 ~ 17:10
public class Savings {

    int savings = 1;
    int dayCount = 1;

    public void DoubleSavings() {
        Scanner scan = new Scanner(System.in);
        System.out.print("初期残高：");
        int initialBalance = scan.nextInt();
        int sum = initialBalance + savings;

         do  {
            System.out.println("" + String.format("%,d", dayCount) + "目までの合計金額：" + String.format("%,d", sum - savings) + " 本日の貯金額：" + String.format("%,d", savings) + "円 貯金総額：" + String.format("%,d", sum) + "円");

            savings *= 2;
            sum += savings;
            dayCount++;
        } while(sum < 100000);
        System.out.println("" + String.format("%,d", dayCount) + "目までの合計金額：" + String.format("%,d", sum - savings) + " 本日の貯金額：" + String.format("%,d", savings) + "円 貯金総額：" + String.format("%,d", sum) + "円");
    }
}
