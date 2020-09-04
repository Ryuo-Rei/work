package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

// 2020/09/04 10:10 ~
public class Values {

    final static String FILE_PATH = "C:\\Users\\ryuorei\\Desktop\\Git\\work\\minmaxave.csv";

    public void Excute() {
        try {
            File file = new File(FILE_PATH);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String text = br.readLine();

            // List<String> numberArray = new ArrayList<String>();
            // numberArray.set(0, text);
            int num = Integer.parseInt(text);
            int maxValue = num;
            int minValue = num;
            int sum = 0;
            int index = 0;

            for(int i = 0; i < 99; i++) {
                text = br.readLine();
                num = Integer.parseInt(text);

                if(maxValue < num) {
                    maxValue = num;
                }

                if(num < minValue) {
                    minValue = num;
                }

                sum += num;
                index++;
            }
            int averageValue = sum/index;

            System.out.println("最大値：" + maxValue);
            System.out.println("最小値：" + minValue);
            System.out.println("平均値：" + averageValue);

        }
        catch(Exception e) {

        }
    }
}
