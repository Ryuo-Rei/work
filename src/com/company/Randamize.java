package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// 2020/09/04 14:20 ~
public class Randamize {

    public List<Integer> getTwoValues() {
        boolean isError = true;
        List<Integer> values = new ArrayList<Integer>();

        while (isError == true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("値1：");
                int number1 = scan.nextInt();
                System.out.println("値2：");
                int number2 = scan.nextInt();

                if ((number1 < 2 || 9999 < number1) || (number2 < 2 || 9999 < number2)) {
                    System.out.println("値は2 ~ 9999の整数で入力してください。");
                    isError = false;
                    continue;
                }

                values.add(number1);
                values.add(number2);

                return values;

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return values;
    }

    public List<Integer> OutputRandamNumber(int number1 , int number2) {
        Random rnd = new Random();
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            int value = rnd.nextInt(Math.abs(number1 - number2) + 1) + number1;
            numbers.add(value);
        }
        return numbers;
    }

    public void ShowRandamNumbers() {
        List<Integer> values = new ArrayList<Integer>();
        values = getTwoValues();
        int number1 = values.get(0);
        int number2 = values.get(1);
        List<Integer> numbers = OutputRandamNumber(number1, number2);

        for(int i = 0; i < 100; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
