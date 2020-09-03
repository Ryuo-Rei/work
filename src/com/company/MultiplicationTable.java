package com.company;

// 2020/09/01 10:30 ~　10:42
public class MultiplicationTable {

    public void CreateMultiplicationTable() {

        int[][] numberArray = new int[9][9];
        System.out.println("   1  2  3  4  5  6  7  8  9");
        // 99を表示するための2重ループ
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= 9; j++) {
                int sum = i * j;
                if (j == 9) {
                    if (sum < 10) {
                        System.out.println(" " + sum);
                    } else {
                        System.out.println(sum);
                    }
                } else {
                    if (sum < 10) {
                        System.out.print(" " + sum + " ");
                    } else {
                        System.out.print(sum + " ");
                    }
                }
            }
        }
    }

}
