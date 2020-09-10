package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 2020/09/09 10:35 ~
public class PrimeNumber {

    int input = 0;
    int input2 = 0;

    public void Execute() {
        boolean hasError = true;

        while (true) {
            if (hasError) {
                System.out.println("数字を入力してください(2~9999)");
            } else {
                System.out.println("入力値は2 ~ 9999で入力してください。");
            }

            Scanner scan = new Scanner(System.in);
            System.out.println("入力値1：");
            input = scan.nextInt();
            System.out.println("入力値2：");
            input2 = scan.nextInt();

            if ((input < 1 || 9999 < input) && (input2 < 1 || 9999 < input2)) {
                hasError = false;
                continue;
            }

            break;
        }
        ComparisonNumber();

        GetPrimeNumber(input, input2);
    }

    public void ComparisonNumber() {
        if(Math.max(input, input2) == input) {
            int num = input;
            input = input2;
            input2 = num;
        }
    }

    private void GetPrimeNumber(int input, int input2) {
        List<Integer> numberArray = new ArrayList<Integer>();
        for (int i = input; i <= input2; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                numberArray.add(i);
            }

        }
        System.out.println("" + input + "以上で" + input2 + "以下の素数は、" + numberArray.toString() + "です。");
    }
}
