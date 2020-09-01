package com.company;

public class FizzBuzz {

    // 2020/09/01 9:58 ~ 10:07
    public void ShowNumbers() {

        // 1 ~ 40までの数字を表示し、
        //  3,5,15で割り切れる場合は、FizzBuzzと表示する。
        for (int number = 1; number <= 40; number++) {

            if (number % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (number % 5 == 0) {
                System.out.print("Buzz ");
            } else if (number % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(number + " ");
            }
        }
        // write your code here
    }
}
