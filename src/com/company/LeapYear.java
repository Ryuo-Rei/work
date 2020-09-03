package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.exit;

// 2020/09/03 09:50 ~

public class LeapYear {

    public void JudgeLeapYear() throws IOException {
        //System.out.println("西暦を入力してください：");
        boolean flag = true;
        //String input = "";

        while (true) {
            if(flag == true) {
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
                flag = false;
                continue;
            }

            flag = true;

            if (Integer.parseInt(input) % 400 == 0) {
                System.out.println("閏年");
            } else if (Integer.parseInt(input) % 100 == 0) {
                System.out.println("平年");
            } else if (Integer.parseInt(input) % 4 == 0) {
                System.out.println("閏年");
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
