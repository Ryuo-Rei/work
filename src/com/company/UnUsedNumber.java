package com.company;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 2020/09/04 16:25 ~
public class UnUsedNumber {

    final static String FILE_PATH = "C:\\Users\\ryuorei\\Desktop\\Git\\work\\test.txt";
    final static String OUTPUTFILE_PATH = "C:\\Users\\ryuorei\\Desktop\\Git\\work\\outputText.txt";
    final static String OUTPUTFILE_PATH2 = "C:\\Users\\ryuorei\\Desktop\\Git\\work\\outputText2.txt";

    public void ReadFile(String path) {
        Path file = Paths.get(path);
        List<String> fileContentList = null;
        try {
            fileContentList = Files.readAllLines(file);

        } catch (Exception e) {
            System.out.println("ファイル読込みに失敗しました。");
        }
        for (int i = 0; i < fileContentList.size(); i++) {
            System.out.println(fileContentList.get(i));
        }

        OutputFile(fileContentList);
    }

    public void OutputFile(List<String> fileContentList) {
        List<String> text = new ArrayList<String>();
        int[] countList = new int[10];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fileContentList.size(); i++) {
            text.add(CheckNumber(fileContentList.get(i)));
            countList = CountNumber(fileContentList.get(i), countList);
        }

        try {
            File file = new File(OUTPUTFILE_PATH);
            File file2 = new File(OUTPUTFILE_PATH2);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FileWriter fw = new FileWriter(OUTPUTFILE_PATH, false);
            fw.write(String.valueOf(text));

            fw.close();
            FileWriter fw2 = new FileWriter(OUTPUTFILE_PATH2, false);
            fw2.write(Arrays.toString(countList));
            fw2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String CheckNumber(String text) {
        String str = "";
        for (int j = 0; j <= 9; j++) {
            int num = text.indexOf(Integer.toString(j));
            if (num == -1) {
                str += "" + j;
            }
        }
        if (str == null || str.equals("")) {
            return "none\r\n";
        } else {
            return str + "\r\n";
        }
    }


    public int[] CountNumber(String text, int[] countList) {
        char targetChar = '0';
        int count = 0;
        for(int i = 0; i <= 9; i++) {
            targetChar = Integer.toString(i).charAt(0);
            count = 0;
            for(int j = 0; j < text.length(); j++) {
                if(text.charAt(j) == targetChar) {
                    count++;
                }
            }
            countList[i] += count;
        }
        return countList;
    }


}
