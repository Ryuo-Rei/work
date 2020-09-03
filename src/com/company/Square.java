package com.company;

import java.util.Scanner;

// 2020/09/01/ 17:25 ~
public class Square {

    public void CreateSquare() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int length = Integer.parseInt(input);

        for(int i = 1; i <= length; i++) {
            if(i == 1 || i == length) {
                for (int j = 1; j <= length; j++)
                    System.out.print("*");
                System.out.println("");
            }
            else {
                System.out.print("*");
                for(int k = 1; k <= length-2 ; k++)
                    System.out.print(" ");
                System.out.println("*");
            }
        }

    }
}