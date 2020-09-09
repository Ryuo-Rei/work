package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.exit;

// 2020/09/03 09:50 ~

public class LeapYear {

    public void JudgeLeapYear() throws IOException {
        boolean isNumber = true;

        while (true) {
            if(isNumber == true) {
                System.out.println("西暦を入力してください：");
            }
            else {
                System.out.println("西暦は数値(0 ~ 9999)で入力してください。");
            }

            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("end")) {
                exit(0);
            }

            if (isNumber(input) == false || (Integer.parseInt(input) < 0 || 9999 < Integer.parseInt(input))) {
                isNumber = false;
                continue;
            }

            isNumber = true;

            int num = Integer.parseInt(input);
            if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
                System.out.println("閏年");
            }
            else {
                System.out.println("平年");
            }
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
