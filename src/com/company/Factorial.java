package com.company;

import java.util.Scanner;

import static java.lang.System.exit;

// 2020/09/03/ 15:50 ~ 16:43
public class Factorial {

    public void CalculateFactorial() {
        boolean isError = true;
        // long factorial = 1;

        while(true) {
            if(isError = true) {
                System.out.println("数値を入力してください：");
            }
            if(isError = false) {
                System.out.println("数値(0 ~ 99)で入力してください。");
            }

            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("end")) {
                exit(0);
            }

            if (isNumber(input) == false) {
                isError = false;
                continue;
            }
            isError = true;

            long factorial = 1;

            for(int i = 2; i <= Integer.parseInt(input); i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }

    private boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
