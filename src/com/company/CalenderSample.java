package com.company;

import java.util.Scanner;
import java.util.Calendar;

// 2020/09/03 16:50 ~ 2020/09/04 10:00
public class CalenderSample {

    public void CreateCalender() {
        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        System.out.print("年を入力してください：");
        String year = scan.nextLine();
        System.out.print("月を入力してください：");
        String month = scan.nextLine();


        try {
            cal.set(Integer.parseInt(year), Integer.parseInt(month) -1, 1);
            int weekIndex = cal.get(Calendar.DAY_OF_WEEK);
            int monthEndDay = cal.getActualMaximum(Calendar.DATE);

            System.out.println("SUN MON TUE WED THU FRI SAT");

            for (int i = 1; i < weekIndex; i++) {
                System.out.print("    ");
            }

            for (int day = 1; day <= monthEndDay; day++) {
                System.out.printf("%3d ", day);

                if((day + weekIndex - 1) % 7 == 0) {
                    System.out.println();
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
