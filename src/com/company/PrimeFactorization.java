package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {

    private int input;
    StringBuilder sb = new StringBuilder();

    public void Execute() {

        boolean hasError = true;

        while (true) {
            if (hasError) {
                System.out.println("数字を入力してください(2~9999)");
            } else {
                System.out.println("入力値は2 ~ 9999で入力してください。");
            }

            Scanner scan = new Scanner(System.in);
            input = scan.nextInt();

            if (input < 2 || 9999 < input) {
                hasError = false;
                continue;
            }

            break;
        }

        sb.append(input + " = ");

        List<Integer> numberArray = GetPrimeNumber(input);

        ShowResult(numberArray);
    }

    private List<Integer> GetPrimeNumber(int input) {
        List<Integer> numberArray = new ArrayList<Integer>();
        for(int i = 2; i <= input / 2; i++) {
            boolean isPrime = true;

            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                numberArray.add(i);
            }

        }
        System.out.println("" + input + "の素数は、" + numberArray.toString() + "です。");
        return numberArray;
    }

    private void ShowResult(List<Integer> numberArray) {
        int count = 0;
        int numberCount = 0;
        int num = 0;

        for(int i = 0; i < numberArray.size(); i++) {
            num = numberArray.get(i);
            if(input % num == 0) {
                count = 0;

                do {
                    count++;

                    input /= num;
                } while(input % num == 0);
                if(numberCount == 0) {
                    sb.append(num + "^" + count);
                }
                else {
                    sb.append("*" + num + "^" + count);
                }
                numberCount++;
            }
        }

        System.out.println(sb);
    }
}