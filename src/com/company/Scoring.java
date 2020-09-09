package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

// 2020/09/03 13:55 ~
public class Scoring {

    final static String FILE_PATH = "C:\\Users\\ryuorei\\Desktop\\Git\\work\\Scoring用テキストファイル.csv";

    public void Aggregate() {
        try {
            File file = new File(FILE_PATH);
            BufferedReader br = new BufferedReader(new FileReader(file));

            int repairCount = 0;
            int additionalAssignmentCountCount = 0;
            int yesCount = 0;
            int goodCount = 0;
            int superiorityCount = 0;
            int i = 0;
            String text = br.readLine();

            List<String> numberArray = new ArrayList<String>();
            while(text != null){
                numberArray.add(text);
                int num = Integer.parseInt(numberArray.get(i));

                if(0 <= num && num <= 20 ) {
                    repairCount++;
                }
                else if(21 <= num && num <= 45) {
                    additionalAssignmentCountCount++;
                }
                else if(46 <= num && num <= 59) {
                    yesCount++;
                }
                else if(60 <= num && num <= 79) {
                    goodCount++;
                }
                else if(80 <= num && num <= 99) {
                    superiorityCount++;
                }
                text = br.readLine();
                i++;
            }
            System.out.println("優：" + superiorityCount + "人");
            System.out.println("良：" + goodCount + "人");
            System.out.println("可：" + yesCount + "人");
            System.out.println("追加課題：" + additionalAssignmentCountCount + "人");
            System.out.println("補修：" + repairCount + "人");

        }

        catch(Exception e) {
            e.getMessage();
        }
    }
}
